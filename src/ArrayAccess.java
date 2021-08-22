import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int intArray[];
        intArray = new int[5];
        int max = 0;
        for(int i=0; i<5; i++){
            intArray[i] = scanner.nextInt();
            if(intArray[i]>max)
                max = intArray[i];
        }
        System.out.println(max);

        scanner.close();
    }
}
