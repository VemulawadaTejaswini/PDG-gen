import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        int i = 0;
        long xsum = 0;
        long ysum = 0;
        
        long xmax = 0;
        long ymax = 0;

        int ansxs = 0;
        int ansxf = 0;
        int ansys = 0;
        int ansyf = 0;
        
        int ansxst = 0;
        int ansyst = 1;
        
        while (i < N) {
            xsum += a[i];
            if(xsum > 0){
                if(xsum > xmax){
                    xmax = xsum;
                    ansxs = ansxst;
                    ansxf = i;
                }
            }else{
                xsum = 0;
                ansxst = i+2;
            }
            i++;
            if(i>=N){
                break;
            }
            ysum += a[i];
            if(ysum > 0){
                if(ysum > ymax){
                    ymax = ysum;
                    ansys = ansyst;
                    ansyf = i;
                }
            }else{
                ysum = 0;
                ansyst = i+2;
            }
            i++;
        }
        
        PrintWriter pw = new PrintWriter(System.out); 
        
        if(xmax > ymax){
            pw.println(xmax);
            pw.println(N-1+(ansxs-ansxf)/2);
            for(int k = 0;k<ansxs;k++){
                pw.println("1");
            }
            for(int k = 0;k<(ansxf-ansxs)/2;k++){
                pw.println("2");
            }
            for(int k = N-ansxf;k>1;k--){
                pw.println(k);
            }
        }else{
            pw.println(ymax);
            pw.println(N-1+(ansys-ansyf)/2);
            for(int k = 0;k<ansys;k++){
                pw.println("1");
            }
            for(int k = 0;k<(ansyf-ansys)/2;k++){
                pw.println("2");
            }
            for(int k = N-ansyf;k>1;k--){
                pw.println(k);
            }
        }
        pw.flush();
    }
}