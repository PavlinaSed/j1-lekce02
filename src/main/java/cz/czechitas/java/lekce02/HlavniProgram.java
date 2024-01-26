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

        novaPoziceDolu();
        novaPoziceDoprava();
        nakresliPrasatko();

        novaPoziceSlunicko();
        nakresliSlunicko();

        novaPozicePrvniDomecek();
        nakresliDomecek();

        novaPoziceNahoru();
        nakresliDomecek();
        for (int i = 0; i < 4; i++) {
            novaPoziceDoprava();
            nakresliDomecek();
        }

        novaPozicePosledniDomecek();
        nakresliDomecek();

        zofka.penUp();
        zofka.move(500);
        zofka.turnLeft(90);
        zofka.move(320);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliPismenoP();
        novaPozicePismeno();
        nakresliPismenoA();
        novaPozicePismeno();
        nakresliPismenoV();
        novaPozicePismeno();
        nakresliPismenoK();
        novaPozicePismeno();
        nakresliPismenoA();
    }


    public void nakresliPrasatko() {
        zofka.turnLeft(90);

        this.nakresliDomecek();
        zofka.move(150);
        zofka.turnLeft(55);

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
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnRight(180);
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
        zofka.move(230);
        zofka.penDown();
    }

    public void novaPoziceDoprava() {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    public void novaPoziceDolu() {
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(400);
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

    public void novaPoziceSlunicko() {
        zofka.penUp();
        for (int i = 0; i < 4; i++) {
            this.novaPoziceDoleva();
        }
        zofka.penUp();
        zofka.move(550);
        zofka.penDown();


    }

    public void novaPozicePosledniDomecek() {
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(230);
        zofka.turnLeft(180);
        zofka.penDown();
    }

    public void novaPozicePrvniDomecek() {
        this.novaPoziceDolu();
        this.novaPoziceDoleva();
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(150);
        zofka.turnRight(180);
        zofka.penDown();
        zofka.turnRight(5);
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

    public void nakresliPismenoP() {
        zofka.move(100);
        zofka.turnRight(90);

        for (int i = 0; i < 5; i++) {
            zofka.move(10);
            zofka.turnRight(90);
            zofka.move(5);
            zofka.turnLeft(90);
        }
        zofka.turnRight(90);
        zofka.move(20);
        zofka.turnRight(90);

        for (int i = 0; i < 5; i++) {
            zofka.move(10);
            zofka.turnLeft(90);
            zofka.move(5);
            zofka.turnRight(90);
        }
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(180);
    }

    public void nakresliPismenoA() {
        zofka.turnRight(25);
        zofka.move(110);
        zofka.turnRight(135);
        zofka.move(105);
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(65);
        zofka.move(35);
        zofka.turnRight(180);
        zofka.move(35);
        zofka.turnRight(65);
        zofka.move(60);
        zofka.turnLeft(160);
    }

    public void nakresliPismenoV() {
        zofka.turnLeft(25);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(135);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnRight(160);
    }

    public void nakresliPismenoK() {
        zofka.move(100);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(40);
        zofka.move(70);
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnRight(85);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(45);
        zofka.move(60);
        zofka.turnLeft(180);
    }

    public void novaPozicePismeno() {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(55);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    /*
    public void nakresliOsmiUhelnik() {
        for (int i = 0; i < 8; i++) {
            zofka.turnRight(45);
            zofka.move(30);
        }
        zofka.turnLeft(5);
    }
*/
}
