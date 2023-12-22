import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int K = Integer.parseInt(sc.next());
        int S = Integer.parseInt(sc.next());
        int count = 0;

        for (int x=0;x<K;x++){
            for (int y=0;y<K;y++){
                for (int z=0;z<K;z++){
                 if(x+y+z==S) count++;  
                }
            }
        } 



        System.out.print(count*2);
        System.out.println();
    }

}