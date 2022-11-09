package controllers;

import models.Enrolment;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlEnrolment {

    ArrayList<Enrolment> enrolmentArrayList = new ArrayList<>();

    public ControlEnrolment() {

        loadEnrolment();

    }

    public void loadEnrolment() {

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

    public ArrayList<Enrolment> listaEnrolmenturilor(int clientID) {

        ArrayList<Enrolment> enrolments = new ArrayList<>();
        for (Enrolment enrolment : enrolmentArrayList) {
            if (enrolment.getUserId() == clientID) {
                enrolments.add(enrolment);
            }
        }
        return enrolments;
    }


}
