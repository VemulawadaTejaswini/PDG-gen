import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");
            int sum = Integer.parseInt(str.nextToken());
            int flg;
            int count = 0;
            if( sum > 0) flg = 1;
            else flg = -1;
            for(int i = 0; i < n-1; i++){
                int tmp = 0;
                sum += Integer.parseInt(str.nextToken());
                //System.out.print(sum+" ");
                if(flg == 1){   //次は負
                    //System.out.print(sum+" ");
                    if(sum >= 0){
                        //System.out.print(sum+" ");
                        tmp += (sum + 1);
                        sum = -1;
                    }
                    flg = -1;
                }
                else{       //次は正
                    if(sum <= 0){
                        //System.out.print(sum+" ");
                        tmp += 1+ (-sum);
                        sum = 1;
                    }
                    flg = 1;
                }
                //System.out.print(tmp+" ");
                count += tmp;
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}