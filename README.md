[JadwalServiceKendaraan.java](https://github.com/user-attachments/files/22257539/JadwalServiceKendaraan.java)# Laporan-Post-Test-PBO-1
# DESKRIPSI PROGRAM
## 1.Fitur Utama
- CRUD: Program mampu melakukan operasi Create, Read, Update, dan Delete pada data service kendaraan.
- Manajemen Data Kendaraan: Mengelola informasi kendaraan yang akan diservice, seperti nomor polisi, merk, dan jenis kendaraan.

## 2. STRUKTUR DATA
- ArrayList: Digunakan untuk menyimpan data jadwal service kendaraan dalam bentuk array of String, di mana setiap array merepresentasikan satu data service.
- String Arrays: Setiap jadwal service disimpan sebagai array dengan format [Nomor Polisi, Nama Pemilik, Merk Kendaraan, Jenis Service, Tanggal Service].

## 3. ALUR PROGRAM
- Program menampilkan menu utama dengan opsi-opsi CRUD (Tambah Jadwal, Lihat Jadwal, Update Jadwal, Hapus Jadwal, Keluar).
- Pengguna dapat memilih opsi untuk menambah jadwal service baru, melihat daftar jadwal service, mengupdate data service yang sudah ada, atau menghapus data service.
- Setiap opsi akan memandu pengguna melalui proses input data (nomor polisi, nama pemilik, merk kendaraan, jenis service, tanggal) dengan validasi sederhana agar data tidak kosong.
- Program menggunakan ArrayList<String[]> untuk menyimpan seluruh data jadwal service, di mana setiap array merepresentasikan satu data service.
- Program akan terus berjalan dan kembali ke menu utama sampai pengguna memilih opsi keluar.

  ## 4. KESIMPULAN
- Program Sistem Manajemen Jadwal Service Kendaraan mampu melakukan pengelolaan data jadwal service dengan operasi CRUD menggunakan ArrayList<String[]>. Program ini memudahkan pengguna untuk menambah, melihat, mengupdate, dan menghapus data service secara sederhana dan terstruktur.

# PENJELASAN ALUR PROGRAM
1. Tampilan awal
   
    <img width="805" height="206" alt="image" src="https://github.com/user-attachments/assets/e59a3a1f-4b93-4edf-a935-3c695d6955be" />

Gambar diatas merupakan tampilan awal dari menu awal program ketika dijalankan

2. Jika inputnya salah

    <img width="753" height="336" alt="image" src="https://github.com/user-attachments/assets/e5ef62fd-8076-4396-8f99-92780f7032e1" />

    Jika pengguna memasukkan angka di luar opsi(1-5) di menu yang ada, maka menu akan diulang, pengguna diminta untuk menginput lagi

3. Menampilkan tambah jadwal service

   <img width="731" height="282" alt="image" src="https://github.com/user-attachments/assets/db4244a6-a218-44fe-bf41-6f31e5d4b733" />

   - Program meminta pengguna untuk menginput nama pemilik kendaraan
   - Lalu pengguna diminta menginput jenis kendaraan contoh seperti yang saya masukkan yaitu mobil
   - Selanjutnya pengguna diminta untuk menginput tanggal service contoh: 20-02-2020
   - Terakhir, pengguna diminta untuk memasukkan jenis service contoh: ganti oli
   - Setelah semua data dimasukkan, program menyimpan data tersebut ke dalam daftar service
   - Program menampilkan pesan “Data service berhasil ditambahkan!” sebagai konfirmasi.

4. Mellihat jadwal service

   <img width="893" height="342" alt="image" src="https://github.com/user-attachments/assets/ee5e34fd-b337-4db7-9bd8-b28b3f19001f" />

   - Ketika pengguna menginput no 2 maka akan tampil menu melihat jadwal  service
   - selanjutnya, Sistem menampilkan daftar seluruh jadwal service kendaraan yang telah tersimpan di dalam program.
   - Setiap entri jadwal service ditampilkan secara berurutan, dimulai dari nomor 1, 2, dan seterusnya, sesuai dengan data yang sudah di tambhkan di awal tadi
   - selanjutnya, jika kita ingin melihat hanya cukup dengan 1 data saja maka pengguna cukup menginputkan data yang sudah diurutkan dengan angka 1,2 dan seterusnya

5. Ubah jadwal service

   <img width="853" height="314" alt="image" src="https://github.com/user-attachments/assets/6d221084-c9d7-42ee-ad40-e93a633cfb91" />

   - maka Sistem meminta pengguna untuk memasukkan nomor data jadwal service yang ingin diubah misalnya: 2
   - Setelah nomor dipilih, pengguna diminta mengisi data baru yang berisikan: nama pemilik baru, jenis kendaraan baru, tanggal service baru, jenis service baru.
   - Data yang ada pada nomor tersebut kemudian diupdate/diganti sesuai inputan pengguna
   - Terakhir,sistem mengonfirmasi dengan pesan "Data berhasil diubah" jika proses berjalan sukses

6. Hapus Jadwal service

   <img width="1009" height="264" alt="image" src="https://github.com/user-attachments/assets/de4485e7-f980-4c7b-9859-4347ddb7a6e8" />

   - jika pengguna memmilih pilihan ini maka pengguna akan menghapus jadwal service
   - selanjutnya, pengguna diminta untuk mengiinputkan nomor data yang ingin dihapuus contohnya: 2
   - Setelah memasukkan nomor data yang ingin dihapuskan tadi, maka proggram akan mengonfirmasi dengan pesan "Data berhasil  dihapus" jika proses berjalan lancar

7. Menu keluar

   <img width="1162" height="303" alt="image" src="https://github.com/user-attachments/assets/ded60fad-dd03-4cc4-9f09-d8440b289e32" />

   - jika pengguna sudah selesai atau tidak mempunyai kepenntingan maka bisa  memilih menu keluar
   - maka program akan mengkonfirmasi dengan pesan "Program selesai. TERIMA KASIH"
  
# FULL KODE:

[Uploading JadwalServiceKendaraan.ja/*
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
va…]()

     




  

   





