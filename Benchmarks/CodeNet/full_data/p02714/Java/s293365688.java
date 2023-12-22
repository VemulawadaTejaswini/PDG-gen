import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        long count = 0;
        for(int i=0;i<N;i++)
        {
            String first = S.substring(i,i+1);
            for(int j=i+1;j<N;j++)
            {
                String second = S.substring(j,j+1);
                for(int k=j+1;k<N;k++)
                {
                    String third = S.substring(k,k+1);
                    if(j - i == k - j)
                        continue;
                    if(!(first.equals(second)) && !(first.equals(third)) && !(second.equals(third))) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
