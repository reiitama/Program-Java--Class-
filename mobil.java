package praktikum;

import java.util.Scanner;

public class mobil {
    String jumlahBan, 
    merkMobil, 
    jenisBahanBakar, 
    warnaMobil,
    inputGas;
    int cekMobil;

    Scanner input = new Scanner(System.in);

    void gas() {
        System.out.println("Masukkan Suara Gas : ");
        inputGas = input.next();
        System.out.println("Suara Gas Mobil : " + inputGas);
        System.out.println("\n");
    }

    void checkMobil() {
        System.out.println("Masukkan Kondisi Mobil : ");
        cekMobil = input.nextInt();
        System.out.println("Kondisi Mobil Anda di Angka : " + cekMobil);
        if (cekMobil >= 80) {
            System.out.println("Mobil perlu diservis!");
        } else {
            System.out.println("Mobil tidak perlu diservis!");
        }
        System.out.println("\n");
    }

    void infoMobil() {
        System.out.println("Masukkan Jumlah Ban : ");
        jumlahBan = input.next();
        System.out.println("Masukkan Merk Mobil : ");
        merkMobil = input.next();
        System.out.println("Masukkan Jenis Bahan Bakar : ");
        jenisBahanBakar = input.next();
        System.out.println("Masukkan Warna Mobil : ");
        warnaMobil = input.next();

        System.out.println("\n");

        System.out.println("Info Jumlah Ban : " + jumlahBan);
        System.out.println("Info Merk Mobil : " + merkMobil);
        System.out.println("Info Jenis Bahan Bakar : " + jenisBahanBakar);
        System.out.println("Info Warna Mobil : " + warnaMobil);
        System.out.println("Info Pengecekan Mobil : " + cekMobil);
        if (cekMobil >= 80) {
            System.out.println("Mobil perlu diservis!");
        } else {
            System.out.println("Mobil tidak perlu diservis!");
        }
    }
}