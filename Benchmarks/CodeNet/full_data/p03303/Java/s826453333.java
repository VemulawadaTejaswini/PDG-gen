import java.util.*;
//import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int A = sc.nextInt();
        char[] ans = new char[1000/A];
        int count = 0;
        //int[] p = new int[N];
        //a[0] = Character.getNumericValue(str.charAt(0));
        //boolean test = false;
        
        for(int i=0; i<str.length(); i++){
            if(i%A==0){
                ans[i/A] = c[i];
                count++;
                //System.out.println(i+":"+A+":"+ans[i/A]);
            }
            //System.out.println(count);
        }
        for(int i=0; i<count; i++){
            System.out.print(ans[i]);
        }
        System.out.println("");
    }
}
