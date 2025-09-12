import java.util.Scanner;

public class SortowaniePrzezWybieranie {
    public int[] tablicaLiczb = new int[10];

    public void wczytajLiczby() {
        System.out.println("Podaj 10 liczb do tablicy:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            tablicaLiczb[i] = scanner.nextInt();
        }
    }

    public void wypiszTablice() {
        for (int i = 0; i < 10; i++) {
            System.out.print(tablicaLiczb[i] + " ");
        }
        System.out.println();
    }

    /**
     * nazwa funkcji:           szukajIndeksMaks
     * parametry wejściowe:     indeks - przechowuje całkowitą wartość, czyli indeks elementu tablicy od którego
     *                          rozpoczynamy jej przeszukiwanie.
     * wartość zwracana:        indeksMaks - funkcja zwraca wartość całkowitą, przechowującą indeks największego
     *                          znalezionego elementu tablicy.
     * autor:                   00000000000
     */
    private int szukajIndeksMaks(int indeks) {
        int indeksMaks = indeks;
        for (int i = indeks; i < 10; i++) {
            if (tablicaLiczb[i] > tablicaLiczb[indeksMaks]) {
                indeksMaks = i;
            }
        }
        return indeksMaks;
    }

    /**
     * nazwa funkcji:           sortuj
     * parametry wejściowe:     brak
     * wartość zwracana:        brak
     * autor:                   00000000000
     */
    public void sortuj() {
        int temp;
        for (int i = 0; i < 10; i++) {
            int indeksMaks = szukajIndeksMaks(i);
            temp = tablicaLiczb[i];
            tablicaLiczb[i] = tablicaLiczb[indeksMaks];
            tablicaLiczb[indeksMaks] = temp;
        }
    }
}
