import java.util.Scanner;

public class Main 
{
	static class Node
	{ //Segment Tree.
		//range
		int rangel;
		int ranger;
		
		int val = 0;
		
		Node l = null;
		Node r = null;
		
		int check(int ql, int qr)
		{
			int lin = Math.max(ql, rangel);
			int rin = Math.min(qr, ranger);
			
			if(rin < lin) return 0;
			if(lin == rangel && rin == ranger)
			{
				return val;
			}
			else
			{
				return l.check(lin, rin) + r.check(lin, rin);
			}
			
		}
		
		void update(int pos, int add)
		{
			if(rangel <= pos && pos <= ranger)
			{
				val += add;
				if(l != null)l.update(pos, add);
				if(r != null)r.update(pos, add);
			}
		}
		
		public Node(int l0, int r0)
		{
			rangel = l0;
			ranger = r0;
			
			if(rangel != ranger)
			{ //make children
				int mid = (rangel + ranger)/2;
				//l child
				l = new Node(l0, mid);
				r = new Node(mid+1, r0);
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int q = sc.nextInt();
		//make 26 segment trees
		Node[] seg = new Node[26];
		int[] st = new int[n];
		
		for(int i = 0; i < 26; i++)
			seg[i] = new Node(0, n-1);
		
		//initialize trees
		for(int i = 0; i < s.length(); i++)
		{
			int ch = s.charAt(i) - 'a';
			seg[ch].update(i, 1);
			st[i] = ch;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < q; i++)
		{ //take queries
			int t = sc.nextInt();
			if(t == 1)
			{
				int pos = sc.nextInt()-1;
				//change character
				int ori = st[pos];
				int nw = sc.next().charAt(0) - 'a';
				
				seg[ori].update(pos, -1);
				seg[nw].update(pos, 1);
			}
			else if(t == 2)
			{
				int l = sc.nextInt()-1;
				int r = sc.nextInt()-1;
				
				int an = 0;
				for(int k = 0; k < 26; k++)
				{
					if(seg[k].check(l, r) > 0)an++;
				}
				
				sb.append(an);
				sb.append('\n');
//				System.out.println(an);
				
			}
		}
		
		System.out.print(sb);
		
		
	}

}
