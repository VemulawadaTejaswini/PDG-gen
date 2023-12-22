import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int count = 1;
        if(A==1 || B==1){}
        else if((A==2 || B==2) && A%2==0 && B%2==0){count++;}
        else if((A==2 || B==2) && A%2==1 || B%2 == 1){}
        else{
        if(A%2 == 0 && B%2 == 0) count++;
            for(long i = 3; i <= Math.max(A,B); i = i+2){
                boolean a = false;
                if(A%i == 0 && B%i == 0) a = true;
                if(a == true){
                    boolean b = true;
                    if(i == 3){}
                    else{
                    for(long x = 3; x < i; x=x+2){
                        if(i%x == 0) b = false;
                        break;
                    }
                }
                    if(b == true) count++;
                } 
            }
        }
System.out.print(count);

    }
}
