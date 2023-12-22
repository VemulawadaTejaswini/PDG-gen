import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
        String[] lineArray = br.readLine().split(" ", 0);
        long x = Integer.parseInt(lineArray[0]);
        long y = Integer.parseInt(lineArray[1]);
        int cnt =0;

        if (y<x){
            x=x*(-1);
            cnt++;
        }
        while(x<y){
            x++;
            cnt++;
            if(x*(-1)==y){
                cnt++;
                break;
            }
        }
        System.out.println(cnt);
    }
}