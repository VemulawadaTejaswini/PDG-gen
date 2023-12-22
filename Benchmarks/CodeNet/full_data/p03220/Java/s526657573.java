import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    static int N;
    static int T;
    static int A;
    static int []elevations;
    public static void main(String[] args) {
        N = sc.nextInt();
        T = sc.nextInt();
        A = sc.nextInt();
        //how to convert tokenized string to int array? 
        elevations = new int[N];
        for(int i = 0; i < N; ++i) {
            elevations[i] = sc.nextInt();
        }
        double minDiff = Math.abs(A - avgTemp(0));
        int minIndex = 0;
        for(int i = 0; i< N;++i) {
            double diff = Math.abs(A - avgTemp(i));
            if(diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
          /*System.out.println(i+" "+diff);
          System.out.println("minDiff="+minDiff);
          System.out.println("minIndex="+minIndex);*/
        }
        System.out.println(minIndex + 1);
    }
    public static double avgTemp(int index) {
        double res = 0.0;
        res = T - (elevations[index] * 0.006);
      //System.out.println("avgTemp="+res);
        return res;
    }

}
