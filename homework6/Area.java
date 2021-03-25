package homework6;

public class Area {
    int lenght, breadht;



    public void setDim(int lenght, int breadht) {

    }

    public int getArea() {
        int area = lenght * breadht;
        return area;
    }

    public static void main(String[] args) {
        Area rectenglar1 = new Area();
        int bredht1 = rectenglar1.breadht = 5;
        int breadht2 = rectenglar1.lenght = 6;
        rectenglar1.setDim(bredht1, breadht2);
        int area1 = rectenglar1.getArea();
        System.out.println("area of rectanglar:" + area1);
    }
}
