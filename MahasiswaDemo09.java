import java.util.Scanner;
public class MahasiswaDemo09 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi09 list = new MahasiswaBerprestasi09();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa09 m = new Mahasiswa09(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("Data Mahasiswa sebelum Sorting: ");
        list.tampil();

        list.bubbleSort();

        System.out.println("Data Mahasiswa setelah sorting (DESC): ");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

    }
}
