import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int len=S.length();
        
        for(int i=0;i<len;i++){
            if(i%2==0){
                if(S.charAt(i)=='h'){
                    
                }else{
                    System.out.println("No");
                    return;
                }
            }else{
                if(S.charAt(i)=='i'){
                    
                }else{
                    System.out.println("No");
                    return;
                }
            }
        }
        
        System.out.println("Yes");
    }
}
