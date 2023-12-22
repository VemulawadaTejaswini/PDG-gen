import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String ans="No";
        int a=0;
        if(s.length()%2==1){
            a=1;
        }
        
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)==s.charAt(s.length()-i-1)){
                if(s.charAt(i)==s.charAt(s.length()/2-1-i)){
                    if(s.charAt(s.length()/2+a)==s.charAt(s.length()-i-1)){
                        ans="Yes";
                    }else{
                        break;
                    }
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        
        
        System.out.println(ans);
        
	}
}
