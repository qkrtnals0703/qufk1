import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int cnt = 0;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            if(check()){
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static boolean check() throws IOException{
        boolean[] check = new boolean[26];
        int pre = 0;
        String str = br.readLine();

        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i);
            if(pre != now){
                if(!check[now - 'a']){
                    check[now - 'a'] = true;
                    pre = now;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
