public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        String S = s.next();
        String T = s.next();
        if(T.length()==S.length()+1)
        {
            if((S+T.charAt(T.length()-1)).equals(T))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else
            System.out.println("No");
    }
}
