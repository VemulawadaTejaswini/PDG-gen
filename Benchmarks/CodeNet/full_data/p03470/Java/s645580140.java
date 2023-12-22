import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] d = new int[n];
        for(int i=0;i<d.length;i++)
        {
            d[i]=scan.nextInt();
        }
        Arrays.sort(d);
        int tmp = d[0],count=1;
        for(int i=1;i<n;i++)
        {
            if(tmp!=d[i])
            {
                tmp=d[i];
                count++;
            }
        }
        
        System.out.println(count);
    }
}