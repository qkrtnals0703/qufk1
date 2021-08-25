class Circle3 {
    private int radius;
    public Circle3(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

class CircleManager{
    public static void copy(Circle3 src, Circle3 dest){
        dest.setRadius(src.getRadius());
    }


    public static boolean equals(Circle3 a, Circle3 b) {
        if(a.getRadius() == b.getRadius()){
            return true;
        }
        else
            return false;
    }
}

public class StaticTest {
    public static void main(String[] args){
        Circle3 pizza = new Circle3(5);
        Circle3 waffle = new Circle3(1);

        boolean res = CircleManager.equals(pizza, waffle);
        if(res == true)
            System.out.println("pizza와 waffle 크기 같음");
        else
            System.out.println("pizza와 waffle 크기 다름");

        CircleManager.copy(pizza, waffle);
        res = CircleManager.equals(pizza, waffle);
        if(res == true)
            System.out.println("pizza와 waffle 크기 같음");
        else
            System.out.println("pizza와 waffle 크기 다름");
    }
}
