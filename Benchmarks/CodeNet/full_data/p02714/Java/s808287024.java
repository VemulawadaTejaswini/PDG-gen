import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] sl = s.toCharArray();
        int ans = 0;
        sc.close();        
        for(int i = 0; i < n-2; i++){
            if(sl[i] != 'R') continue;
            for(int j = i+1; j < n-1; j++){
                if(sl[j] != 'G') continue;
                for(int k = j+1; k < n; k++){
                    if(sl[k] != 'B' || (k-j) == (j-i)) continue;
                    ans++;
                }
            }
        }
        for(int i = 0; i < n-2; i++){
            if(sl[i] != 'R') continue;
            for(int j = i+1; j < n-1; j++){
                if(sl[j] != 'B') continue;
                for(int k = j+1; k < n; k++){
                    if(sl[k] != 'G' || (k-j) == (j-i)) continue;
                    ans++;
                }
            }
        }
        for(int i = 0; i < n-2; i++){
            if(sl[i] != 'G') continue;
            for(int j = i+1; j < n-1; j++){
                if(sl[j] != 'R') continue;
                for(int k = j+1; k < n; k++){
                    if(sl[k] != 'B' || (k-j) == (j-i)) continue;
                    ans++;
                }
            }
        }
        for(int i = 0; i < n-2; i++){
            if(sl[i] != 'G') continue;
            for(int j = i+1; j < n-1; j++){
                if(sl[j] != 'B') continue;
                for(int k = j+1; k < n; k++){
                    if(sl[k] != 'R' || (k-j) == (j-i)) continue;
                    ans++;
                }
            }
        }
        for(int i = 0; i < n-2; i++){
            if(sl[i] != 'B') continue;
            for(int j = i+1; j < n-1; j++){
                if(sl[j] != 'R') continue;
                for(int k = j+1; k < n; k++){
                    if(sl[k] != 'G' || (k-j) == (j-i)) continue;
                    ans++;
                }
            }
        }
        for(int i = 0; i < n-2; i++){
            if(sl[i] != 'B') continue;
            for(int j = i+1; j < n-1; j++){
                if(sl[j] != 'G') continue;
                for(int k = j+1; k < n; k++){
                    if(sl[k] != 'R' || (k-j) == (j-i)) continue;
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}