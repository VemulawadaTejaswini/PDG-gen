import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String NS = String.valueOf(N);
        int l = NS.length();
        int S = 0;
        String s = " ";

        for(int i=0; i<l; i++){
            s = String.valueOf(NS.charAt(i));
            S += Integer.parseInt(s);
        }
        if(N%S==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}