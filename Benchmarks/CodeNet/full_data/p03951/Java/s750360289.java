import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        int cross = 0;
        for(int i = 1; i <= n; i++){
            String b1 = b.substring(0,i);
            if(a.lastIndexOf(b1)+i == a.length()){
                cross = i;
            }
        }
        System.out.println(a.length() + b.length() - cross);
    }
}
