import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc  = new Scanner(System.in);
 
        int K = Integer.parseInt(sc.next());
        int S = Integer.parseInt(sc.next());
        int count = 0;
        
        int z=0;
 
        for (int x=0;x<K+1;x++){
            for (int y=0;y<K+1;y++){
                 z = S-x-y;
                 if(z<=K&&z>=0){
                   //     System.out.println("x:"+x+"y:"+y+"z:"+z);
                        count++;
                    
                }
            }
        } 

        System.out.print(count);
        System.out.println();
    }
 
}