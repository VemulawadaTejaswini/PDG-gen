import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int N = s.length();
        int K = sc.nextInt();
        String[] sub = new String[N * K];
        Arrays.fill(sub, "zzzzzz");
        int cnt = -1;
        for(int i = 1; i <= Math.min(N, K); i++)
            for(int j = 0; j < N - i + 1; j++)
                sub[++cnt] = s.substring(j, j + i);
        Arrays.sort(sub);
        String ans = "";
        int count = 0;
        for(int i = 0; i < N * K; i++){
            if(!sub[i].equals(ans)){
                ans = sub[i];
                count++;
            }
            if(count == K) break;
        }
        System.out.println(ans);   
    }
}