import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int p1 = 0;
        int p2 = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(i % 2 == 0){
                if(c == '0'){
                    p1++;
                }else{
                    p2++;
                }
            }else{
                if(c == '1'){
                    p1++;
                }else{
                    p2++;
                }
            }
        }
        
        System.out.println(p1 > p2 ? p2 : p1);
    }
}
