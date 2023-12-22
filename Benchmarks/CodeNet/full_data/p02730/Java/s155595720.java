import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n = s.length();
        String s2 = s.substring(0, (n-1)/2);
        String s3 = s.substring(((n+3)/2)-1, n);
        
        boolean flag = true;
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n-1-i)){
                flag = false;
            }
        }
        for(int i = 0; i < s2.length()/2; i++){
            if(s2.charAt(i) != s2.charAt(s2.length()-1-i)){
                flag = false;
            }
        }
        for(int i = 0; i < s3.length()/2; i++){
            if(s3.charAt(i) != s3.charAt(s3.length()-1-i)){
                flag = false;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}