public class MinumanDingin {

    private Minuman Minuman;

    public MinumanDingin(Minuman Minuman) {
        this.Minuman = Minuman;
    }

    void Esteh(){
        this.Minuman.Minuman_dingin();
    }

    void Kopi(){
        this.Minuman.Minuman_panas();
    }

    void Aqua(){
        this.Minuman.Air_mineral();
    }

    void Dimsum(){
        this.Minuman.Makanan();
    }
}