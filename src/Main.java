//napisz kod ktory ze scannera wybiera jakas nazwe wycina 2 litery ze srodka i wrzuca je na poczatek

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj nazwe: ");
        String nazwa = scanner.nextLine();
        if(nazwa.length() >= 4){
            int srodek = nazwa.length() / 2;
            String wycieteLitery = nazwa.substring(srodek - 1, srodek + 1);
            String nowaNazwa = wycieteLitery.concat(nazwa);
            System.out.println("Nowa nazwa: " + nowaNazwa);
        }   else {
            System.out.println("Podaj dluzsza nazwe!");
        }
    }
}
