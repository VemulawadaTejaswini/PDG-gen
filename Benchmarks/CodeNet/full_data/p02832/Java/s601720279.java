import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }

        boolean fin = true;
        int count = 0;
        int i = 1;
        int index = 0;
        while(i <= N){
            int j = index;
            while(j < N){
                if(a[j] == 1){
                    fin = false;
                }
                if(a[j] == i){
                    count++;
                    index = j + 1;
                    break;
                }
                j++;
            }
            if(fin){
                System.out.println("-1");
                return;
            }
            if(j >= N) break;
            i++;
        }

        System.out.println(N - count);
    }
}