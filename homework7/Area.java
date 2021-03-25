package homework7;

public class Area {
    int lenght,breadht;

    public Area(int lenght, int breadht) {
        this.lenght = lenght;
        this.breadht = breadht;
    }
    public int returnArea(){
        int area=lenght*breadht;
        return area;
    }

    public static void main(String[] args) {
        Area rectanglar=new Area(5,4);
        System.out.println("the area of rectenglar:"+rectanglar.returnArea());
    }
}
