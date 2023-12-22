import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N%2==0){
            System.out.println(0.5);
        }
        else{
            int x=N/2+1;
            double y=x;
            System.out.println(y/N);
        }
    }
}