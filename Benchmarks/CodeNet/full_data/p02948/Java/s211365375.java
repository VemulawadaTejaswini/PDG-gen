import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Sort[] s = new Sort[n];
        for(int i = 0; i < n; i++){
            s[i] = new Sort(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
        Arrays.sort(s);
        
        int ans = 0;
        for(int i = 0; i < m; i++){
            if(i == n){
                break;
            }
            if(s[i].a > (m-i)){
                continue;
            }
            ans += s[i].b;
        }
        
        System.out.println(ans);
    }
}

class Sort implements Comparable<Sort>{
    int a;
    int b;
    
    Sort(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Sort s) {
        
        if(this.b > s.b){
            return -1;
        }else if(this.b < s.b){
            return 1;
        }else{
            if(this.a > s.a){
                return -1;
            }else if(this.a < s.a){
                return 1;
            }else{
                return 0;
            }
        }
    }
}