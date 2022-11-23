package controllers;

import models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ControlUserTest {

    @Test
    public void testLoadUser() {
        User user = new User(20, "Nume", "Prenume", "e-mail", "parola", 44, "Instructor");
        ControlUser controlUser = new ControlUser();
        int initialSize = controlUser.size();
        controlUser.add(user);
        controlUser.save();
        controlUser.loadUser();
        assertEquals(initialSize + 1, controlUser.size());
    }

    @Test
    public void testUserNameSiParola() {

        ControlUser controlUser = new ControlUser();
        User user = new User(23, "nume", "prenume", "email", "parola", 33, "instructor");
        controlUser.add(user);
        User user2 = controlUser.usernameSiParola("email", "parola");
        assertEquals(user2, controlUser.usernameSiParola("email", "parola"));

    }

    @Test
    public void testUserSiParolaNullScenario() {

        ControlUser controlUser = new ControlUser();
        assertEquals(null, controlUser.usernameSiParola("sdsadasda", "dassadas"));

    }

}
