//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SortowaniePrzezWybieranie program = new SortowaniePrzezWybieranie();
        program.wczytajLiczby();
        System.out.print("Tablica przed sortowaniem: ");
        program.wypiszTablice();
        program.sortuj();
        System.out.print("Tablica po sortowaniu: ");
        program.wypiszTablice();
    }
}