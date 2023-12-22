import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        String b = scan.next();
        String ans = "No";
        if(a%2==0){
            a=a/2;
            if(b.substring(0,a).equals(b.substring(a+1))){
                ans="Yes";
            }
        }
        System.out.println(ans);
    }
}