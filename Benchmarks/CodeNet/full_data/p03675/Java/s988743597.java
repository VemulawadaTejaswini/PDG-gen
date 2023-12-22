import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0;i < n;i++)
            a[i] = sc.nextInt();
        List<Integer> odd = new LinkedList<>();
        List<Integer> even = new LinkedList<>();

        for(int i = 0;i < n;i++) {
            if (i % 2 == 0)
                odd.add(a[i]);
            else
                even.add(a[i]);
        }
        if(n % 2 == 0)
        {
            Collections.reverse(even);
            for(int i = 0;i < odd.size();i++)
                even.add(odd.get(i));
            lsp(even);
        }
        else
        {
            Collections.reverse(odd);
            for(int i = 0;i < even.size();i++)
                odd.add(even.get(i));
            lsp(odd);
        }

    }
    private static void lsp(List ls)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < ls.size() - 1;i++)
            sb.append(ls.get(i) + " ");
        sb.append(ls.get(ls.size() - 1));
        System.out.println(sb.toString());
    }
}
