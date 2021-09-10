import java.util.Scanner;

abstract class Calcualtor{
    protected int a, b;
    abstract protected int calc();
    protected void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 2개를 입력하세요>>");
        a = scanner.nextInt();
        b = scanner.nextInt();
    }
    public void run(){
        input();
        int res = calc();
        System.out.println("계산된 값은 " + res);
    }
}

class Adder extends Calcualtor{
    protected int calc(){
        return a + b;
    }
}

class Substracter extends Calcualtor {
    protected int calc(){
        return a - b;
    }
}

public class App {
    public static void main(String[] args){
        Adder adder = new Adder();
        Substracter sub = new Substracter();

        adder.run();
        sub.run();
    }
}
