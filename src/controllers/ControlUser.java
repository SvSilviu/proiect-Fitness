package controllers;

import models.User;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlUser {

    private ArrayList<User> userArrayList = new ArrayList<>();

    public ControlUser() {
        loadUser();
    }


    public void loadUser() {

        this.userArrayList.clear();

        try {
            File file = new File("C:\\mycode\\oop\\incapsualrea\\ProiectSala\\src\\data\\users");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String text = scanner.nextLine();
                User user = new User(text);
                userArrayList.add(user);
            }

        }catch (Exception exception){

            exception.printStackTrace();
        }

    }
    public void afisare(){
        for (User user : userArrayList) {
            System.out.println(user.descriereaUserului());
        }
    }

    public User usernameSiParola(String userName,String parola){
        for(User user :userArrayList){
            if(user.getEmail().equals(userName)&&user.getParola().equals(parola)){
                return user;
            }
        }
        return null;
    }

    public String toSave() {

        String text = "";
        for (User u : userArrayList) {
            text += u.toSave() + "\n";
        }
        return text;
    }

    public int size() {
        return this.userArrayList.size();
    }

    public void save(){

        try {
            File file = new File("C:\\mycode\\oop\\incapsualrea\\ProiectSala\\src\\data\\users");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(toSave());
            printWriter.close();
        }catch (Exception e){

        }

    }

    public void add(User user){

        this.userArrayList.add(user);
    }

}
