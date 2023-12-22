import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        new Main().solve();
    }

    void solve(){

        long N, A, B;

        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        A = sc.nextLong();
        B = sc.nextLong();
        sc.close();

        long numOfblue;

        numOfblue = N / (A + B);
        numOfblue = numOfblue * A;

        if(N % (A + B) >= A){
            numOfblue = numOfblue + A;
        }
        else{
            numOfblue = numOfblue + N % (A + B);
        }

        System.out.println(numOfblue);
    }

       
}