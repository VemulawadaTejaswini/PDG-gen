import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //
        Scanner sc = new Scanner(System.in);
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        for (int i = 0;i<3;++i) l1.add(sc.nextInt());
        for (int i = 0;i<3;++i) l2.add(sc.nextInt());
        for (int i = 0;i<3;++i) l3.add(sc.nextInt());
        int n = sc.nextInt();
        List<Integer> b = new ArrayList<>();
        for (int i = 0;i<n;++i) b.add(sc.nextInt());

        boolean tf[][] = new boolean[3][3];
        for (int i=0;i<3;++i)
        {
            for (int j = 0;j<3;++j)
            {
                tf[i][j] = false;
            }
        }

        for (int i:b)
        {
            if (l1.contains(i))
            {
                tf[0][l1.indexOf(i)] = true;
            }else if (l2.contains(i))
            {
                tf[1][l2.indexOf(i)] = true;
            }else if (l3.contains(i))
            {
                tf[2][l3.indexOf(i)] = true;
            }
        }

        if (tf[0][0] && tf[0][1] && tf[0][2]) System.out.println("Yes");
        else if (tf[1][0] && tf[1][1] && tf[1][2]) System.out.println("Yes");
        else if (tf[2][0] && tf[2][1] && tf[2][2]) System.out.println("Yes");
        else if (tf[0][0] && tf[1][0] && tf[2][0]) System.out.println("Yes");
        else if (tf[0][1] && tf[1][1] && tf[2][2]) System.out.println("Yes");
        else if (tf[0][2] && tf[1][2] && tf[2][2]) System.out.println("Yes");
        else if (tf[0][0] && tf[1][1] && tf[2][2]) System.out.println("Yes");
        else if (tf[0][2] && tf[1][1] && tf[2][0]) System.out.println("Yes");
        else System.out.println("No");

        sc.close();
    }
}