import java.util.Scanner;
public class alan {
    public static void main(String[] args) {
        Scanner xax = new Scanner(System.in);
        int Akenar,Bkenar,Ckenar;
        double alan ,sonuc;
        System.out.print("A kenarı giriniz:");
        Akenar= xax.nextInt();
        System.out.print("B kenarı giriniz:");
        Bkenar= xax.nextInt();
        System.out.print("C Kenarı giriniz:");
        Ckenar= xax.nextInt();
        int cevre=((Akenar+Bkenar+Ckenar)/2);
        alan=cevre*(cevre-Akenar)*(cevre-Bkenar)*(cevre-Ckenar);
        sonuc =Math.sqrt(alan);
        System.out.println("Üçgenin Alanı:"+sonuc);
    }

    }

