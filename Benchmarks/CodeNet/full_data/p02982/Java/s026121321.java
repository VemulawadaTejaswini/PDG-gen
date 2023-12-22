import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer N = Integer.parseInt(scan.next());
        Integer D = Integer.parseInt(scan.next());

        Integer array[][] = new Integer[N][D];
        double distance[] = new double[N];
        ArrayList<Double> d = new ArrayList<Double>();

        for(int i=0;i<N;i++){
            for(int j=0;j<D;j++){
                array[i][j] = Integer.parseInt(scan.next());
            }
        }
    
        for(int i=0;i<N;i++){

            for(int k=i+1;k<N;k++){

                int sum = 0;
                for(int j=0;j<D;j++){
                    if(i != N-1){
                        sum += Math.abs((array[i][j] - array[k][j]) * (array[i][j] - array[k][j]));
                    }else{
                        sum += Math.abs(  (array[i][j] - array[0][j] ) * (array[i][j] - array[0][j] )  );
                    }
                }
                d.add(Math.sqrt(sum));

            }
        }

        int count = 0;
        for(int i=0;i<d.size();i++){
            double dd = d.get(i);
            if(d.get(i) == (int)dd){
                count++;
            }
        }

        System.out.println(count);
    }
    
    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
      }
}