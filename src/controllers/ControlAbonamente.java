package controllers;

import models.Abonamente;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlAbonamente {

    private ArrayList<Abonamente> abonamenteArrayList = new ArrayList<>();

    public ControlAbonamente() {
        loadAbonamente();
    }

    public void loadAbonamente() {

       try {
           File file =new File("C:\\mycode\\oop\\incapsualrea\\ProiectSala\\src\\data\\abonamente.txt");

           Scanner scanner = new Scanner(file);

           while (scanner.hasNextLine()){

               String text = scanner.nextLine();
               Abonamente abonamente = new Abonamente(text);

               abonamenteArrayList.add(abonamente);
           }
           System.out.println("Abonamentele au fost incarcate !");

       }catch (Exception exception){

       }

    }

    public void afisareAbonamente() {
        for (int i = 0; i < abonamenteArrayList.size(); i++) {
            System.out.println(abonamenteArrayList.get(i).descriereaAbonamentului());
        }
    }

}
