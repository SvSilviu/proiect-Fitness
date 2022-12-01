package controllers;

import models.Abonamente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ControlAbonamenteTest {

@Test
    public void testLoadAbonamente(){

    Abonamente abonamente = new Abonamente("abonament","forta",12,3);
    ControlAbonamente controlAbonamente = new ControlAbonamente();
    int initialSize = controlAbonamente.size();
    controlAbonamente.addAbonament(abonamente);
    controlAbonamente.toSave();
    controlAbonamente.loadAbonamente();

    assertEquals(initialSize,controlAbonamente.size());

}

}
