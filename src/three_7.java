public class three_7 {
    public static void main(String[] args){
        for(int i=1; i<=99; i++){
            int a = i/10;  //몫
            int b = i%10;  //나머지

            if(a == 0 && b%3 == 0) {
                System.out.println(i + " 박수한번");
            } //10이전

            else if(a%3 != 0 && b%3 == 0){
                if(a%3 != 0 && b != 0){
                    System.out.println(i + " 박수한번");
                }
            } //10이후에 3의 배수 아닐때

            else if(a%3 == 0 && b == 0){
                System.out.println(i + " 박수한번");
            }  //10이후에 10의 자리수가 3의 배수이고 나머지가 0일때

            else if(a%3 == 0 && b%3 == 0){
                System.out.println(i + " 박수두번");
            } //10이후에 10의 자리도 3의 배수 1의 자리도 3의 배수
        }
    }
}
