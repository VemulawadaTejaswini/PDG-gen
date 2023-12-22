import java.util.*;


public class CodeForce{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int A=sc.nextInt();
        int rem=H%A;
        int div=H/A;
        if(rem==0)System.out.println(div);
        else System.out.println(div+1);
    
    }
}
      