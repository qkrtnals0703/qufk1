import java.util.Scanner;

public class forIf {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        for(int i=0; i<n; i++){
            if (arr[i] < x){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
