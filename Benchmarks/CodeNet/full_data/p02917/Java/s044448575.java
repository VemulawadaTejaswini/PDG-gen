import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int m = n-1;
        int [] num  = new int[n-1];
        int last ;
        for (int i =0;i<m;i++){
            num[i]= in.nextInt();
        }
        int s =num[0];
        if (m>1){
            num[0]=Math.min(num[0],num[1]);
        }
        for (int i=0;i<=m-2;i++){
            num[i]=Math.min(num[i],num[i+1]);
            s+=num[i];
        }
        s+=num[m-1];
        System.out.println(s);

    }
}
