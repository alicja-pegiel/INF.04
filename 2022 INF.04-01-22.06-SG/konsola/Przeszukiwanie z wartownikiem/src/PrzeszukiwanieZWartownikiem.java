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

    public int szukajElementu(int szukanyElement) {
        int indeksElementu = rozmiarTablicy;
        tablicaLiczb[indeksElementu] = szukanyElement;
        for (int i = 0; i < rozmiarTablicy; i++) {
            if (tablicaLiczb[i] == szukanyElement) {
                indeksElementu = i;
                break;
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
