
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);


	    int[] button = new int[1000000];
	    button[0] = scan.nextInt();
	    for(int j=1;j<button[0];j++)
	    	button[j]=scan.nextInt();
	    int count = 0;

	    for(int i=1;button[i]==0;i=i+0)
	    	if(button[i]!=0)
	    	{
	     		count++;
	     		if(button[i]==2)
	     		{
	     			System.out.println(count);
	     		break;
	     		}
	     		else
	     		{
	     			button[i]=0;
	    	continue;
	    	    }

	        }
	    	else
	    	{
	    		System.out.println("-1");
	    break;
	    	};


	}

	}


