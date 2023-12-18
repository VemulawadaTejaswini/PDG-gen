public class Main {
    public static void main (String[] args)
    {
        int[] x = new int[10000];
        int i;
        String s;
        Scanner sc = new Scanner(System.in);
        for (i = 0; true; i++)
        {
            s = sc.nextLine();
            if (s.equals("0")) break;
            x[i] = Integer.parseInt(s);
        }
        sc.close();
        int I = i;
        for (i = 0; i < I; i++)
        {
            System.out.println("Case "+(i+1)+": "+x[i]);
        }
    }
}
