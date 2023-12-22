import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int x = in.nextInt();
        int[]candies = new int[n];
        int s=0;int total;int over;
        candies[0] = in.nextInt();
        for(int i=1;i<n;i++){
            candies[i] = in.nextInt();
            total= candies[i]+candies[i-1];
            over = total-x;
            if (over>0){
                int remove = Math.min(candies[i],over);
                candies[i]-=remove;
                over-=remove;
                s+=remove;
            }
            if (over>0){
                int remove = Math.min(candies[i-1],over);
                candies[i-1]-=remove;
                over-=remove;
                s+=remove;
            }
        }
        System.out.println(s);

    }
}