import java.util.Scanner;

public class three_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] n = new int[10];
        int temp = 0;
        System.out.print("정수 10개 입력>>");
        for(int i=0; i<10; i++){
            n[i] = scanner.nextInt();
        }
        for(int i=0; i< n.length; i++){
            for(int j=0; j<n.length-i-1; j++){
                if(n[j]>n[j+1]){
                    temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        for(int i=0; i<10; i++){
            System.out.print(n[i] + " ");
        }
    }
}
