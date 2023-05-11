package MODUL4_2 ;
import java.util.HashMap;
import java.util.Scanner;

public class DataPraktikan {
    private HashMap<String, String> tabelData;
    private HashMap<String, String> tabelSesiLogin;

    public DataPraktikan() {
        tabelData = new HashMap<>();
        tabelSesiLogin = new HashMap<>();
    }

    public boolean tambahData(Scanner in) {
        while (true) {
            System.out.print("Masukkan NIM praktikan (dengan awalan IF): ");
            String nim = in.nextLine();

            if (nim.startsWith("IF")) {
                // cek apakah NIM sudah terdaftar
                if (tabelData.containsKey(nim)) {
                    System.out.println("NIM praktikan sudah terdaftar.");
                    return false;
                } else {
                    System.out.print("Masukkan nama asisten: ");
                    String namaAsisten = in.nextLine();
                    tabelData.put(nim, namaAsisten);
                    System.out.println("Data berhasil ditambahkan.");
                    return true;
                }
            } else {
                System.out.println("NIM praktikan harus dimulai dengan awalan IF.");
            }
        }
    }

    public void tampil() {
        System.out.println("Data praktikan dan asisten:");
        for (String nim : tabelData.keySet()) {
            String namaAsisten = tabelData.get(nim);
            System.out.println(nim + " Asisten: " + namaAsisten);
        }
    }

    public void listNimPraktikan() {
        System.out.println("NIM praktikan yang terdaftar:");
        for (String nim : tabelData.keySet()) {
            System.out.println(nim);
        }
    }

    public void listNamaAsisten() {
        System.out.println("Nama asisten yang terdaftar:");
        for (String namaAsisten : tabelData.values()) {
            System.out.println(namaAsisten);
        }
    }

    public void totalEmail() {
        System.out.println("total email : "+tabelData.size());
    }

    public boolean hapusData(String nimPraktikan, String namaAsisten) {
        if (tabelData.containsKey(nimPraktikan) && tabelData.get(nimPraktikan).equals(namaAsisten)) {
            tabelData.remove(nimPraktikan);
            System.out.println("Data berhasil dihapus.");
            tampil();
            return true;
        } else {
            System.out.println("Data tidak ditemukan.");
            return false;
        }
    }

    public void editData(String nimPraktikan, String namaAsisten) {
        if (tabelData.containsKey(nimPraktikan)) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan nim baru: ");
            String newNim = input.nextLine();
            System.out.print("Masukkan nama asisten baru: ");
            String newNamaAsisten = input.nextLine();
            tabelData.put(newNim, newNamaAsisten);
            tabelData.remove(nimPraktikan);
            System.out.println("Data berhasil diubah.");
            tampil();
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
    public void Login(Scanner in) {
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.print("Masukkan email: ");
            String email = in.nextLine();
            System.out.print("Masukkan password: ");
            String password = in.nextLine();

            if (tabelSesiLogin.containsKey(email) && tabelSesiLogin.get(email).equals(password)) {
                if (email.endsWith("@umm.ac.id")) {
                    System.out.println("Berikut adalah daftar fitur/metode:");
                    System.out.println("1. Tambah data");
                    System.out.println("2. Tampil data");
                    System.out.println("3. List NIM praktikan");
                    System.out.println("4. List nama asisten");
                    System.out.println("5. Total email");
                    System.out.println("6. Hapus data");
                    System.out.println("7. Edit data");
                    System.out.println("8. Logout");
                } else {
                    System.out.println("Gagal Login");
                    break;

                }
                loggedIn = true;
            } else {
                System.out.println("Email atau password salah. Silakan coba lagi.");
            }
        }
    }

    public void Logout() {
        System.out.println("Anda telah logout dari program.");
    }





    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataPraktikan data = new DataPraktikan();
        data.tabelSesiLogin.put("Praktikan@umm.ac.id","informatika21");
        data.tabelSesiLogin.put("Praktikan@gmail.com","informatika21");

        boolean selesai = false;
        while (!selesai) {
            System.out.println("Menu:");
            System.out.println("1. Login");
            System.out.println("2. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = in.nextInt();
            in.nextLine(); // consume newline character

            switch (pilihan) {
                case 1:
                    data.Login(in);
                    boolean loginSelesai = false;
                    while (!loginSelesai) {
                        System.out.print("Pilihan: ");
                        int pilihanFitur = in.nextInt();
                        in.nextLine(); // consume newline character

                        switch (pilihanFitur) {
                            case 1:
                                data.tambahData(in);
                                break;
                            case 2:
                                data.tampil();
                                break;
                            case 3:
                                data.listNimPraktikan();
                                break;
                            case 4:
                                data.listNamaAsisten();
                                break;
                            case 5:
                                data.totalEmail();
                                break;
                            case 6:
                                System.out.print("Masukkan NIM praktikan yang ingin dihapus (dengan awalan IF): ");
                                String nimPraktikan = in.nextLine();
                                System.out.print("Masukkan nama asisten yang ingin dihapus: ");
                                String namaAsisten = in.nextLine();
                                data.hapusData(nimPraktikan, namaAsisten);
                                break;
                            case 7:
                                System.out.print("Masukkan NIM praktikan yang ingin diubah (dengan awalan IF): ");
                                String nimPraktikanLama = in.nextLine();
                                System.out.print("Masukkan nama asisten yang ingin diubah: ");
                                String namaAsistenLama = in.nextLine();
                                data.editData(nimPraktikanLama, namaAsistenLama);
                                break;
                            case 8:
                                data.Logout();
                                loginSelesai = true;
                                break;
                            default:
                                System.out.println("Pilihan tidak tersedia.");
                        }
                    }
                    break;
                case 2:
                    selesai = true;
                    break;
                default:
                    System.out.println("Program berhenti");
            }
        }
    }
}

