package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();

        //TODO tady bude kód
        zofka.setPenColor(Color.decode("100011"));

        nakresliPrasatko();

    }



    public void nakresliPrasatko() {
        zofka.turnLeft(90);

        this.nakresliDomecek();
        zofka.turnRight(35);

        this.nakresliNozicky();
        zofka.turnRight(125);
        zofka.move(150);
        zofka.turnRight(125);

        this.nakresliNozicky();
        zofka.turnRight(35);

        this.nakresliOcasek();
    }

    public void nakresliDomecek() {
        for (int i = 0; i < 2; i++) {
            zofka.move(150);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
        zofka.move(150);
        zofka.turnRight(45);
        zofka.move(Math.sqrt(2) * 50);
        zofka.turnRight(90);
        zofka.move(Math.sqrt(2) * 50);
        zofka.turnRight(135);
        zofka.move(100);
    }

    public void nakresliNozicky() {
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(110);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
    }

    public void nakresliOcasek() {
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(90);
    }

}
