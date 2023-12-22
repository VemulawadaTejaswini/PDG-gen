import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> W = new ArrayList<>();
        for(int i=0; i<N; i++){
            W.add(scanner.nextInt());
        }

        int wLeft = 0;
        int wRight = 0;
        for(int i=0; i<N; i++){
            wRight += W.get(i);
        }
        int minAbsDiff = wRight;
        for(int i=0; i<N; i++){
            int absDiff = Math.abs(wLeft - wRight);
            if(absDiff < minAbsDiff){
                minAbsDiff = absDiff;
            }
            wLeft += W.get(i);
            wRight -= W.get(i);
        }

        System.out.println(minAbsDiff);
    }
}