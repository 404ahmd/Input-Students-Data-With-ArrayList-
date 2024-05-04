import java.util.ArrayList;
import java.util.Scanner;

public class InputDataMahasiswa {
    /*
    membuat variabel bernama "input"
     untuk merepresentasikan kelas Scanner
    */
    Scanner input = new Scanner(System.in);

    /*
    membuat variable "dataMahasiswa"
    yang merepresentasikan kumpulan array
    dari kelas Mahasiswa
    */
    ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();

    /*sebuah function yang bekerja untuk menyimpan data mahasiswa*/
    void saveData(){
        System.out.println("Masukan nama : "); /*mengambil nama mahasiswa yang akan diinputkan user*/
        String name = input.nextLine();

        System.out.println("Masukan nim : "); /*mengambil nim mahasiswa yang akan diinputkan user*/
        String nim = input.nextLine();

        /*
        membiuat variable "mahasiswa" dari kelas Mahasiswa
        dengan parameter nama dan nim yang tadi diinputkan user
        */
        Mahasiswa mahasiswa = new Mahasiswa(name, nim);

        dataMahasiswa.add(mahasiswa); /*menyimpan semua nama dan nim yang diinputkan user */

    }

   /*membuat function untuk menampilkan data*/
    void showData(){
        System.out.println("===== DATA MAHASISWA =====");

        /*
        loop foreach dengan nama variable "mahasiswa"
        dan akan menampilkan data yang ada paa variabel "dataMahasiswa'
        */
        for (Mahasiswa mahasiswa : dataMahasiswa){
            System.out.println("NAMA : " + mahasiswa.getName() +" || "+"NIM : " + mahasiswa.getNim());
        }
    }

}
