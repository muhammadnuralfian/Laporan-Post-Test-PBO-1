/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jadwalservicekendaraan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JadwalServiceKendaraan {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        ArrayList<String[]> daftarService = new ArrayList<>();
        int pilihan;

        // Tambahkan data default
        daftarService.add(new String[]{"pian", "Mobil", "2025-09-15", "Ganti Oli"});
        daftarService.add(new String[]{"alfian", "Motor", "2025-09-20", "Service Ringan"});
        daftarService.add(new String[]{"bangpian"
                , "Truk", "2025-09-25", "Tune Up"});

        do {
            System.out.println("\n=== Sistem Manajemen Jadwal Service Kendaraan ===");
            System.out.println("1. Tambah Jadwal Service");
            System.out.println("2. Lihat Jadwal Service");
            System.out.println("3. Ubah Jadwal Service");
            System.out.println("4. Hapus Jadwal Service");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1: // CREATE
                    System.out.print("Masukkan nama pemilik: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan jenis kendaraan: ");
                    String kendaraan = input.nextLine();
                    System.out.print("Masukkan tanggal service: ");
                    String tanggal = input.nextLine();
                    System.out.print("Masukkan jenis service: ");
                    String service = input.nextLine();

                    String[] data = {nama, kendaraan, tanggal, service};
                    daftarService.add(data);
                    System.out.println("Data service berhasil ditambahkan!");
                    break;

                case 2: // READ
                    if (daftarService.isEmpty()) {
                    System.out.println("Belum ada data service.");
                } else {
                    System.out.println("\n================ < Daftar Jadwal Service > ================");
                    for (int i = 0; i < daftarService.size(); i++) {
                        System.out.println((i + 1) + ". Nama Pemilik  : " + daftarService.get(i)[0] +
                                           "\n   Kendaraan    : " + daftarService.get(i)[1] +
                                           "\n   Tgl Service  : " + daftarService.get(i)[2] +
                                           "\n   Jenis Service: " + daftarService.get(i)[3]);
                        System.out.println("---------------------------------------------------------");
                    }
                }
                break;

                case 3: // UPDATE
                    System.out.print("Masukkan nomor data yang ingin diubah: ");
                    int ubah = input.nextInt();
                    input.nextLine();

                    if (ubah > 0 && ubah <= daftarService.size()) {
                        String[] d = daftarService.get(ubah - 1);
                        System.out.print("Nama pemilik baru: ");
                        d[0] = input.nextLine();
                        System.out.print("Jenis kendaraan baru: ");
                        d[1] = input.nextLine();
                        System.out.print("Tanggal service baru: ");
                        d[2] = input.nextLine();
                        System.out.print("Jenis service baru: ");
                        d[3] = input.nextLine();
                        System.out.println("Data berhasil diubah");
                    } else {
                        System.out.println("Nomor data tidak valid.");
                    }
                    break;

                case 4: // DELETE
                    System.out.print("Masukkan nomor data yang ingin dihapus: ");
                    int hapus = input.nextInt();
                    input.nextLine();

                    if (hapus > 0 && hapus <= daftarService.size()) {
                        daftarService.remove(hapus - 1);
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        System.out.println("Nomor data tidak valid.");
                    }
                    break;

                case 5: // EXIT
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
   
}
