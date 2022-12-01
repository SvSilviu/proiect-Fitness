package models;

public class Abonamente {

    private String numeAbonament = "";
    private String tipAbonament = "";
    private int durataMin = 0;
    private int idAbonat = 0;

    public Abonamente(String numeAbonament, String tipAbonament, int durataMin, int idAbonat) {
        this.numeAbonament = numeAbonament;
        this.tipAbonament = tipAbonament;
        this.durataMin = durataMin;
        this.idAbonat = idAbonat;
    }

    public Abonamente(String text){
        String[] proprietati = text.split(",");
        this.idAbonat = Integer.parseInt(proprietati[0]);
        this.numeAbonament = proprietati[1];
        this.tipAbonament = proprietati[2];
        this.durataMin = Integer.parseInt(proprietati[3]);
    }
    public Abonamente(){

    }

    public void setNumeAbonament(String numeAbonament) {
        this.numeAbonament = numeAbonament;
    }

    public String getNumeAbonament() {
        return this.numeAbonament;
    }

    public void setTipAbonament(String tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public String getTipAbonament() {
        return this.tipAbonament;
    }

    public void setDurataMin(int durataMin) {
        this.durataMin = durataMin;
    }

    public int getDurataMin() {
        return this.durataMin;
    }

    public void setIdAbonat(int idAbonat) {
        this.idAbonat = idAbonat;
    }

    public int getIdAbonat() {
        return this.idAbonat;
    }

    public String descriereaAbonamentului() {

        String text = "";
        text += "Id abonat - " + idAbonat + "\n";
        text += "Nume abonament - " + numeAbonament + "\n";
        text += "Tip abonament - " + tipAbonament + "\n";
        text += "Durata in minute - " + durataMin + "\n";


        return text;

    }
    public String toSave(){
        return this.idAbonat + "," + this.numeAbonament + "," + tipAbonament + "," + durataMin;
    }

}