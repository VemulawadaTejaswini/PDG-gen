import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = stdIn.nextLong();
        }

        int[] seed = new int[n];
        for(int i=0; i<n; i++){
            seed[i] = i;
        }
        Permutation p = new Permutation(seed);

        long max = 0;
        do{
            int[] perm = p.getPerm();
            long temp = 0;
            for(int i=0; i<perm.length; i++){
                temp += (Math.abs(perm[i] - i) * a[i]);
            }
            if(temp > max){
                max = temp;
            }
        }while(p.next());

        System.out.println(max);
    }
}

class Permutation{
    int[] seed;
    int[] perm;

    public Permutation(int [] seed){
        this.seed = new int[seed.length];
        for(int i=0; i<this.seed.length; i++){
            this.seed[i] = seed[i];
        }

        this.perm = new int[seed.length];
        for(int i=0; i<this.perm.length; i++){
            this.perm[i] = seed[i];
        }
        sort(this.perm, 0, this.perm.length);
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

        sort(perm, index, perm.length);
    }

    private void sort(int[] a, int from, int to){
        for(int i=from; i<to; i++){
            int x = a[i];
            int j = i;
            while(j > from && a[j-1] > x){
                a[j] = a[j-1];
                j--;
            }
            perm[j] = x;
        }
    }
}
