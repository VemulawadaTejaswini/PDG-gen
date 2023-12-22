import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        int p = Integer.parseInt(sc.next());
        String t = sc.next();
        
        char[] c = t.toCharArray();
        for(int i = 0; i < n; i++){
            if(c[i] == 'r'){
                c[i] = 'p';
            }else if(c[i] == 's'){
                c[i] = 'r';
            }else if(c[i] == 'p'){
                c[i] = 's';
            }
        }
        
        boolean[] b = new boolean[n];
        Arrays.fill(b, true);
        for(int i = k; i < n-k; i++){
            if(c[i] == c[i-k]){
                b[i] = false;
                if(c[i] == 'r'){
                    if(c[i+k] == 's'){
                        c[i] = 'p';
                    }else{
                        c[i] = 's';
                    }
                }else if(c[i] == 's'){
                    if(c[i+k] == 'p'){
                        c[i] = 'r';
                    }else{
                        c[i] = 'p';
                    }
                }else if(c[i] == 'p'){
                    if(c[i+k] == 'r'){
                        c[i] = 's';
                    }else{
                        c[i] = 'r';
                    }
                }
            }
        }
        
        for(int i = n-k; i < n; i++){
            if(c[i] == c[i-k]){
                b[i] = false;
            }
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(b[i]){
                if(c[i] == 'r'){
                    ans += r;
                }else if(c[i] == 's'){
                    ans += s;
                }else if(c[i] == 'p'){
                    ans += p;
                }
            }
        }
        System.out.println(ans);
    }
}