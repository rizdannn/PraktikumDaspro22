package Jobsheeet5;

import java.util.Scanner;

public class switchcetakKRS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" - - - cetak KRS SIAKAD - - - ");
        System.out.println("Masukkan semester saat ini: ");
        int Semester = sc.nextInt();
        
        switch (Semester) {
            case 1:
                System.out.println("KRS Semester 1 ditampilkan");
                break;
            case 2:
                System.out.println("KRS Semester 2 ditampilkan");
                break;
            case 3:
                System.out.println("KRS Semester 3 ditampilkan");
                break;
            case 4:
                System.out.println("KRS Semester 4 ditampilkan");
                break;
            case 5:
                System.out.println("KRS Semester 5 ditampilkan");
                break;
            case 6:
                System.out.println("KRS Semester 6 ditampilkan");
                break;
            case 7:
                System.out.println("KRS Semester 7 ditampilkan");
                break;
            case 8:
                System.out.println("KRS Seemester 8 ditampilkan");
                break;

        }
        
    }
}
