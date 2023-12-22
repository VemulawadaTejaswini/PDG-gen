// 2017/12/03
// Problem URL:

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().trim().split("");
        if((num[0].equals(num[1]) && num[1].equals(num[2])) || (num[1].equals(num[2]) && num[2].equals(num[3]))){
            System.out.println("YES");
        }else System.out.println("NO");
        /*int count = 0;
        for(int i=0; i<num.length-1; i++){
            if(num[i].equals(num[i+1])){
                count++;
                if(count == 2) break;
            }else{
                count = 0;
            }
        }
        if(count == 2) System.out.println("YES");
        else System.out.println("No");*/
    }
}