import java.util.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        if(x>=a*b/2){
            double c=(double)x/a/a;
            double d=2*c-b;

            System.out.println(Math.toDegrees(Math.atan((b-d)/a)));
        }else{
            double c=(double)x/a/b*2;
            System.out.println(90-Math.toDegrees(Math.atan(c/b)));
        }
        

        
    


        sc.close();
    }
}
