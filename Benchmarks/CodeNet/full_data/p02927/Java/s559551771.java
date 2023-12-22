import java.util.*;
//import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        int count = 0;
        //String str = sc.next();
        //char[] c = str.toCharArray();
        //int[] p = new int[N];
        //a[0] = Character.getNumericValue(str.charAt(0));
        //boolean test = false;
        
        for(int k=4; k<=M; k++){
        for(int i=2; i<=D/10; i++){
            for(int j=2; j<=9; j++){
                if(i*j == k){
                    count++;
                    //System.out.println(i+":"+j);
                }
            }
            //System.out.println(count);
        }
        }
        System.out.println(count);
    }
}
