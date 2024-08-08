//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    String house = "FreeHold TownHouse";
    String SemiHouse = "Semi-Deatched with finished basement";
    String Detached = "Two finish basement Detached house";
    String Town = "Simple three story townHouse";


    public void diplay(){
        System.out.println("When I was looking for " + house +
                ", I have seen "+ SemiHouse + " & also ,"
                + Detached + "," + Town +".");
    }



    public static void main(String[] args) {

        Main m1 = new Main();
        Main m2 = new Main();
        Main m3 = new Main();
        Main m4 = new Main();

        m1.diplay();
        m2.diplay();
        m3.diplay();
        m4.diplay();
    }
}