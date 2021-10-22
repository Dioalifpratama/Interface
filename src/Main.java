import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // membuat objek HP
        Minuman Kopi = new MinumanPanas();

        // membuat objek user
        MinumanDingin dian = new MinumanDingin(Kopi);

        // kita coba nyalakan HP-nya
        dian.Esteh();

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("*** MENU ***");
            System.out.println("[1] Minuman Dingin");
            System.out.println("[2] Minuman Panas");
            System.out.println("[3] Air Mineral");
            System.out.println("[4] Makanan");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih Menu> ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                dian.Esteh();
            } else if (aksi.equalsIgnoreCase("2")){
                dian.Kopi();
            } else if (aksi.equalsIgnoreCase("3")){
                dian.Aqua();
            } else if (aksi.equalsIgnoreCase("4")){
                dian.Dimsum();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih Menu yang salah!");
            }
        }

    }

}