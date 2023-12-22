import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long P = sc.nextLong();
        String S = sc.next();
        long sum = 0;
        boolean[] visited = new boolean[S.length()+1];
        Arrays.fill(visited, false);
        for(int i=0;i<S.length();i++){
            if(visited[i]){continue;}
            sum += getSum(S, i, visited, P);
        }
        System.out.println(sum);
    }

    private static long getSum(String S, int start, boolean[] visited, long P){
        int now = start;
        long renzoku=0;
        long sum = 0;
        while(now < S.length()){
            int next = getWordEnd(S, now, P);
            if(next == -1){
                sum += renzoku * (renzoku+1) / 2;
                //System.out.println("from " + start + ":" + sum);
                return sum;
            }else{
                visited[now] = true;
                renzoku++;
                now = next;
            }
        }
        sum += renzoku * (renzoku+1) / 2;
        //System.out.println("from " + start + ":" + sum);
        return sum;
    }

    private static int getWordEnd(String S, int from, long P){
        long val = S.charAt(from)-'0';
        int ind = from+1;
        while(val % P != 0 && ind < S.length()){
            val *= 10;
            val += (S.charAt(ind)-'0');
            val %= P;
            ind++;
        }
        if(val % P == 0){
            return ind;
        }else{
            return -1;
        }
    }
}
