import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] xy = new int[N][2];
        for(int i=0;i<N;i++){
            xy[i][0]=sc.nextInt();
            xy[i][1]=sc.nextInt();
        }
        myComparator mc = new myComparator();
        Arrays.sort(xy, mc);
        long ans = Long.MAX_VALUE;
        for(int left=0;left<=N-K;left++){
            for(int right=left+K-1; right<N; right++){
                int l = xy[left][0];
                int r = xy[right][0];
                long[] curY = new long[right-left+3];
                for(int i=1;i<=right-left+1;i++){
                    curY[i] = xy[left+i-1][1]-xy[left][1];
                }
                curY[0] = Integer.MIN_VALUE;
                curY[curY.length-1] = Integer.MAX_VALUE;
                Arrays.sort(curY);
                int pos = Arrays.binarySearch(curY,0);
                int cnt = 1;
                int up = pos;
                int low = pos;
                while(cnt<K){
                    if(Math.abs(curY[low]-curY[low-1])<Math.abs(curY[up+1]-curY[up])) low--;
                    else up++;
                    cnt++;
                }
                long curAns = (((long)r-(long)l)*(curY[up]-curY[low]));
                ans = Math.min(ans,curAns);
            }
        }
        System.out.println(ans);
    }
    private static class myComparator implements Comparator<int[]>{
        public int compare(int[] o1, int[] o2){
            return o1[0]-o2[0];
        }
    }
}