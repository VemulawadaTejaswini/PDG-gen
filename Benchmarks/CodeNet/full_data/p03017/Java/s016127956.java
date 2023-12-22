import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String str = sc.next();
        
        if(C<D){
            str = str.substring(A,D);
            if(str.contains("##")){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }else{
            str = str.substring(A,C);
            if(str.contains("...") && !str.contains("##")){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}