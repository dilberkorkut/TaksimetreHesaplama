import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, starterPrice = 10, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilometre Giriniz: " );
        km = input.nextInt();

        total = (km * perKm) ;
        total += starterPrice;

        total = (total<20) ? 20 : total;
        System.out.println("Toplam Tutar: " +total );
    }
}