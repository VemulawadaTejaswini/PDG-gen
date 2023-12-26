public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<k; i++)
        {
            int d = s.nextInt();
            for(int j=0; j<d; j++)
            {
                int x = s.nextInt();
                a[x-1]++;
            }
        }
        int c = 0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==0)
                c++;
        }
        System.out.println(c);
    }
}
