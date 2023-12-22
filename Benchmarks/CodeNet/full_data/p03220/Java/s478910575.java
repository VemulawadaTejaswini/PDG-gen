import java.io.*;
import java.util.*;

class Program{
    String S[]; int N,T,A;
    int diff = Integer.MAX_VALUE;
    void solve(String S[], int N, int T, int A){
        this.S = S; this.N = N; this.T = T; this.A = A;
        calc();
    }
    void calc(){
        double diff = Double.MAX_VALUE; int temp = -1;
        for(int i=0;i<S.length;i++){
            if(Math.abs(A-T-Integer.parseInt(S[i])*0.006)<diff){
                diff = Math.abs(A-T-Integer.parseInt(S[i])*0.006);
                temp = i+1;
            }
        }
        System.out.println(temp);
    }
}
class Main{
    public static void main(String[] args) {
        Program obj = new Program();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int T = in.nextInt(); int A = in.nextInt();
        in.nextLine();
        String S[]= in.nextLine().split(" ");
        //System.out.println(N+" "+T+" "+A+" "+Arrays.toString(S));
        obj.solve(S,N,T,A);
    }
}