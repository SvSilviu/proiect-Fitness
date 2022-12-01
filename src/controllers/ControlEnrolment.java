package controllers;

import models.Enrolment;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlEnrolment {

    ArrayList<Enrolment> enrolmentArrayList = new ArrayList<>();

    public ControlEnrolment() {

        loadEnrolment();

    }

    public void loadEnrolment() {

        this.enrolmentArrayList.clear();

        try {
            File file = new File("C:\\mycode\\oop\\incapsualrea\\ProiectSala\\src\\data\\abonamente.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                Enrolment enrolment = new Enrolment(text);
                enrolmentArrayList.add(enrolment);
            }
        } catch (Exception exception) {

        }

    }

    public String toSave() {
        String text = "";
        for (Enrolment e : enrolmentArrayList) {
            text += e.toSave() + "\n";

        }
        return text;
    }

    public ArrayList<Enrolment> listaEnrolmenturilor(int clientID) {

        ArrayList<Enrolment> enrolments = new ArrayList<>();
        for (Enrolment enrolment : enrolmentArrayList) {
            if (enrolment.getUserId() == clientID) {
                enrolments.add(enrolment);
            }
        }
        return enrolments;
    }

    public int size() {
        return this.enrolmentArrayList.size();
    }

    public void addEnrolment(Enrolment enrolment) {
        this.enrolmentArrayList.add(enrolment);
    }

    public void save() {

        try {
            File file = new File("C:\\mycode\\oop\\incapsualrea\\ProiectSala\\src\\data\\enrolment.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(toSave());
            printWriter.close();
        } catch (Exception e) {

        }
    }


}
