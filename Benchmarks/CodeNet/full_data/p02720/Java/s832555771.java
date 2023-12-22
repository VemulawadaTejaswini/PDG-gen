import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        ArrayDeque<Long> q = new ArrayDeque<>();
        for(long i=1; i<=9; i++)
        {
            q.add(i);
        }
        long tmp = 0;
        for(int i=0; i<k; i++)
        {
            tmp = q.poll();
            if(tmp%10!=0)
            {
                q.add(tmp*10+tmp%10-1);
            }
            q.add(tmp*10+tmp%10);
            if(tmp%10!=9)
            {
                q.add(tmp*10+tmp%10+1);
            }
        }
        System.out.println(tmp);
    }
}