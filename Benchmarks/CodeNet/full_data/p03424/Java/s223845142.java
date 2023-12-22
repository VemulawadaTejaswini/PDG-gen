import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        Set set =new HashSet();
        int ans =0;
        for (int i=0;i<N;i++){
            String s = sc.next();
            if(!set.contains(s)){
                set.add(s);
                ans++;
            }
        }
        if(ans ==3){
            System.out.println("Three");
        }else{
            System.out.println("Four");
        }
    }
}