import java.util.Scanner;

class Rect {
    private int width, height;
    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return width*height;
    }
}
public class RectArray {
    public static void main(String[] args){
        Rect [] rect = new Rect[4];
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < rect.length; i++){
            System.out.print((i+1) + " 너비와 높이 >>" );
            rect[i] = new Rect(sc.nextInt(), sc.nextInt());
            sum += (int)(rect[i].getArea());
        }
        System.out.println("사각형의 전체 합은 " + sum);
    }
}
