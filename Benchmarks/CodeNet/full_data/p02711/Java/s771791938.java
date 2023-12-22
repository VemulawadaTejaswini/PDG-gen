import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        
        if(S.charAt(0)=='7'||S.charAt(1)=='7'||S.charAt(2)=='7'){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
