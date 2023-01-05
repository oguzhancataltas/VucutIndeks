import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double boy,kilo,vIndex;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz (Örnek : 1,72) : ");
        boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu (Kilogram cinsinden) giriniz (Örnek : 80.0) : ");
        kilo = scanner.nextDouble();

        vIndex = kilo / (boy * boy);

        System.out.print("Vücut Kitle İndeksiniz : " + vIndex);
    }
}
