import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] X = new int[M];
        for(int i = 0; i < M; i++){
            X[i] = sc.nextInt();
        }
        if(N >= M){
            System.out.println(0);
            return;
        }
        Arrays.sort(X);
        List<Integer> diff = new ArrayList<Integer>();
        List<Integer> diff_copy = new ArrayList<Integer>();
        for(int i = 0; i < M - 1; i++){
            diff.add(X[i + 1] - X[i]);
            diff_copy.add(X[i + 1] - X[i]);
        }
        Collections.sort(diff_copy);
        Collections.reverse(diff_copy);
        int[] df = new int[N - 1];
        for(int i = 0; i < N - 1; i++){
            df[i] = diff.indexOf(diff_copy.get(i));
        }
        int sum = 0;
        for(int i = 0; i < N; i++){
            if(i == 0){
                sum = sum + X[df[i]] - X[0];
            }else if(i == N - 1){
                sum = sum + X[M - 1] - X[df[i - 1] + 1];
            }else{
                sum = sum + X[df[i]] - X[df[i - 1] + 1];
            }
        }
        System.out.println(sum);
    }
}