import java.util.*;
public class Main {
    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] a = new int[N];
        int[] flag = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
            flag[i] = 0;
        }
        int sum = 0;
        for(int i=0;i<N;i++){
            int count = 0;
            if(flag[i]!=1) {
                for (int j = i; j < N; j++) {
                    if (a[j] == a[i]) {
                        count++;
                        flag[j] = 1;
                    }
                }
                if(count<a[i]){
                    sum = sum + count;
                }else {
                    sum = sum + (count - a[i]);
                }

            }
        }
        System.out.println(sum);

    }

}
