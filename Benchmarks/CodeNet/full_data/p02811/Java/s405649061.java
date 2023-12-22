import java.util.*;
public class task {
    public static void main(String[] args){
        Scanner ms = new Scanner(System.in);
        int k = Integer.parseInt(ms.next());
        int x = Integer.parseInt(ms.next());
        if((k*500)>=x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}