import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        if(A<=9&&B<=9){
            System.out.println(A*B);
        }else{
            System.out.println(-1);
        }
    }
}