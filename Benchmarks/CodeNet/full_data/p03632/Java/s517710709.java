import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
 //O(100000000)
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int cnt = 0;

        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long C = Long.parseLong(sc.next());
        long D = Long.parseLong(sc.next());

        int[] g = new int[100];
        for(int i=(int)A;i<(int)B;i++){
           g[i]++;
        }
        for(int i=(int)C;i<(int)D;i++){
           g[i]++;
        }
        
         for(int i=0;i<100;i++){
           if(g[i]==2) cnt++;
        }
        
        

        System.out.print(cnt);
        System.out.println();
    }
}