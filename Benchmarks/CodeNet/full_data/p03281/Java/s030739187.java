import java.util.*;
import static java.lang.Math.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt_all = 0;
        for(int i=1; i<=n; i+=2){
            int cnt = 0;
            for(int j=1;j<=n;j++){
                if(i>=j && i%j==0){
                    cnt++;
                }
            }
            if(cnt == 8){
                cnt_all++;
            }
        }
        System.out.println(cnt_all);
    }
}