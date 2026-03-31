public class Mahasiswa09 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    //KONSTRUKTOR DEFAULT
    Mahasiswa09() {
    }

    //KONSTRUKTOR BERPARAMETER (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    public Mahasiswa09(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi(){
        System.out.println("Nama : " +nama);
        System.out.println("NIM  : " +nim);
        System.out.println("Kelas: " +kelas);
        System.out.println("IPK  : " +ipk);
    }
}
