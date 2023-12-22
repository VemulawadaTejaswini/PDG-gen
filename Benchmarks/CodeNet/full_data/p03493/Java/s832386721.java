import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        s.replaceAll("0", "");
        System.out.println(s.length());
//        int ans  = 0;
//        for (char a: s.toCharArray()){
//        	if (a == '1'){
//        		ans ++;
//        	}
//        }
//        System.out.println(ans);
    }
}