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
      
            int aKumulasi[]= new int[6]; // Membuat array nilai tiap level permainan
            int NilaiPasJalan=0; // Varibel nilai
            // Mulai Ngegame
            if(!("y").equals(cariY)){  
              // ------------------- START SCRIPT TEBAK DISINI --------------------------  
                String nextLevel; // untuk Menaikkan Level
                int PiLevel=1;   // Untuk menentukan Level Pertama dan selanjutnya akan dinaikkan nilainya 
                System.out.println("Selamat Datang " + cariY); // Untuk memberikan sambutan kepada Pemain
                do{
                int Kout, Ang, Pang;
                    System.out.println("# Level " + PiLevel);
                    int StarNilaiO=PiLevel-1;    
                    Pang=PiLevel*100; // Menaiikan Nilai dan Angka Random pada tiap level
                    System.out.println("Silahkan Tebak Antara 1 s/d " + Pang);
                    System.out.println("Anda mempunyai kesempatan menebak 5 kali.");
                    int AngKaAcak=angkaRandom.nextInt(Pang); // Mulai mengacak Nomor
                    // Mulai Looping 5 kali kesempatan. disni malah 6 kali, karena yg ke 6 untuk memberikan variabel GameOver
                    for(Kout=0;Kout<=5;Kout++){
                        if(Kout==5){ // Jika Loop ke 6, maka dipastikan GameOver
                            System.out.println("GAMEOVER! Anda Gagal");
                            CekGameOver++; // Memberikan nilai ++ (1), untuk memunculkan game Over
                        }
                        else{  
                            System.out.println("Tebakan Anda ? " + AngKaAcak);
                            int AkuTeb=input2.nextInt(); // Menginput Tebakan
                            int Kurang=4-Kout;
                            if(AkuTeb==AngKaAcak){ // JIka inputan dan random sama
                                // Penilaian. Memberikan nilai ketika berhasil menebak, dikalikan dengan Level
                                if(Kout==0){
                                    NilaiPasJalan=PiLevel*100; // 1 x tebak, level x kan 100
                                }
                                else if(Kout==1){
                                    NilaiPasJalan=PiLevel*70; // 2 x tebak, level x kan 70
                                }
                                else if(Kout==2){
                                    NilaiPasJalan=PiLevel*50; // 3 x tebak, level x kan 50
                                }
                                else if(Kout==3){
                                    NilaiPasJalan=PiLevel*30; // 4 x tebak, level x kan 30
                                }
                                else{
                                    NilaiPasJalan=0; // 5 x tebak, level x kan 0
                                }
                                // Memberikan informasi tebakan keberapa yang telah berhasil
                                int NeTebak=Kout+1;
                                // Konfirmasi Tebakan Berhasil :)
                                System.out.println("Selamat Anda berhasil menebak Angka dalam " + NeTebak + " kali tebakan. Sekor anda adalah " + NilaiPasJalan);
                                break;

                            }