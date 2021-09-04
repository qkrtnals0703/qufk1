class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}
class Line extends Shape {
    public void draw(){
        System.out.println("Line");
    }
}

class Rect2 extends Shape {
    public void draw(){
        System.out.println("Rect");
    }
}

class Circle4 extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}
public class MethodOverridingEx {
    static void paint(Shape p){
        p.draw();
    }
    public static void main(String[] args){
        Line line = new Line();
        paint(line);

        paint(new Shape());
        paint(new Line());
        paint(new Rect2());
        paint(new Circle4());
    }
}
