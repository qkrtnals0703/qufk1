import java.util.Random;
import java.util.Scanner;

public class UpDown {
    public static void main(String[] args){
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        int num, min, max = 0;

        while (true) {
            min = 0;
            max = 99;
            int cnt = 1;
            int k = r.nextInt(100);

            System.out.println(min + "-" + max);
            System.out.print(cnt + ">> ");
            num = scanner.nextInt();

            while (k != num){
                if(k<num){
                    System.out.println("더 작게");
                    max = num;
                }
                else {
                    System.out.println("더 높게");
                    min = num;
                }
                cnt++;
                System.out.println(min + "-" + max);
                System.out.print(cnt + ">> ");
                num = scanner.nextInt();
            }
            System.out.println("맞았습니다.");
            System.out.print("다시 하시겠습니까(y/n)>> ");
            String text = scanner.next();

            if(text.equals("n"))
                break;
        }
    }
}
