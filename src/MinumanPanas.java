public class MinumanPanas implements Minuman {

    private int Harga;
    private boolean isMinuman_dingin;

    public MinumanPanas() {
        // set Harga
        this.Harga = 10000;
    }

    @Override
    public void Minuman_dingin() {
        isMinuman_dingin = true;
        System.out.println("Es Teh");
        System.out.println("Es Kopi");
        System.out.println("Es Cingcau");
    }

    @Override
    public void Minuman_panas() {
        isMinuman_dingin = false;
        System.out.println("Kopi Panas");
    }

    @Override
    public void Air_mineral() {
        if (isMinuman_dingin) {
            if (this.Harga == MAX_Harga) {
                System.out.println("Pesan sesuatu");
                System.out.println("Tidak Bisa Memesan Lagi!! " + this.getHarga() + "%");
            } else {
                this.Harga += 10000;
                System.out.println("Total Harga: " + this.getHarga());
            }
        } else {
            System.out.println("Aqua");
        }
    }

    @Override
    public void Makanan() {
        if (isMinuman_dingin) {
            if (this.Harga == MIN_Harga) {
                System.out.println("Harga = 0%");
            } else {
                this.Harga -= 10000;
                System.out.println("Total Harga: " + this.getHarga());
            }
        } else {
            System.out.println("Dimsum");
        }
    }

    public int getHarga() {
        return this.Harga;
    }

}