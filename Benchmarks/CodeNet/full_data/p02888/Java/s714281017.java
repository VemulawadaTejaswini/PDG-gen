import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        for(int i=0;i<N;i++){
            L[i] = sc.nextInt();
        }
        int count = 0;

        for(int i=0;i<L.length;i++) {
            for(int j=i+1;j<L.length;j++){
                for(int k=j+1;k<L.length;k++){
                    if(L[i] < L[j] + L[k] && L[j] < L[i] + L[k] && L[k] < L[i] + L[j]){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
        
    }
}