import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] a = new int[s.length()];
        
        for(int i = 0; i <s.length(); i++){
            a[s.charAt(i) - 97] = 1;
        }
        
        char res = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(a[i] == 0){
                res=(char)(i+97);
                break;
            }
        }
        
        System.out.println(res == 0 ? "None" : res);
    }
}
