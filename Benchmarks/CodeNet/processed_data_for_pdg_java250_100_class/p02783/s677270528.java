public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int H = s.nextInt();
        int A = s.nextInt();
        int ans;
        if(H%A==0)
            ans=H/A;
        else 
             ans = H/A + 1;
        System.out.println(ans);
    }
}
