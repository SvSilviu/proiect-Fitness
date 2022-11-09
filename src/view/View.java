package view;

import controllers.ControlAbonamente;
import controllers.ControlEnrolment;
import controllers.ControlUser;

import java.util.Scanner;

public class View {

    private Scanner scanner = new Scanner(System.in);
    private ControlEnrolment controlEnrolment = new ControlEnrolment();
    private ControlUser controlUser = new ControlUser();
    private ControlAbonamente controlAbonamente =new ControlAbonamente();

    public void meniu(){

        System.out.println("Apasati tasta 1 pentru a afisa abonamentele disponibile");
        System.out.println("Apasati tasta 2 pentru a afisa userii");

    }

    public void play(){
        boolean run = true;
        int alegere = 0;
        while (run==true){
            meniu();
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere){
                case 1:
                    afisareAbonamente();
                    break;
                case 2:
                    afisareUseri();
                    break;
                default:
            }
        }
    }

    public void afisareAbonamente(){

       controlAbonamente.afisareAbonamente();

    }
    public void afisareUseri(){
        controlUser.afisare();
    }

}
