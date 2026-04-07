package shape;

public class ExString {
    int radius;
    public String name;

    public ExString(int radius){
        this.radius=radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }
}
