package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();

        //zmrzlina

        zofka.setLocation(100.0,300.0);
        zofka.turnLeft(30);
        trojuhelnik(160, Color.black);
        zofka.setLocation(35.0,190.0);
        kolecko(7, Color.black);

        //snehulak
        zofka.setLocation(300.0,100.0);
        kolecko(4, Color.blue);
        zofka.setLocation(280.0,230.0);
        kolecko(6, Color.blue);
        zofka.setLocation(260.0,400.0);
        kolecko(8, Color.blue);
        zofka.setLocation(220.0,200.0);
        kolecko(2, Color.blue);
        zofka.setLocation(410.0,200.0);
        kolecko(2, Color.blue);

        //masinka
        zofka.setLocation(800.0,400.0);
        zofka.turnRight(30);
        obdelnik(140,90, Color.red);
        kolecko(4, Color.red);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(130);
        zofka.penDown();
        zofka.turnRight(90);
        obdelnik(70,130, Color.red);
        zofka.turnLeft(45);
        rovnoramennyTrojuhelnik(50, Color.red);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(20);
        zofka.penDown();
        kolecko(2, Color.red);
        zofka.penUp();
        zofka.move(60);
        zofka.penDown();
        kolecko(2, Color.red);

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
        for (int i = 0; i < 72; i++) {
            zofka.move(velikost);
            zofka.turnRight(5);

        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
