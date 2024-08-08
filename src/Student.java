public class Student {

    //properties
    String name;
    int id;
    //static variable
    static String college ="Sheridan";

    //constructor


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //method
    public void displayInformation(){
        System.out.println("My name is " + name + " & " +
                ", ID is "+id +", College is " +college);
    }
    public static void main(String[] args) {

        Student s1 = new Student(123,"Asma" );
        Student s2 = new Student(456,"Deep");
        Student s3 = new Student(789,"Fayza");
        Student s4 = new Student(786,"Love");

        s1.displayInformation();
        s2.displayInformation();
        s3.displayInformation();
        s4.displayInformation();

    }
}
