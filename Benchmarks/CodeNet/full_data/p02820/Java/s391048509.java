
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long N,K;
        long R,S,P;
        String T;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextLong();
            K = sc.nextLong();
            
            R = sc.nextLong();
            S = sc.nextLong();
            P = sc.nextLong();
            
            T = sc.next();   
        }
        
        char[] carray= T.toCharArray();
        long kouho =0;
        for (int i = 1; i <= K; i++) {
            //グループi carrys[K*j + (i-1)]
            int j = 0;
            
            List<Character> list= new LinkedList<>();
            while(K*j + (i-1) < N) {
                list.add(carray[(int)K*j + (i-1)]);
                j++;
            }
            kouho +=cal(list,R,S,P);
        }
        

        System.out.println(kouho);
    }
    
    private static long cal(List<Character> list,long R,long S,long P) {
        Character[] c = list.toArray(new Character[list.size()]);
        //勝てる相手の手
        int rCount = 0;
        int sCount = 0;
        int pCount = 0;
        
        int count = 1;
        Character pre= c[0];
        for (int i = 1; i < c.length; i++) {
            if(pre == c[i]) {
                count++;
            }else {
                //最大の勝てる手
                count++;
                if(pre == 'r') {
                    rCount += (count/2);
                }else if(pre == 's') {
                    sCount += (count/2);
                }else {
                    pCount += (count/2);
                }
                pre = c[i];
                count=1;
            }
        }
        //最大の勝てる手
        count++;
        if(pre == 'r') {
            rCount += (count/2);
        }else if(pre == 's') {
            sCount += (count/2);
        }else {
            pCount += (count/2);
        }
        long result = 0;
        result += rCount * P;
        result += sCount * R;
        result += pCount * S;
        return result;
    }
}
