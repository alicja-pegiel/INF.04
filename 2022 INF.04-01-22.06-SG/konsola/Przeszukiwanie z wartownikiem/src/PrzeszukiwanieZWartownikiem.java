import java.util.Random;

public class PrzeszukiwanieZWartownikiem {
    public int rozmiarTablicy = 50;
    private final int[] tablicaLiczb = new int[rozmiarTablicy+1];

    public void uzupelnijTablice() {
        Random random = new Random();
        for (int i = 0; i < rozmiarTablicy; i++) {
            tablicaLiczb[i] = random.nextInt(100) + 1;
        }
    }

    public void wyswietlTablice() {
        System.out.print("Zawartość tablicy: ");
        for (int i = 0; i < rozmiarTablicy-1; i++) {
            System.out.print(tablicaLiczb[i] + ", ");
        }
        System.out.println(tablicaLiczb[rozmiarTablicy-1]);
    }

    /*
    nazwa funkcji:          szukajElementu
    argumenty:              szukanyElement - Przechowuje liczbę całkowitą, czyli element poszukiwany w tablicy.
    typ zwracany:           int indeksElementu - Zwracana jest liczba całkowita, czyli indeks elementu odnalezionego
                            w tablicy.
    informacje:             Funkcja umieszcza poszukiwany element na końcu tablicy, a następnie przeszukuje tablicę, by
                            odnaleźć jego pierwsze wystąpienie i zwrócić jego indeks. Jeśli szukanego elementu nie ma w
                            tablicy, funkcja zwraca wartownika, czyli indeks wstawionego elementu.
    autor:                  00000000000
     */
    public int szukajElementu(int szukanyElement) {
        int indeksElementu = rozmiarTablicy;
        tablicaLiczb[indeksElementu] = szukanyElement;
        for (int i = 0; i < rozmiarTablicy; i++) {
            if (tablicaLiczb[i] == szukanyElement) {
                indeksElementu = i;
                return indeksElementu;
            }
        }
        return indeksElementu;
    }

    public void wynikDzialania(int element) {
        int wartownik = szukajElementu(element);
        wyswietlTablice();
        if (wartownik != rozmiarTablicy) {
            System.out.println("Indeks pierwszego wystąpienia elementu " + element + " to " + wartownik);
        }
        else {
            System.out.println("Element " + element + " nie znajduje się w tablicy");
        }
    }
}
