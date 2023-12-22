import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String s[] = new String[h];
        boolean x[] = new boolean[w];
        boolean y[] = new boolean[h];

        Arrays.fill(x, false);
        Arrays.fill(y, false);

        for(int i=0; i<h; i++){
            s[i] = sc.next();
        }

        for(int i=0; i<h; i++){
            for(int j =0; j<w; j++){
                if(s[i].charAt(j)=='#'){
                    x[j] = true;
                    y[i] = true;
                }
            }
        }

        for(int i=0; i<h; i++){
            if(y[i]){
                for(int j=0; j<w; j++){
                    if(x[j]){
                        System.out.print(s[i].charAt(j));
                    }
                }
                System.out.println();
            }
        }
    }
}