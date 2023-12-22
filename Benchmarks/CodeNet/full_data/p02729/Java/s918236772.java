import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String ans="Yes";
        int a=0;
        if(s.length()%2==1){
            a=1;
        }
        
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                ans="No";
                break;
            }
            if(s.charAt(i)!=s.charAt(s.length()/2-1-i)){
                ans="No";
                break;
            }
            if(s.charAt(s.length()/2+a)!=s.charAt(s.length()-i-1)){
                ans="No";
                break;
            }
        }
        
        
        System.out.println(ans);
        
	}
}
