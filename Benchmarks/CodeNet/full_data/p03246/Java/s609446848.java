import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {

    public static void main(String[] args) {
        int N = sc.nextInt();
        int count = 0;
        
        List<int> intlist = new List<int>();
        
        for(int i = 0; i < N; i++) {
            intList.add(sc.nextInt());
        }
        
        for(int i = 0; i < N; i++) {
            if(intList.get(i) != intList.get(i+2)) {
                count++;
            }
        }
        
        System.out.print(count);
    }

}
