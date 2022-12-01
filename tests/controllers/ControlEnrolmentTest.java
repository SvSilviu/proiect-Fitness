package controllers;

import models.Enrolment;
import org.junit.jupiter.api.Test;

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





}
