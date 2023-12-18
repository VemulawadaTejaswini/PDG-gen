public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0;i < 3; i++)
        {
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        for(int i = 0; i< 3; i++)
        {
            if(i > 0) System.out.print(" ");
            System.out.print(a[i] );
        }
        System.out.println();
    }
}
