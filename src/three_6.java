import java.util.Scanner;

public class three_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

        while (true){
            System.out.print("영어 단어를 입력하세요>>");
            String eWord = sc.next();

            if(eWord.equals("exit")){
                System.out.print("종료합니다...");
                break;
            }
            else{
                for(int i=0; i<eng.length; i++){
                    if(eWord.equals(eng[i])){
                        System.out.println(kor[i]);
                        break;
                    }
                    else if(!eWord.equals(eng[i]) && i == 4){
                        System.out.println("그런 영어 단어는 없습니다.");
                    }
                }
            }
        }
    }
}
