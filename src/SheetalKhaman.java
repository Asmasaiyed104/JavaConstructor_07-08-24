public class SheetalKhaman {

    String khaman;
    String SevKhamanee;
    String DalKheera;
    String Dhokhla;
    int price;

    void dispalyInfo(){
        System.out.println("My Khaman is " + khaman +" & SevKhamanee is " + SevKhamanee +" & Dal Kheera is " + DalKheera +", Dhokha is " + Dhokhla + ", All prices are :" + price + "." );
    }

    public SheetalKhaman(String khaman, String sevKhamanee, String dalKheera, String dhokhla, int price) {
        this.khaman = khaman;
        SevKhamanee = sevKhamanee;
        DalKheera = dalKheera;
        Dhokhla = dhokhla;
        this.price = price;
    }

    public static void main(String[] args) {
        SheetalKhaman sk1 = new SheetalKhaman("Teekha","sweet","sour","white",150);
        SheetalKhaman sk2 = new SheetalKhaman("Mola","hot","fresh","yellow",200);
        SheetalKhaman sk3 = new SheetalKhaman("Nylon","sour","cold","sandwich",250);
        SheetalKhaman sk4 = new SheetalKhaman("Simple","sweet","fermented","Teerangi",350);

        sk1.dispalyInfo();
        sk2.dispalyInfo();
        sk3.dispalyInfo();
        sk4.dispalyInfo();


    }
}
