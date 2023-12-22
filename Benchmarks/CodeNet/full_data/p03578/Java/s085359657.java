import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> D_i = new ArrayList<Integer>();
		for(int i=0;i<N;i++)
		{
		  D_i.add(sc.nextInt());
		}
		Collections.sort(D_i);
				
		int M = sc.nextInt();
		int ti[]=new int[M];
		for(int i=0;i<M;i++)
		{
			ti[i]=sc.nextInt();
		}
		sc.close();
		
		/*判定*/
		boolean flg=true;
		for(int i=0;i<M;i++)//t
		{
			int tmp=binary_search(D_i,ti[i],0,D_i.size()-1);
			if(tmp!=-1)
			{
				D_i.remove(tmp);
			}
			else
			{
				flg=false;
				break;
			}
		}
		
		String ans = flg? "YES":"NO"; 
		System.out.println(ans);

		
	}
	
	final static int KEY_NOT_FOUND =-1;
	static int binary_search(List<Integer> list, int key, int imin, int imax) 
	{
	    if (imax < imin) 
	    {
	        return KEY_NOT_FOUND;
	    }
	    else
	    {
	        int imid = imin + (imax - imin) / 2;
	        if (list.get(imid) > key)
	        {
	            return binary_search(list, key, imin, imid - 1);
	        }
	        else if (list.get(imid) < key)
	        {
	            return binary_search(list, key, imid + 1, imax);
	        }
	        else
	        {
	            return imid;
	        }
	    }
	}

}
