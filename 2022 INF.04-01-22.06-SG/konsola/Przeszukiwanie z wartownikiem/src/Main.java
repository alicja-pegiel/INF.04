import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrzeszukiwanieZWartownikiem algorytm = new PrzeszukiwanieZWartownikiem();
        algorytm.uzupelnijTablice();
        System.out.print("Podaj liczbę do wyszukania: ");
        Scanner scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        algorytm.wynikDzialania(element);

        System.out.println("\nTESTY:");
        System.out.println("Liczba poza zakresem: -1");
        algorytm.wynikDzialania(-1);
        System.out.println("Liczba poza zakresem: 101");
        algorytm.wynikDzialania(101);
        System.out.println("Liczba z połowy zakresu: 50");
        algorytm.wynikDzialania(50);
    }
}