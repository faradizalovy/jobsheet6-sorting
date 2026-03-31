import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen09 list = new DataDosen09();

        int pilih;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia termuda)");
            System.out.println("4. Sorting DSC (Usia tertua)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode         : ");
                    String kd = sc.nextLine();
                    System.out.print("Nama         : ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = sc.nextLine();

                    boolean jk;
                    if (jkInput.equalsIgnoreCase("L")) {
                        jk = true;
                    } else {
                        jk = false;
                    }
                    System.out.print("Usia         : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen09 d = new Dosen09(kd, nm, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC!");
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC!");
                    break;
            }

        } while (pilih != 0);
    }
}
