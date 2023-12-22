import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(in.next());
        int s = Integer.parseInt(in.next());
        int ans = 0; 
        for(int x = 0;x <= k;x++){
            for(int y = 0; y <= k; y++){
                for(int z = 0; z <= k; z++){
                    if(s == x+y+z) ans++;
                }
            }
        }
            System.out.println(ans);
        }
}