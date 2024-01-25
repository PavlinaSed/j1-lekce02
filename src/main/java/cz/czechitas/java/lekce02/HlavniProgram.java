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

        for (int i = 0; i < 2; i++) {
            novaPoziceDolu();
            novaPoziceDoprava();
        }
        nakresliPrasatko();

        for (int i = 0; i < 6; i++) {
            novaPoziceNahoru();
            novaPoziceDoleva();
        }
        nakresliSlunicko();

        for (int i = 0; i < 2; i++) {
            novaPoziceDoprava();
        }
        nakresliOsmiUhelnik();
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
        zofka.turnRight(180);
    }

    public void novaPoziceNahoru() {
        zofka.penUp();
        zofka.move(100);
        zofka.penDown();
    }

    public void novaPoziceDoprava() {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    public void novaPoziceDolu() {
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(200);
        zofka.turnLeft(180);
        zofka.penDown();
    }

    public void novaPoziceDoleva() {
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();
    }

    public void nakresliSlunicko() {
        for (int i = 0; i < 18; i++) {
            zofka.turnRight(20);
            zofka.move(20); //tímto úměrně zvětšuješ nebo zmenšuješ poloměr sluníčka
            nakresliPaprsek();
        }
        zofka.turnLeft(5);
    }

    public void nakresliPaprsek() {
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(90);
    }

    public void nakresliOsmiUhelnik() {
        for (int i = 0; i < 8; i++) {
            zofka.turnRight(45);
            zofka.move(30);
        }
        zofka.turnLeft(5);
    }

}
