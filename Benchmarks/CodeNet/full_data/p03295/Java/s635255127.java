import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] ab = new int[M][2];
        for(int i=0;i<M;i++){
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }
        myComparator mc = new myComparator();
        Arrays.sort(ab);
        int ans = 0;
        int i=0;
        while(i<N){
            int right = ab[i][1];
            while(i<N&&ab[i][0]<right) i++;
            ans += 1;
        }
        
        
        
        
        System.out.println(ans);
    }
    public static class myComparator implements Comparator<int[]>{
        @Override
        public int compare(int[] o1, int[] o2) {
            if(o1[0]-o2[0]!=0) return (o1[0]-o2[0]);
            else return o1[1]-o2[1];
        }
    }
}
