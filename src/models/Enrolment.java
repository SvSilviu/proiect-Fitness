package models;

public class Enrolment {

    private int id = 0;
    private int abonatId = 0;
    private int userId = 0;

    public Enrolment(int id, int abonatId, int userId) {
        this.id = id;
        this.userId = userId;
        this.abonatId = abonatId;
    }

    public Enrolment(String text){

        String[] proprietati = text.split(",");
        this.id= Integer.parseInt(proprietati[0]);
        this.abonatId = Integer.parseInt(proprietati[1]);
        this.userId = Integer.parseInt(proprietati[2]);

    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setAbonatId(int abonatId) {
        this.abonatId = abonatId;
    }

    public int getAbonatId() {
        return this.abonatId;
    }

    public String descriereInchiriere() {
        String text = "";
        text += "Id - " + id + "\n";
        text += "User Id - " + userId + "\n";
        text += "Abonat Id - " + abonatId + "\n";

        return text;

    }

    public String toSave() {
        return this.id + "," + this.abonatId + "," + this.userId;
    }

}
