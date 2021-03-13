package pasha.edu;

/*
@USER: Java02
@DATE: 13.03.2021
@NAME: Rectangle
*/
public class Rectangle {
    //fields definition
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getArea(){
        return width * length;
    }
    public static int getArea(int width , int length){
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle is" + "\n" +
                "length = " + length + '\n' +
                "width = " + width
                ;
    }
    public int getPerimetr (){
        return width * 2 + length * 2;
    }
    public double getDioganale (){
        return Math.sqrt(width * width + length * length);

    }
}
