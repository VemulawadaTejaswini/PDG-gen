import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long l, r;
        
        l = sc.nextLong();
        r = sc.nextLong();

        List<Long> list = new ArrayList<>();
        long modNum;
        for(int i = l; i < r+1; i++)
        {
            modNum = i%2019;
            if(!list.contains(modNUm))
            {
                list.add(modNum);
            }
        }
        Collections.sort(list);
        System.out.print(list.get(0)*list.get(1));
    }
}