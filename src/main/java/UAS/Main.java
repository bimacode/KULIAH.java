package UAS;
/**

 @author M.Bima Mauludin 202110370311193
  *Program ini bertujuan untuk menampung input dari user secara acak dan menyimpan hasil input tersebut ke dalam database.
  *User dapat memasukkan input berupa angka atau string, dan input akan disimpan ke dalam array sesuai dengan tipe input yang dimasukkan.
  *User dapat menghentikan input dengan memasukkan kata "STOP".
  *Setelah input dihentikan, program akan menampilkan semua data yang sudah dimasukkan, dan menyimpan data tersebut ke dalam file.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
// Membuat objek scanner untuk menerima input dari user
        Scanner scanner = new Scanner(System.in);
        // Membuat array untuk menampung input berupa angka
        ArrayList<Integer> inNumber = new ArrayList<Integer>();

        // Membuat array untuk menampung input berupa string
        ArrayList<String> inString = new ArrayList<String>();

        // Selama input belum dihentikan, teruskan loop
        while (true) {
            try {
                // Tampilkan untuk menerima input dari user
                System.out.print("Masukkan input: ");

                // Baca input dari user dan memasukan inputan user ke variable scanner
                String input = scanner.nextLine();

                // Jika input adalah "STOP" maka looping akan berhenti
                if (input.equals("STOP")) {
                    break;
                }

                // Jika input adalah angka, data akan masuk ke array inNumber
                else if (input.matches("\\d+")) {
                    inNumber.add(Integer.parseInt(input));
                }

                // Jika input adalah string, data akan masuk ke array inString
                else {
                    inString.add(input);
                }
            } catch (Exception e) {
                // Jika terjadi error pada saat menerima input akan menampilkan pesan error
                System.out.println("Input tidak valid!");
            }
        }

        // Menampilkan semua data yang sudah dimasukkan
        System.out.println("Data yang sudah dimasukkan:");
        System.out.println("Nomor: " + inNumber);
        System.out.println("String: " + inString);
        try {
            // Membuat objek FileWriter untuk menyimpan data ke file data.txt
            FileWriter writer = new FileWriter("data.txt");

            // Tuliskan data yang sudah dimasukkan ke dalam file
            writer.write("Nomor: " + inNumber + "\n");
            writer.write("String: " + inString + "\n");

            // Tutup file
            writer.close();
        } catch (Exception e) {
            // Jika terjadi error saat menyimpan data ke file
        }}}