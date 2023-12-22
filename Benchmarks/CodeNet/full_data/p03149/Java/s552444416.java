import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner  sc=new Scanner(System.in);
        Integer[] N=new Integer[4];
        int sum=0,product=1;
        for(int i=0;i<4;i++){
            N[i]=sc.nextInt();
            sum+=N[i];
            product*=N[i];
        }
        if(sum==20&&product==252){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
   }
}