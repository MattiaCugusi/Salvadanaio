package com.example;
public class Cestino {
    int valore;

    public Cestino(int valore) {
        this.valore = valore;
    }

    public int getValore() {
        return valore;
    }

    public void aggiungiMoneta(){
        valore++;
    }


}

