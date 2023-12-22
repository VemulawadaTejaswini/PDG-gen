import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String C1 = sc.next();
        String C2 = sc.next();

        if(C1.charAt(0)==C2.charAt(2) && C1.charAt(1)==C2.charAt(1) && C1.charAt(2)==C2.charAt(0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}