import java.util.*;
import static java.lang.System.*;

public class Main{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    if(A<=9){
        if(B<=9){
        out.println(A*B);
        }else
        out.println("-1");
        }else
        out.println("-1");
}
}
