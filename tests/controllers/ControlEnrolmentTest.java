package controllers;

import models.Enrolment;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ControlEnrolmentTest {

    @Test
    public void testLoadEnrolment(){

        Enrolment enrolment = new Enrolment(1,2,3);
        ControlEnrolment controlEnrolment = new ControlEnrolment();
        int initialSize = controlEnrolment.size();
        controlEnrolment.addEnrolment(enrolment);
        controlEnrolment.save();
        controlEnrolment.loadEnrolment();
        assertEquals(initialSize,controlEnrolment.size());

    }
@Test
    public void testAfisareEnrolmenturi(){

    ControlEnrolment controlEnrolment = new ControlEnrolment();
    Enrolment enrolment = new Enrolment(1, 2, 1);
    Enrolment enrolment1 = new Enrolment(2, 2, 1);

    controlEnrolment.addEnrolment(enrolment);
    controlEnrolment.addEnrolment(enrolment1);
    ArrayList<Enrolment> enrolmentArrayList = controlEnrolment.listaEnrolmenturilor(2);

    boolean verificare = true;

    for (Enrolment e : enrolmentArrayList) {
        if (e.getUserId() == 2) {
            verificare = false;
        }
    }
    assertEquals(verificare, true);

}




}
