import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        long N=stdIn.nextLong();
        long A=stdIn.nextLong();
        long B=stdIn.nextLong();

        long C=N%(A+B);
        if(C>=A){
            C=A;
        }
        

        System.out.println(N/(A+B)*A+C);
        
        
    }

}