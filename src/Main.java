import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /*
    membuat variabel bernama "input"
     untuk merepresentasikan kelas Scanner
    */
        Scanner input = new Scanner(System.in);

        /*
        * mebuat variable "inputDataMahasiswa" dari kelas "InputDataMahasiswa"
        */
        InputDataMahasiswa inputDataMahasiswa = new InputDataMahasiswa();

        char lanjut;
        /*perulangan dowhile yang akan bekerja pada saat user ingin mlanjutkan input data
        * jika user selesai dan tidak melanjutkan mengisi data maka program akan menampilkan semua data
        */
       do {
            System.out.println("Berapa jumlah data mahasiswa yang akan diinput : ");
            int jumlah = input.nextInt();
            for (int i = 1; i <= jumlah; i++){
                inputDataMahasiswa.saveData();
            }
            System.out.println("apakah anda ingin melanjutkan ?? (Y/T)");
            lanjut = input.next().charAt(0);

            }while (Character.toUpperCase(lanjut)== 'Y');

       inputDataMahasiswa.showData();
        }
    }
