import java.util.Scanner;

public class three_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("알파벳 한 문자를 입력하세요>>");
        String s = scanner.next();
        char c = s.charAt(0);

        for(int i = 'a'; i <= c; i++){
            if(i <= c){
                System.out.print((char)i);
            }
            for(int j = i+1; j<= c; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
