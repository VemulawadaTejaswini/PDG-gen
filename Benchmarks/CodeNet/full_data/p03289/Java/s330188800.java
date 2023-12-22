import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int l = S.length();
        String a = "AC";
        int b = 0;
        int sum = 0;
        int[] x = new int[l+1];

        if(S.charAt(0)!=a.charAt(0)){
            System.out.println("WA");
        }
        else{
            for(int i=2; i<=l-2; i++){
                if(S.charAt(i)==a.charAt(1)){
                    break;
                }
                if(i==l-2){
                    System.out.println("WA");
                    b = l-2;
                }
            }
            if(b!=l-2){
                String US = S.toUpperCase();
                for(int i=0; i<l; i++){
                    if(S.charAt(i)==US.charAt(i)){
                        sum += 1;
                        x[sum] = i;
                    }
                }
                
                if(sum==2 && S.charAt(x[1])==a.charAt(0) && S.charAt(x[2])==a.charAt(1)){
                    System.out.println("AC");
                }
                else if(sum>2){
                    System.out.println("WA");
                }
            }
        }
    }
}