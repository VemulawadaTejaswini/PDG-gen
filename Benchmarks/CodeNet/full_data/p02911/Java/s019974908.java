import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] point = new int[n];
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int a;
        for(int i=0;i<q;i++){
            a = Integer.parseInt(sc.next())-1;
            point[a]++;
        }
        sc.close();
        PrintWriter out = new PrintWriter(System.out);
        for(int i=0;i<n;i++){
            if(k - (q-point[i])>0){
                out.println("Yes");
            }else{
                out.println("No");
            }
        }
        out.flush();
    }
}