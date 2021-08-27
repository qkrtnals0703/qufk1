import java.util.Scanner;

public class Array_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int intArray[] = new int[10];
        int n = 0;
        System.out.print("정수 10개 입력>>");

        for(int i=0; i<intArray.length; i++){
            intArray[i] = scanner.nextInt();
            if(intArray[i]%3==0){
                System.out.print(intArray[i] + " ");
            }
        }
        scanner.close();
    }
}
