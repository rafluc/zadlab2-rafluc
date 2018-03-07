package pl.edu.ur.main;

/**
 *
 * @author marcin
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7

        /* int d = 0;
        while (d != 0) {
         System.out.println("podaj wartosc");
        Scanner odczyt = new Scanner(System.in);
        d = odczyt.nextInt();

        switch (d) {
            case 1:
                System.out.println("sty");
                break;
            case 2:
                System.out.println("lut");
                break;
            case 3:
                System.out.println("marz");
                break;
            case 4:
                System.out.println("kwi");
                break;
            case 5:
                System.out.println("maj");
                break;
            case 6:
                System.out.println("cze");
                break;
            case 7:
                System.out.println("lip");
                break;
            case 8:
                System.out.println("sie");
                break;
            case 9:
                System.out.println("wrz");
                break;
            case 10:
                System.out.println("paz");
                break;
            case 11:
                System.out.println("list");
                break;
            case 12:
                System.out.println("gru");
                break;
            default:
                System.out.println("zla wart");
        }}
        
         */
 /*int i = 0;
        int a = 0;
        int skok;
        Scanner odczyt = new Scanner(System.in);
        skok = odczyt.nextInt();
        do {
            a += skok;
            i++;
            System.out.println("iteracja" + i);
            System.out.println("a" + a);
        } while (a < 1000);*/
 /* for (int i = 20; i >= 0; i--) {
            if (i == 2 || i == 6 || i == 9 || i == 15 || i == 19) {
                continue;
            } else {
                System.out.println(i);
            }
        }
         */
        int a = 1, b = 2, c = 1;

        double x1, x2, delta;
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("delta ujemna");
        } else if (delta == 0) {
            x1 = -b / 2 * a;
            System.out.println("x1=" + x1);
        } else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / 2 * a;
            x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("x1=" + x1 + "x2=" + x2);

        }
    }
}
