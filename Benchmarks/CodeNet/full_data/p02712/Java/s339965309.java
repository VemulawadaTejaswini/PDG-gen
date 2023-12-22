import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long total=0;
        for(int i=0; i<N; i++){
            if(i%3 != 0 && i%5 != 0){
                total +=i;
            }
            //if(i >=N-100){
             //   System.out.println(total);
            //}    
            
        }

        System.out.println(total);

    }

}