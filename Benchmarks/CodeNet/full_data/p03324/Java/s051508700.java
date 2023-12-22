import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int D=sc.nextInt();
        int N=sc.nextInt();
        if(N==100 && D==0){
            System.out.println(N+1);
        }
        else{
            if(D==0){
                System.out.println(N);
            }
            else{
                for(int i=0;i<D;i++){
                    N*=100;
                }
                System.out.println(N);
            }
        }    
    }
}