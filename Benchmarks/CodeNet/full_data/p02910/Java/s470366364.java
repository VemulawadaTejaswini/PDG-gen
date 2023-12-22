import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s =sc.next();
        boolean b = false;
        for(int i = 0 ; i<s.length(); i++){
             if(i%2==0){
                 
                // System.out.println("just watching the odd index of the string  "+ i);
               //  System.out.println(s.charAt(i));
                 if(s.charAt(i)==('R'|'U'|'D'))
                     b = true;
             }
             if(b==true)
             {    
                 if(i%2==1){
                    // System.out.println("just checking the even idex  "+ i);
                    // System.out.println(s.charAt(i));
                     if(s.charAt(i)==('L'|'U'|'D'))
                         b = true;
                 }
             }
            
            
        }
        if(b==true) System.out.println("YES");
        else System.out.println("NO");
    }
}
