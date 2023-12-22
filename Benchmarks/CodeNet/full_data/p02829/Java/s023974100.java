import java.util.*;

class Main {
    public static void main (String[] args){
        Scanner stdIn = new Scanner(System.in);

        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        int C = 0;

        if(A == 1){
            if(B==2) C = 3;
            if(B==3) C = 2;
        }else if(A == 2){
            if(B==3) C = 1;
            if(B==1) C = 3;
        }else if(A == 3){
            if(B==1) C = 2;
            if(B==2) C = 1;
        }else{
            System.out.print("Error");
        }
        
        System.out.print(C);

    }
}