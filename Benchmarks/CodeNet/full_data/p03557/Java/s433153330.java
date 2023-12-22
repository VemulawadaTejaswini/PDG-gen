import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        for (int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        for (int i=0;i<N;i++){
            B[i] = sc.nextInt();
        }
        for (int i=0;i<N;i++){
            C[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        int[] recordB = new int[N];
        int left = 0;
        for(int j=0; j<N; j++){
            while(left<N&&A[left]<B[j]) left++;
            if(j==0) recordB[j]+=left;
            else recordB[j] += left+recordB[j-1];
        }
        // recordB[j] is an integer
        int right = 0;
        for(int k=0;k<N;k++){
            while(right<N&&B[right]<C[k]) right++;
            C[k]=right;
        }
        long ans = 0;
        for(int k=0;k<C.length;k++){
            if(C[k]==0) continue;
            ans += recordB[C[k]-1];
        }
        System.out.println(ans);
    }
}