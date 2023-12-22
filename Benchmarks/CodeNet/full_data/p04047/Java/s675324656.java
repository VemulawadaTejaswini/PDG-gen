import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[2*N];
        for(int i=0;i<L.length;i++){
            L[i]=sc.nextInt();
        }
        int ans = 0;
        Arrays.sort(L);
        for(int i=0;i<L.length;i+=2){
            ans += L[i];
        }
        System.out.println(ans);
    }
}
