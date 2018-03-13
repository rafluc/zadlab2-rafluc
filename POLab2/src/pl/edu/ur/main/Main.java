package pl.edu.ur.main;

/**
 *
 * @author a
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
		int zadanie;
        Scanner forzadanie = new Scanner(System.in);
        do {
            System.out.println("podaj wartosc zadania , 0 przerywa petle \n"
                    + "1 - zadanie 3\n"
                    + "2 - zadanie 4\n"
                    + "3 - zadanie 6\n"
                    + "4 - zadanie 7");

            zadanie = forzadanie.nextInt();
            if (zadanie == 0) {
                System.out.println("0 konczy petle");
            } else if (zadanie == 1) {
                double[] x = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj dane do " + (i + 1) + " komórki tablicy: ");
            Scanner fortab = new Scanner(System.in);
            x[i] = fortab.nextDouble();
        }

        int z;
        Scanner forx = new Scanner(System.in);

        do {
            System.out.println("podaj wartosc zadania od 1 do 4, 0 przerywa petle \n"
                    + "1 - Wyświetlanie tablicy od pierwszego do ostatniego indeksu.\n"
                    + "2 - Wyświetlanie tablicy od ostatniego do pierwszego indeksu.\n"
                    + "3 - Wyświetlanie elementów o nieparzystych indeksach.\n"
                    + "4 - Wyświetlanie elementów o parzystych indeksach.");

            z = forx.nextInt();

            if (z == 1) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Wartość elementu [" + i + "] = " + x[i]);

                }
            } else if (z == 2) {
                for (int i = 9; i >= 0; i--) {
                    System.out.println("Wartość elementu[" + i + "] = " + x[i]);

                }
            } else if (z == 3) {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 1) {
                        System.out.println("Wartość elementu[" + i + "] = " + x[i]);
                    }
                }
            } else if (z == 4) {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Wartość elementu[" + i + "] = " + x[i]);
                    }
                }

            } else if (z == 0) {
                System.out.println("Koniec programu");
            } else {
                System.out.println("Blad");
            }

        } while (z != 0);
            } else if (zadanie == 2) {
               double[] x = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj dane do " + (i + 1) + " komórki tablicy: ");
            Scanner fortab = new Scanner(System.in);
            x[i] = fortab.nextDouble();
        }
        int z;
        double sum = 0;
        double ilo = 1;
        double sre;
        double min;
        double max;
        Scanner forz = new Scanner(System.in);
        do {
            System.out.println("Podaj nr zadania (0 konczy petle) \n"
                    + "1 - Oblicz sume elementow tablicy\n"
                    + "2 - Oblicz iloczyn elementow tablicy\n"
                    + "3 - Wyznacz wartosc srednia\n"
                    + "4 - Wyznacz wartosc minimalna\n"
                    + "5 - Wyznacz wartosc maksymalna\n");
            z = forz.nextInt();
            if (z == 0) {
                System.out.println("0 konczy petle");
            } else if (z == 1) {
                for (int i = 0; i < 10; i++) {
                    sum += x[i];
                }
                System.out.println("Suma = " + sum);
            } else if (z == 2) {
                for (int i = 0; i < 10; i++) {
                    ilo *= x[i];
                }
                System.out.println("Iloczyn = " + ilo);
            } else if (z == 3) {
                for (int i = 0; i < 10; i++) {
                    sum += x[i];
                }
                sre = sum / 10;
                System.out.println("Srednia = " + sre);
            } else if (z == 4) {
                min = x[0];

                for (int i = 0; i < 10; i++) {
                    if (x[i] < min) {
                        min = x[i];
                    }
                }
                System.out.println("Min = " + min);
            } else if (z == 5) {

                max = x[0];
                for (int i = 0; i < 10; i++) {
                    if (x[i] > max) {
                        max = x[i];
                    }
                }
                System.out.println("Max = " + max);
            } else {
                System.out.println("Blad");
            }
        } while (z != 0);
            } else if (zadanie == 3) {
int abc;
        Scanner forabc = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj liczbe: (<0 konczy program)");
            abc = forabc.nextInt();
            if (abc < 0) {
                break;
            }
        }
            } else if (zadanie == 4) {
                int ile;
        System.out.println("tablica - ile elementow");
        Scanner forile = new Scanner(System.in);
        ile = forile.nextInt();
        int[] x = new int[ile];
        int p;
        boolean z = true;

        for (int i = 0; i < ile; i++) {
            System.out.println("Podaj " + (i + 1) + " element tablicy: ");
            x[i] = forile.nextInt();
        }
        for (int i = 0; i < ile; i++) {
            System.out.println("Podaj dane do " + (i + 1) + " komórki tablicy: ");
            Scanner fortab = new Scanner(System.in);
            x[i] = fortab.nextInt();
        }
        
        while (z) {
            z=false;
            for (int i = 1; i < ile; i++) {

                if (x[i] < x[i - 1]) {
                    p = x[i - 1];
                    x[i - 1] = x[i];
                    x[i] = p;
                    z=true;

                }
            }
        }

        for (int i = 0; i < ile; i++) {
            System.out.println("T[" + i + "] = " + x[i]);
        }
            } else {
                System.out.println("blad");
            }

        } while (zadanie != 0);
    }
}
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
 /*
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
         
    } */
