import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args)
    {
	    // Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		// Scanner in = new Scanner(Syste8
    	Scanner in = new Scanner(System.in);
    	Main s = new Main();
    	int n = in.nextInt();
    	int[] a = new int[n];
    	for(int j = 0; j < n; j++)
    	{
    		a[j] = in.nextInt();
    	}
    	s.qc(a);

	}

	void qc(int[] nums)
	{
		int n = nums.length, i = 1, j = n - 1, p = 1, len = nums.length;
		Arrays.sort(nums);
		Deque<Integer> q = new LinkedList<>();
		q.offerFirst(nums[0]);
		n--; // used 1 element
		while(n > 0)
		{
			if(p == 1)
			{
				// add big
				if(j - 1 >= i)
				{
					int a = nums[j], b = nums[j - 1];
					j -= 2;
					// manhattan distance
					q.offerFirst(a);
					q.offerLast(b);
					n -= 2;
				}
				else // only 1 element
				{
					int a = nums[j--];
					int d1 = Math.abs(a - q.peekFirst()), 
						d2 = Math.abs(a - q.peekLast());
					if(d1 > d2) q.offerFirst(a);
					else q.offerLast(a);
					n--;
				}
			}
			else
			{
				// add small
				if(i + 1 <= j)
				{
					int a = nums[i], b = nums[i + 1];
					i += 2;
					q.offerFirst(a);
					q.offerLast(b);
					n -= 2;
				}
				else
				{
					int a = nums[i++];
					int d1 = Math.abs(a - q.peekFirst()), 
						d2 = Math.abs(a - q.peekLast());
					if(d1 > d2) q.offerFirst(a);
					else q.offerLast(a);
					n--;
				}
			}
			p = 1 - p;
		}
		int sum = 0;
		for(int k = 0; k < len; k++)
		{
			nums[k] = q.pollFirst();
		}
		for(int k = 0; k < len - 1; k++)
		{
			sum += Math.abs(nums[k + 1] - nums[k]);
		}
		System.out.printf("%d\n", sum);
	}

	void qb(int a, int b, int k)
	{
		int taka = a, aoki = b, p = 0;
		while(k-- > 0)
		{
			if(p == 0)
			{
				if(taka % 2 != 0) taka--;
				aoki += taka / 2;
				taka /= 2;
			}
			else
			{
				if(aoki % 2 != 0) aoki--;
				taka += aoki / 2;
				aoki /= 2;
			}
			p = 1 - p;
		}
		System.out.printf("%d %d\n", taka, aoki);
	}

	void qa(String str)
	{
		String rev = new StringBuilder(str).reverse().toString();
		if(str.length() == 2) System.out.println(str);
		else System.out.println(rev);
	}
}