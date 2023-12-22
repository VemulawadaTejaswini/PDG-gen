import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        //char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] c = new char[s.length()];
        int[] n = new int[26];
        
        for(int i=0; i<s.length(); i++){
            c[i] = s.charAt(i);
        }
        
        Arrays.sort(c);
        
        int a=0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1)==s.charAt(i)){
                a++;
            }else{
                if(a%2!=0){
                    System.out.println(c[i]);
                    System.out.println("No");
                    return;
                }
                a=0;
            }
        }
        
        System.out.println("Yes");
   }
}
