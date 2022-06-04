/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2;
import java.util.Scanner;
/**
 *
 * @author EgaRam
 */
public class restoMain_15 {
    public static void main(String[] args) {
    doublelinkedlist_15 dbl = new doublelinkedlist_15();
    Scanner sc = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    
    System.out.println("======== QUIZ 2 PRAKTIKUM ASD TI - 1F ========");
    System.out.println("Dibuat oleh : ");
    String nama = in.nextLine();
    System.out.println("NIM : ");
    int nim = sc.nextInt();
    System.out.println("Absen : ");
    int absen = sc.nextInt();
        
    char pilih;
    int menu;
    do {
        System.out.println("Pilihan Menu");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan pesanan by nama");
        System.out.println("5. Hitung total pendapatan");
        System.out.println("6. Keluar");
        System.out.print("Masukkan Pilihan Menu (1-6): ");
        menu = sc.nextInt();
        System.out.println("");
        if (menu < 1 || menu > 6) {
            System.out.println("Masukkan Pilihan Menu Yang Benar!");
        }

        switch (menu) {
            case 1: {
                do {
                    System.out.println("--------------------------");
                    System.out.print("Masukkan Data Pembeli");
                    System.out.println("--------------------------");
                    System.out.print("Nomor Antrian    : ");
                    int kp = sc.nextInt();
                    System.out.print("Nama Customer    : ");
                    String namaPembeli = in.nextLine();
                    System.out.print("Nomor Hp         : ");
                    int nh = sc.nextInt();
                    System.out.print("Apakah anda ingin menambah data baru?(y/n) : ");
                    pilih = sc.next().charAt(0);
                    dbl.addFirst(kp, namaPembeli, nh);
                    System.out.println("");
                } while (pilih == 'y' || pilih == 'Y');
            }
            break;
            case 2: {
                dbl.print();
                System.out.println("");
                break;
            }
            case 3: {
                dbl.removeFirst();
                System.out.println("");
            }
            break;
            case 4: {
                dbl.selectionSort();
                break;
            }
            case 5 : {
                
                break;
            }
            case 6: {
                System.out.println("Anda Telah Keluar");
                System.exit(0);
            }
        }
    } while (menu > 0 && menu < 7);
    }
}
