import java.util.*;
class Main
{

	public static long reverse(long num)
  {
	long reversed = 0;

        while(num != 0) {
            long digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
		return reversed;
  }

  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	long temp=0;
    for(long i=1; i<=t; i++){
    	for(long j=i+1; j<=t; j++){
        	if((i%10==reverse(j)%10) && (j%10==reverse(i)%10))
			{
				temp+=2;
			}
        }
    }
	
	for(int i=1;i<t;i++)
	{
		if((i%10==reverse(i)%10) && (i%10==reverse(i)%10))
		{
			temp++;
		}
	}
	System.out.println(temp);
  }
}