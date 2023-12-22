import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s1=sc.nextLine();
        //String s2=sc.nextLine();
        int ind=s1.indexOf(" ");
        ind++;
        for(int i=0;i<n;i++,ind++)
        {
            System.out.print(s1.charAt(i));
            System.out.print(s1.charAt(ind));
        }
    }
}