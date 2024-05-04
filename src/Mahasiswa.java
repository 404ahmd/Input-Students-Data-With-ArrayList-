public class Mahasiswa {
    String name; /*menambahkan atribut yang akan digunakan datam data mahasiswa*/
    String nim;

   /* constructure yang dibutuhkan pada kelas mahasiswa*/
    public Mahasiswa(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    /*method yang digunakan untuk menyimpan nama mahasiswa*/
    public String getName(){
        return name;
    }

    /*method yang digunakan untuk menyimpan nim mahasiswa*/
    public String getNim(){
        return nim;
    }
}
