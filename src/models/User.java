package models;

public class User {

    private int id = 0;
    private String nume = "";

    private String prenume = "";

    private int varsta = 0;

    private String email = "";

    private String parola = "";

    private String type = "";

    public User() {

    }

    public User(int id, String nume, String prenume, String email, String parola, int varsta, String type) {

        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.email = email;
        this.parola = parola;
        this.type = type;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return this.parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public User(String text) {

        String[] proprietati = text.split(",");
        this.id = Integer.parseInt(proprietati[0]);
        this.nume = proprietati[1];
        this.prenume = proprietati[2];
        this.email = proprietati[3];
        this.parola = proprietati[4];
        this.varsta = Integer.parseInt(proprietati[5]);
        this.type = proprietati[6];
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return this.nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getVarsta() {
        return this.varsta;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String descriereaUserului() {

        String text = "";
        text += "Id - " + id + "\n";
        text += "Nume - " + nume + "\n";
        text += "Prenume - " + prenume + "\n";
        text += "Varsta - " + varsta + "\n";
        text += "E-mail - " + email + "\n";
        text += "Parola - " + parola + "\n";
        text += "Type - " + type + "\n";


        return text;
    }
}
