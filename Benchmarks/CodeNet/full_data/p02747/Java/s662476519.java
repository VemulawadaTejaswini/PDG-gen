import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] sp = s.split("");
        boolean ans = true;
        if(sp.length % 2 == 0) {
            for(int i=0; i<sp.length-1; i+=2) {
                if(sp[i].equals("h") || sp[i+1].equals("i")) {
                    continue;
                }else {
                    ans = false;
                    break;
                }
            }
        }else {
            ans = false;
        }
        
        if(ans) System.out.println("Yes");
        else System.out.println("No");
    }
}
