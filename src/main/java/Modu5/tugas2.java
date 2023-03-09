package Modu5;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class tugas2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] data = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        System.out.println("Data Awal : "+Arrays.toString(data));
        Arrays.sort(data);
        System.out.println("Sorting  : "+Arrays.toString(data));
        System.out.print("Masukan angka yang akan dicari indexnya : ");
        int find = inp.nextInt();
        PrintStream printf = System.out.printf("Data Ditemukan Pada Index ke - " + IntStream.range(0, data.length).filter(i -> find == data[i]).findFirst());
    }}
