// Why do we fall ? So we can learn to pick ourselves up.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ss = sc.next();
        int t = 0;
        for(int i=0; i<n; i++){
            char c = ss.charAt(i);
            i++;
            if(i==n){
                t++;
                break;
            }
            while(ss.charAt(i)==c){
                i++;
                if(i==n){
                    t++;
                    break;
                }
            }
            if(i==n){
                break;
            }
            i--;
            t++;
            }
        System.out.println(t);
        }
    }