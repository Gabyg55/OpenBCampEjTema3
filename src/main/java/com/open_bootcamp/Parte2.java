package com.open_bootcamp;

public class Parte2 {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        System.out.println(miCoche.puertas);
    }

}
class Coche {
    public int puertas = 0;

    public void AgregarPuertas() {
        this.puertas++;
    }
}
