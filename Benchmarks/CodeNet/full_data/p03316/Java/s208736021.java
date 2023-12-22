import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ns =String.valueOf(n);
        int len = ns.length();
        int num = 0;

        for(int i = 0;i<len;i++){
            num = num + (Character.getNumericValue(ns.charAt(i)));
            //System.out.println(Character.getNumericValue(ns.charAt(i)));
        }
        //System.out.println(num);
        if(n%num==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
    }
}
