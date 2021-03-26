package homework10;

public class employees {
    private String name;
    private int year_of_joining;
    private String adress;
    private int salary;

    public employees(String name, int year_of_joining, String adress) {
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.adress = adress;
    }

    public static void main(String[] args) {
        employees employees1=new employees("ropert",1994,"wall");
        employees employees2=new employees("sami",1998,"wall33");
        employees employees3=new employees("david",1984,"wall44");
        System.out.println("Name"+"    "+"Year of joining"+"   "+"Adress");
        System.out.println(employees1.name+"     "+employees1.year_of_joining+"            "+employees1.adress);
        System.out.println(employees2.name+"       "+employees2.year_of_joining+"            "+employees2.adress);
        System.out.println(employees3.name+"     "+employees3.year_of_joining+"            "+employees3.adress);
    }
}
