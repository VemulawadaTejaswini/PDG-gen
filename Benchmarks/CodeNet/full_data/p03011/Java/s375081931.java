import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int p = entrada.nextInt();
        int q = entrada.nextInt();
        int r = entrada.nextInt();
        int abc = p+q;
        int cab = r+p;
        int bca = q+r;
        if(abc<=cab && abc<=bca){
            System.out.println(abc);
        }else if(cab<=abc && cab<=bca){
            System.out.println(cab);
        }else if(bca <=abc && bca <=cab){
            System.out.println(bca);
        }
    }
}