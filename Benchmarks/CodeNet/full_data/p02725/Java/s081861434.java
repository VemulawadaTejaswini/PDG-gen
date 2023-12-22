import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(s.nextLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(s.nextLine());
        int[] houses = new int[N];
        for(int i=0;i<N;i++)
        {
            houses[i] = Integer.parseInt(st.nextToken());
        }
        int distance = Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            int start = houses[i];
            int end = 0;
            if(i==N-1)
                end = houses[0];
            else
                end = houses[i+1];
            if(end == 0)
                end = K;
            int d = K - (Math.abs(start - end));
            //System.out.println("i:" + i + "start: " + start + "end:" + end + "d: " + d);
            distance = Math.min(distance, d);
        }
        System.out.println(distance);
    }
}
