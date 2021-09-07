import java.util.Random;
import java.util.Scanner;

abstract class GameObject {
    protected int distance;
    protected int x, y;
    protected int px, py;

    public GameObject(int startX, int startY, int distance) {
        this.x = px = startX;
        this.y = py = startY;
        this.distance = distance;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getPX() { return px; }
    public int getPY() { return py; }
    public boolean collide(GameObject p){
        if(this.x == p.getX() && this.y == p.getY())
            return true;
        else
            return false;
    }
    protected abstract void move();
    protected abstract char getShape();
}

class Bear extends GameObject {
    Scanner scanner = new Scanner(System.in);
    public Bear(int x, int y, int distance) {
        super(x, y, distance);
    }
    public void move(){
        px = x;
        py = y;
        String s = scanner.next();
        char c = s.charAt(0);
        switch (c) {
            case 'a':
                x = x - distance;
                break;
            case 's':
                y = y + distance;
                break;
            case 'd':
                y = y - distance;
                break;
            case 'f':
                x = x + distance;
                break;
        }
    }
    public char getShape(){
        return 'B';
    }
}
class Fish extends GameObject {
    public Fish(int x, int y, int distance){
        super(x, y, distance);
    }
    public void move(){
        px = x;
        py = y;
        switch (new Random().nextInt(4)) {
            case 0:
                y = y - distance;
                break;
            case 1:
                y = y + distance;
                break;
            case 2:
                x = x + distance;
                break;
            case 3:
                x = x - distance;
                break;
        }
    }
    public char getShape(){
        return '@';
    }
}

class GameMap{
    private char map[][];

    //맵 생성
    public GameMap(){
        map = new char[10][20];
        for(int i=0; i<10; i++){
            for(int j=0; j<20; j++){
                map[i][j] = '-';
            }
        }
    }

    //Bear and Fish 초기 Object 설정
    public void inputObject(GameObject obj){
        map[obj.y][obj.x] = obj.getShape();
    }

    //Bear or Fish Object 그리기
    public void drwaObject(GameObject obj){
        try {
            map[obj.y][obj.x] = obj.getShape();
            map[obj.py][obj.px] = '-';
        }
        catch (Exception e){
            obj.y = obj.py;
            obj.x = obj.px;
        }
    }

    //전체 맵 그리기
    public void showMap() {
        for(int i=0; i<10; i++){
            for(int j=0; j<20; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
public class Game {
    public static void main(String[] args){
        GameMap GM = new GameMap();
        Bear B = new Bear(0, 0, 1);
        Fish F = new Fish(5, 5, 1);

        GM.inputObject(B);
        GM.inputObject(F);

        System.out.println("**Bear의 Fish 먹기 게임을 시작합니다**");

        int fmoveCount = 0;
        //Fish 이동 횟수
        int NumberOfRemainingMoves = 5;
        //Fish 이동 시도 가능 횟수

        while (true){
            GM.showMap();
            System.out.println("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
            B.move();
            GM.drwaObject(B);
            if(B.collide(F)){
                GM.showMap();
                System.out.println("Bear Wins");
                break;
            }
            else {
                int randNum = (int)(Math.random()*10)+1;
                if(fmoveCount<2 && randNum>5){
                    F.move();
                    GM.drwaObject(F);
                    if(F.collide(B)){
                        F.move();
                        GM.drwaObject(F);
                    }
                    fmoveCount++;
                }
                NumberOfRemainingMoves--;
                if (fmoveCount<2){
                    if(NumberOfRemainingMoves == 0){
                        NumberOfRemainingMoves = 1;
                    }
                }
            }
        }
    }
}
