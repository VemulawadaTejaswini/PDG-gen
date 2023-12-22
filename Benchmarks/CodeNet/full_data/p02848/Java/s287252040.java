import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        String s = sc.next();
        
        char[] cs = s.toCharArray();
        for(int i = 0; i < cs.length; i++){
            cs[i] += n;
            if(cs[i]>90){
                cs[i]-=26;
            }
        }
        System.out.println(new String(cs));
    }
}