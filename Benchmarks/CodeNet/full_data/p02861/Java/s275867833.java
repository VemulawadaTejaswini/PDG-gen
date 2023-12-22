import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static List<Coordinate> coordinateList = new ArrayList();
    static double result = 0;
    static int count = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (long i = 0; i < N; i++) {
            coordinateList.add(new Coordinate(input.nextInt(),input.nextInt()));
        }


        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = i;
        }

        perm(arr,0,N,N);

        System.out.println(result/count);

    }

    public static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(Math.abs(x1 - x2),2) + Math.pow(Math.abs(y1 - y2),2));
    }

    public static void perm(int[] arr, int depth, int n, int k) {
        if (depth == k) {
            count++;
            for(int i = 0; i < n - 1; i ++){
                result += distance(coordinateList.get(arr[i]).x,coordinateList.get(arr[i]).y,coordinateList.get(arr[i+1]).x,coordinateList.get(arr[i+1]).y);
            }
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            perm(arr, depth + 1, n, k);
            swap(arr, i, depth);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class Coordinate {
    int x;
    int y;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}
