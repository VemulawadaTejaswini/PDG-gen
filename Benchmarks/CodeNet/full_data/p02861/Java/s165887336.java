import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0; i<n; i++){
            x[i] = stdIn.nextInt();
            y[i] = stdIn.nextInt();
        }

        int[] seed = new int[n];
        for(int i=0; i<n; i++){
            seed[i] = i;
        }
        Permutation p = new Permutation(seed);

        double sum = 0.0;
        do{
            int[] perm = p.getPerm();
            for(int i=1; i<perm.length; i++){
                sum += Math.sqrt((x[perm[i]] - x[perm[i-1]]) * (x[perm[i]] - x[perm[i-1]]) + (y[perm[i]] - y[perm[i-1]]) * (y[perm[i]] - y[perm[i-1]]));
            }
        }while(p.next());

        int fact = factorial(n);

        System.out.println(sum / factorial(n));
    }

    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
}

class Permutation{
    int[] seed;
    int[] perm;

    public Permutation(int [] seed){
        this.seed = seed;
        this.perm = seed;
    }

    public int[] getPerm(){
        return this.perm;
    }

    public boolean next(){
        for(int i=perm.length-1; i>0; i--){
            if(perm[i] > perm[i-1]){
                changePerm(i);
                return true;
            }
        }

        return false;
    }

    private void changePerm(int index){
        int targetIndex = index;
        int min = Integer.MAX_VALUE;
        for(int i=index; i<perm.length; i++){
            if(min > perm[i] && perm[index-1] < perm[i]){
                min = perm[i];
                targetIndex = i;
            }
        }

        int temp = perm[index - 1];
        perm[index - 1] = perm[targetIndex];
        perm[targetIndex] = temp;

        for(int i=index; i<perm.length; i++){
            int x = perm[i];
            int j = i;
            while(j>index && perm[j-1] > x){
                perm[j] = perm[j-1];
                j--;
            }
            perm[j] = x;
        }
    }
}
