package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();
        zofka.setLocation(100.0,100.0);
        kolecko(3, Color.yellow);
    }

    public void ctverec(double velikostStrany, Color barva){
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            zofka.move(velikostStrany);
            zofka.turnRight(90);
        }
    }
    public void trojuhelnik(double velikostStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 3; i++) {
            zofka.move(velikostStrany);
            zofka.turnRight(120);
        }
    }

    public void rovnoramennyTrojuhelnik(double velikostStrany, Color barva) {
        zofka.setPenColor(barva);
        zofka.move(velikostStrany);
        zofka.turnRight(90);
        zofka.move(velikostStrany);
        var velikostPrepony = Math.sqrt(2*Math.pow(velikostStrany, 2));
        zofka.turnRight(135);
        zofka.move(velikostPrepony);

    }

    public void obdelnik(double velikostStranyA, double velikostStranyB, Color barva){
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStranyA);
            zofka.turnRight(90);
            zofka.move(velikostStranyB);
            zofka.turnRight(90);
        }
    }

    public void kolecko(double velikost, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 75; i++) {
            zofka.move(velikost);
            zofka.turnRight(5);

        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
