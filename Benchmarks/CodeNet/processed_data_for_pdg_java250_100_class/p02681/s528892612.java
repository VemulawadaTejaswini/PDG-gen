public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        char carr1[]=br.readLine().toCharArray();
        char carr2[]=br.readLine().toCharArray();
        boolean b=true;
        for(int i=0;i<carr1.length;i++)
        {
            if(carr1[i]!=carr2[i])
            {
                b=false;
                break;
            }
        }
        if(b)
        pw.println("Yes");
        else
        pw.println("No");
        pw.flush();
        pw.close();
    }
}
