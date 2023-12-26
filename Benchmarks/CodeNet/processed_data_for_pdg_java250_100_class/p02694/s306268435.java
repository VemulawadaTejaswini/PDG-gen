public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        long x=Long.parseLong(br.readLine());
        long sum=100;
        int cntr=0;
        while(sum<x)
        {
            sum=sum+sum/100;
            cntr++;
        }
        pw.println(cntr);
        pw.flush();
        pw.close();
    }
}
