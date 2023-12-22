import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int imprtnum = scan.nextInt();

        int A,B,C,D;
        D=imprtnum%10;
        imprtnum/=10;
        C=imprtnum%10;
        imprtnum/=10;
        B=imprtnum%10;
        imprtnum/=10;
        A=imprtnum%10;

        boolean p1 = A+B+C+D==7;
        boolean p2 = A+B+C-D==7;
        boolean p3 = A+B-C+D==7;
        boolean p4 = A+B-C-D==7;
        boolean p5 = A-B+C+D==7;
        boolean p6 = A-B+C-D==7;
        boolean p7 = A-B-C+D==7;
        boolean p8 = A-B-C-D==7;

        if(p1){
            System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
        }else if(p2){
            System.out.println(A+"+"+B+"+"+C+"-"+D+"=7");
        }else if(p3){
            System.out.println(A+"+"+B+"-"+C+"+"+D+"=7");
        }else if(p4){
            System.out.println(A+"+"+B+"-"+C+"-"+D+"=7");
        }else if(p5){
            System.out.println(A+"-"+B+"+"+C+"+"+D+"=7");
        }else if(p6){
            System.out.println(A+"-"+B+"+"+C+"-"+D+"=7");
        }else if(p7){
            System.out.println(A+"-"+B+"-"+C+"+"+D+"=7");
        }else if(p8){
            System.out.println(A+"-"+B+"-"+C+"-"+D+"=7");
        }
    }
}