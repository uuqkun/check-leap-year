import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Pilih Menu [1: jalankan program, 2: keluar]: ");
        int key = input.nextInt();

        switch (key) {
            case 1:
                getInput();
                System.out.println("Program selesai...");
                break;
            case 2: 
                System.out.println("Program selesai...");
                break;
            default:
                break;
        }
    }

    static void getInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun pertama: ");
        int year_1 = input.nextInt();
        System.out.print("Masukkan tahun kedua( > pertama): ");
        int year_2 = input.nextInt();

        int selisih_tahun = year_2 - year_1; // menentukan panjang arrlist

        ArrayList<Integer> years = new ArrayList<Integer>(selisih_tahun);

        // menambahkan elemen ke dalam arrlist years
        for (int i = 0; i <= selisih_tahun; i++) {
            years.add(year_1);
            year_1 += 1;
        }

        // print semua elemen arraylist years
        for (Integer year : years) {
            leapYear(year);
        }
    }

    static void leapYear(int year) {
        // year to be checked

        boolean leap = false;

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}