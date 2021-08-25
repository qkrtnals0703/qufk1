import java.awt.*;
import java.util.Scanner;

class Phone2 {
    private String name,tel;

    public Phone2(String name, String tel){
        this.name = name;
        this.tel = tel;
    }

    public String getName(){
        return name;
    }

    public String getTel(){
        return tel;
    }
}
public class PhoneManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("인원수>>");
        int n = sc.nextInt();
        Phone2 [] phone2 = new Phone2[n];

        for (int i = 0; i < n; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            phone2[i] = new Phone2(sc.next(), sc.next());
        }
        System.out.println("저장되었습니다...");

        label : while (true){
            System.out.print("검색할 이름 >>");
            String serchName = sc.next();

            for(int i=0; i < n; i++){
                if(serchName.equals("exit")){
                    break label;
                }
                else if(serchName.equals(phone2[i].getName())){
                    System.out.println(phone2[i].getName() + "의 번호는 " + phone2[i].getTel() + " 입니다.");
                }
                else if(!serchName.equals(phone2[i].getName()) && i == (n-1)){
                    System.out.println(serchName + "이(가) 없습니다.");
                }
            }
        }
        System.out.println("프로그램을 종료합니다...");
    }
}

