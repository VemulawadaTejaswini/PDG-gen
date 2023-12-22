import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        long count = 0;

        for(int a = 0; a < n; a++){
            char as = s.charAt(a);
            for(int b = a + 1; b < n; b++){
                char bs = s.charAt(b);
                if(bs == as){
                    continue;
                }
                for(int c = b + 1; c < n; c++){
                    char cs = s.charAt(c);
                    if(cs == bs || cs == as){
                        continue;
                    }
                    if(c - b == b - a){
                        continue;
                    }
                    count ++;
                }
            }
        }

        System.out.println(count);
    }

}
