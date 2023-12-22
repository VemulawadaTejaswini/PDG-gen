import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int[][] ab = new int[N][N];
        for(int i=0; i<N; i++){
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }
        myComparator mc = new myComparator();
        Arrays.sort(ab, mc);
        int aMax = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            aMax = Math.max(aMax,ab[i][0]);
        }
        int pos = -1;
        for(int i=N-1; i>=0; i--){
            if(aMax>=ab[i][1]){
                pos = i;
                break;
            }
        }

        if(pos!=-1){
            for(int i=N-1;i>=pos; i--){
                H = H-ab[i][1];
                if(H<=0){
                    System.out.println(N-i);
                    System.exit(0);
                }
            }
            System.out.println(N-pos+(H+1)/aMax);
        }
        else{ // least throw is more powerful than highest wield
            for(int i=N-1;i>=0; i--){
                H = H-ab[i][1];
                if(H<=0){
                    System.out.println(N-i);
                    System.exit(0);
                }
            }
            System.out.println(N+(H+1)/aMax);
        }



    }
    private static class myComparator implements Comparator<int[]>{
        public int compare(int[] o1, int[] o2){
            return o1[1]-o2[1];
        }
    }
}