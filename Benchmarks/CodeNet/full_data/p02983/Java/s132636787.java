import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
        
      Scanner sc = new Scanner (System.in);
        
        long L = sc.nextLong();
        long R = sc.nextLong();
        
        if (R>=2019&&L<=2019){
            System.out.println(0);
        } else {
            long min = Long.MAX_VALUE;
            
            for (long index=L; index<R; index++){
                for (long index2=index+1; index<R; index++){
                    if (min>(index*index2)%2019){
                        min=(index*index2)%2019;
                    }
                }
            }
            System.out.println(min);
        }
    }
}