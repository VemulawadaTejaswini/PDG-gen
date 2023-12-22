import java.io.PrintWriter;
import java.util.* ;

class Main {


    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int A = in.nextInt();
        int B = in.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = A + B;
        if(sum > max) {
            max = sum ;
        }
        int sub = A - B ;
        if(sub > max) {
            max = sub;
        }
        int mul = A * B ;
        if(mul > max) {
            max = mul ;
        }
        pw.println(max);
        pw.close();
        
    }
}