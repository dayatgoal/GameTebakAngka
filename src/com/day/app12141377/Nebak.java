package com.day.app12141377;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Nebak {
    public static void main(String[] args) {
        ArrayList <String> namaPlayer = new ArrayList<>(); // Membuat array Nama Pemain
        ArrayList <Integer> nilaiPermainan = new ArrayList<>(); // Membuat array Sekor Pemain
        Scanner input = new Scanner(System.in); // Input pertama
        Scanner input2= new Scanner(System.in); // Input kedua
        Random angkaRandom=new Random(); // Mengacak angka
        String cariY; // Untuk mencari nilai Y, jika input y, maka otomatis akan keluar
        do{
            System.out.println("Masukkan 'Nama' anda atau tekan 'y' untuk keluar, kemudian tekan enter = ");
            cariY=input.nextLine();
            namaPlayer.add(cariY);
            int NilaiJalan = 0; // Variabel nilai 
            int CekGameOver=0; // Cek Game over. bernilai 1 jika GameOver
        }