import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String ans = "ABD";
        
        if(n<1000){
            ans = "ABC";
        }
        
		System.out.println(ans);
    }
}
