public class Main{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String ss=s.next();
        if(t%2==1)
        System.out.println("No");
        else if(!ss.substring(0,t/2).equals(ss.substring(t/2,t)))
        System.out.println("No");
        else
        System.out.println("Yes");
      s.close();
        }
        }
