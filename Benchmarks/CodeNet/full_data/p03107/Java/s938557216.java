import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String ss = sc.next();
        int nam = ss.length();
        
        int one = 0;int zero = 0;
        for(int i = 0; i < nam;i++){
            if(ss.charAt(i) == '0'){
                zero++;
            }else if(ss.charAt(i) == '1'){
                one++;
            }
        }
        System.out.println(Math.min(zero,one)*2);
    }
}