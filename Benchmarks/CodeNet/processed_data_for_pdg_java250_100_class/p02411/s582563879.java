public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> mid = new ArrayList<Integer>();
		ArrayList<Integer> fin = new ArrayList<Integer>();
		ArrayList<Integer> re = new ArrayList<Integer>();
		String[] strs = new String[3];
		int[] buf = new int[3];
		while(true)
		{
			strs = br.readLine().split(" ");
			for(int i=0; i<3; i++)	buf[i] = Integer.parseInt(strs[i]);
			if(buf[0]+buf[1]+buf[2]==-3) break;
			mid.add(buf[0]);
			fin.add(buf[1]);
			re.add(buf[2]);
		}
		int stu = mid.size();
		int m, f, r, mix;
		for(int i=0; i<stu; i++)
		{
			m = mid.get(i);
			f = fin.get(i);
			r = re.get(i);
			mix = m + f;
			if(m==-1 || f==-1 ||(mix>=0 &&mix<30)) 
			{
				System.out.println("F");
				continue;
			}
			else if(mix>=80)
			{
				System.out.println("A");
				continue;
			}
			else if(mix>=65&&mix<80)
			{
				System.out.println("B");
				continue;
			}
			else if((mix>=50&&mix<65)||(mix>=30&&mix<50&&r>=50))
			{
				System.out.println("C");
				continue;
			}
			else if(mix>=30&&mix<50&&r<50)
			{
				System.out.println("D");
				continue;
			}
		}	
	}
}
