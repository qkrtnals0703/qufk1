import java.util.Scanner;

class Player{
    private String name;
    public Player(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class WordGameApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("게임에 참가하는 인원은 몇명입니까? >> ");
        int pNum = scanner.nextInt();
        Player p[] = new Player[pNum];

        for(int i=0; i<pNum; i++){
            System.out.print("참가자의 이름을 입력하세요 >> ");
            p[i] = new Player(scanner.next());
        }
        System.out.println("아버지");
        int i = 0;
        String word = "아버지";
        int lastIndex = word.length() - 1;
        char lastChar = word.charAt(lastIndex);
        char firstChar = word.charAt(0);
        while (true){
            System.out.print(p[i].getName() + ">> ");
            String nextword = scanner.next();
            firstChar = nextword.charAt(0);
            if(lastChar != firstChar) {
                System.out.println(p[i].getName() + "이 졌습니다.");
                return;
            }
            lastIndex = nextword.length() - 1;
            lastChar = nextword.charAt(lastIndex);
            i++;
            if(i > 2) {
                i = 0;
            }
        }
    }
}
