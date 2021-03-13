package pasha.edu;

public class Main {
public static int getArea(int length , int width){
    return length * width;

}
    public static void main(String[] args) {
// linear programming
	int length = 2;
	int width = 3;
	int area = length * width;
        System.out.println(area);
        //imperative programming
        area = getArea(2,3);
        //OOP
        Rectangle r1 = new Rectangle(3 , 4);
        String s1 = "hello";
        Rectangle r2 = new Rectangle();
        r2.setLength(5);
        r2.setWidth(6);
        System.out.println(r1.getLength());
        r1.getArea();
        r2.getArea();
        System.out.println(r2.toString());
        System.out.println(r1.toString());
        int area2 = Rectangle.getArea(3 ,4);
        int p2 = r1.getPerimetr();
    }

}
