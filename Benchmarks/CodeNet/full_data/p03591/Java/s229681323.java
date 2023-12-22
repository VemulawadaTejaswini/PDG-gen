class Main
{
    public static void main(String args[])
    {
        try{
            java.util.Scanner s1=new java.util.Scanner(System.in);
            String n=s1.next();
            String s=n.substring(0,4);
            if(s.equals("YAKI"))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        catch(Exception e)
        {
            
        }
    }
}