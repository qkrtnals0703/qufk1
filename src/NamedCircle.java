import java.util.NavigableMap;

class Circle5 {
    private int radius;
    public Circle5(int radius) { this.radius = radius; }
    public int getRadius() { return radius;}
}

public class NamedCircle extends Circle5 {
    private String name;
    public NamedCircle (int radius, String name){
        super(radius);
        this.name = name;
    }
    public void show(){
        System.out.println(name + "," + "반지름 = " + getRadius());
    }
    public static void main(String[] args){
        NamedCircle w = new NamedCircle(5,"waffle");
        w.show();
    }
}
