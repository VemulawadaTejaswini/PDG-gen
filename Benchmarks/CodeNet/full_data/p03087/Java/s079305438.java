import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[][] lr = new int[q][2];
        for(int i = 0;i<q;i++){
            lr[i][0] = sc.nextInt();
            lr[i][1] = sc.nextInt();
        }
        for(int i = 0;i<q;i++){
            String sub = s.substring(lr[i][0]-1,lr[i][1]);
            sub = sub.concat("#");
            int result = 0;
            for(int j = 0;j<(lr[i][1]-lr[i][0]+1);j++){
                if(sub.charAt(j) == 'A' && sub.charAt((j+1)) == 'C'){
                    result += 1;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}