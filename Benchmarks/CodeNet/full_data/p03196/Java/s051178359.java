import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextInt();
        double p=sc.nextInt();
        int x=(int)Math.pow(p,1/n);
        int output=0;
        for(int i=0;i<x;i++){
            if(p%Math.pow(i+1, n)==0){
                output=i+1;
            }
        }
        System.out.println(output);
        

    }

}
