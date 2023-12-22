import java.util.*;

public class Main{
    public static void main(String[] args){
        new Main().A();
    }

    void A(){
        int N;
        
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();

        int[] P=new int[N];

        for(int i=0;i<N;i++){
            P[i]=sc.nextInt();
        }

        int a=1;

        int min=P[0];

        for(int i=1;i<N;i++){
            if(min>P[i]){
                a++;
                min=P[i];
            }
        }

        System.out.println(a);
    }
}