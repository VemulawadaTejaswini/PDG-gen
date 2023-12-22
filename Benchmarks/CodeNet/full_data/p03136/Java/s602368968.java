import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        int sum = 0;
        for(int i = 0;i < N;i++){
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        for(int i = 0;i < N-1;i++){
            sum += n[i];
        }
        System.out.println(n[N-1] < sum ?"Yes":"No");
        }
    }
