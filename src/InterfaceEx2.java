interface PhoneInterface2{
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo(){
        System.out.println("** Phone **");
    }
}

class Calc {
    public int calculate(int x, int y){
        return x+y;
    }
}

class SmartPhone extends Calc implements PhoneInterface{
    @Override
    public void sendCall(){
        System.out.println("따르릉따르릉~");
    }
    @Override
    public void receiveCall(){
        System.out.println("전화 왔어요.");
    }
    public void schedule(){
        System.out.println("일정 관리합니다.");
    }
}

public class InterfaceEx2 {
    public static void main(String[] args){
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        System.out.println("3과 5를 더하면 " + phone.calculate(3,5));
        phone.schedule();
    }
}
