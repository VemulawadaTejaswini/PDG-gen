import java.util.Scanner;

/*
As the name of the class should be Solution, using Solution.java as the filename is recommended.
In any case, you can execute your program by running 'java Solution' command.
*/
public class Main
{

	public static void main(String args[]) throws Exception
	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */
		//System.setIn(new FileInputStream("res/input.txt"));

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		/*
     			Read each test case from standard input.
     		*/		
			int n=sc.nextInt();
        int k=sc.nextInt();
            int []h=new int [n];
            int [] ans=new int [n];
            for(int i=0;i<n;i++)
            {
                h[i]=sc.nextInt();
                ans[i]=Integer.MAX_VALUE;
            }
            ans[0]=0;
        	ans[1]=ab(h[0]-h[1]);
        if(k>n)
            k=n;
        	for(int i=1;i<k;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    ans[i]=min(ans[i],ans[i-j]+ab(h[i]-h[i-j]));
                }
            }
        
            for(int i=k;i<n;i++)
            {
                for(int j=k;j>=0;j--)
                {
                    ans[i]=min(ans[i],ans[i-j]+ab(h[i]-h[i-j]));
                }
            }	
            System.out.println(ans[n-1]);
    }
    public static int ab(int n)
    {
        if(n<0)
            return -n;
        return n;
    }
    public static int min(int a,int b)
    {
        if(a<b)
            return a;
        return b;
    }
   

}