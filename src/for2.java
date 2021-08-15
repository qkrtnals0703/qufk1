import java.util.Scanner;

public class for2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1; i<=9; i++) {
            System.out.print(n+" * "+i+" = "+n*i);
            System.out.println();
        }
    }
}
