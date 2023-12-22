import java.util.*;


public class Main {

    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = inp.nextInt();
        Arrays.sort(arr);
        int loc = finalNumber(0, arr);

        for(int i = 0; i < arr[arr.length - 1]; i++){
            loc = Math.min(loc, finalNumber(i, arr));
        }

        System.out.println(loc);


    }

    public static int finalNumber(int p, int[] y){
        int sum = 0;
        for(int i = 0; i < y.length; i++) {
            sum += (y[i] - p) * (y[i] - p);
        }
        final int sum1 = sum;
        return sum1;
    }




}
