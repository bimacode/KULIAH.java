package MODUL4;

import java.util.Scanner;
import java.util.Scanner ;
public class Convert {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah hari: ");
        int day = in.nextInt();
        int tahun, bulan, hari, x;
        tahun = (day / 365);
        x = day % 365;
        bulan = x / 30;
        hari = x % 30;
        extract(day, tahun, bulan, hari);
    }

    private static void extract(int day, int tahun, int bulan, int hari) {
        System.out.print(day);
        System.out.println(" Hari= " + tahun + " Tahun " + bulan + " Bulan " + hari + " Hari");
    }
}





