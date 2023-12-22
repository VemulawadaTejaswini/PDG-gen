import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int K=scan.nextInt();
        int i;
        int express=1;
        int next1,next2;
        for(i=0;i<N;i++){
            next1=express*2;
            next2=express+K;
            if(next1<next2){
                express=next1;
            }
            else{
                express=next2;
            }
        }
        System.out.println(express);
    }
}