import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        //zad9



        //zad1
        System.out.println();
        System.out.println("podaj liczbę ciagu");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Suma n kolejnych liczb naturalnych to: " + zad1(n));


        //zad2
        System.out.println();
        System.out.println("podaj liczbę ciagu");
        int przez3 = in.nextInt();
        System.out.println("Suma n kolejnych liczb naturalnych podzielnych przez 3 to: " + zad2(przez3));

        //zad3
        System.out.println();
        System.out.println("podaj parzyste k");
        int k = in.nextInt();
        System.out.println("podaj liczbę ciagu");
        int przez2 = in.nextInt();
        System.out.println("Suma n kolejnych liczb parzystych zaczynając od k to: " + zad3(przez2, k));


        //zad9
        System.out.println();
        System.out.println("suma pięciocyfrowych liczb podzielnych przez 7 to: "+zad9());


    }

    public static int zad1(int n) {
        int wynik = 0;
        for (int i = 1; i <= n; i++) {
            wynik = wynik + i;
        }
        return wynik;
    }

    public static int zad2(int n) {
        int wynik = 0;
        for (int i = 1; i <= n; i++) {
            wynik = wynik + 3 * i;
        }
        return wynik;
    }

    public static int zad3(int przez2, int k) {
        int wynik = 0;
        for (int i = 1; i <= przez2; i++) {
            wynik = wynik + 2 * i + k - 2;
        }
        return wynik;
    }

    public static int zad9() {

        int wynik = 0;
        for (int i = 10_000; i < 100_000; i++) {
            if (i % 7 == 0)


                wynik += i;
        }
        return wynik;
    }
}