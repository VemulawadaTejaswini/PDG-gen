import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int A=in.nextInt();
        int B=in.nextInt();
        int C=in.nextInt();
        int D=in.nextInt();
        int E=A+B;
        int F=C+D;
        if(E>F){
            System.out.println("Left");
        }
        if(E==F){
            System.out.println("Balanced");
        }
        if(E<F){
            System.out.println("Right");
        }
        
    }
}