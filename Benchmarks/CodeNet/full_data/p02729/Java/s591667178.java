import java.util.Scanner;

public class Main {
    long fact(long n){
        return n == 1 ? 1 : n * fact( n-1 );
    }
    long selection(int n){
        if(n==0 || n==1)
            return 0;
        else{
            long k=fact(n);
            long l=fact(n-2);
            long m=fact(2);
            long p=k/(l*m);

            return p;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        Main ob1=new Main();
//        ob1.selection(N);
        System.out.println(ob1.selection(N) + ob1.selection(M));
    }
}
