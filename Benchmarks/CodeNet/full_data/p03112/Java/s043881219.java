import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long a=sc.nextLong();
		Long b=sc.nextLong();
		Long c=sc.nextLong();

		List<Long> l1=new ArrayList<Long>();
		List<Long> l2=new ArrayList<Long>();
		List<Long> l3=new ArrayList<Long>();
		for(int i=0;i<a;i++)
			l1.add(sc.nextLong());
		for(int i=0;i<b;i++)
			l2.add(sc.nextLong());
		for(int i=0;i<c;i++)
			l3.add(sc.nextLong());

		TreeSet<Long> ts1=new TreeSet();
		TreeSet<Long> ts2=new TreeSet();
		ts1.addAll(l1);
		ts2.addAll(l2);
	
		
		solve(ts1,ts2,l3);
	}




	private static void solve(TreeSet<Long> ts1, TreeSet<Long> ts2, List<Long> l3) {
		// TODO Auto-generated method stub
		for(Long i:l3){

			 if (ts1.contains(i)&&ts2.contains(i)){
				System.out.println(0);
			}
			else if(ts1.contains(i)){
				Long a=ts2.lower(i);
				Long b=ts2.higher(i);
				if (a==null)
					System.out.println(Math.abs(b-i));
				if (b==null)
					System.out.println(Math.abs(a-i));
				System.out.println(Math.min(Math.abs(a-i), Math.abs(b-i)));
			}
			else if(ts2.contains(i)){
				Long a=ts1.lower(i);
				Long b=ts1.higher(i);
				if (a==null)
					System.out.println(Math.abs(b-i));
			 if (b==null)
					System.out.println(Math.abs(a-i));
				System.out.println(Math.min(Math.abs(a-i), Math.abs(b-i)));
			}
			Long a=ts1.lower(i);
			Long b=ts1.higher(i);
			Long c=ts2.lower(i);
			Long d=ts2.higher(i);

			if(a==null && c==null){
				System.out.println(Math.max(b, d)-i);
			}
			else if(b==null && d==null){
				System.out.println(i-Math.min(a, c));
			}
			else if(a==null){
				Long tmp1=Math.max(b, d)-i;
				Long tmp2=b-c+Math.min(b-i, i-c);
				System.out.println(Math.min(tmp1, tmp2));
			}
			else if(b==null){
				Long tmp1=i-Math.min(a, c);
				Long tmp2=d-a+Math.min(i-a, d-i);
				System.out.println(Math.min(tmp1, tmp2));
			}
			else if(c==null){
				Long tmp1=Math.max(b, d)-i;
				Long tmp2=d-a+Math.min(d-i, i-a);
				System.out.println(Math.min(tmp1, tmp2));
			}
			else if(d==null){
				Long tmp1=i-Math.min(a, c);
				Long tmp2=b-c+Math.min(b-i, i-c);
				System.out.println(Math.min(tmp1, tmp2));
			}

			else{
				Long tmp1 = b - c + Math.min(b - i, i - c);
				tmp1=Math.min(tmp1, d-a+Math.min(i-a, d-i));
				tmp1=Math.min(tmp1, i-Math.min(a, c));
				tmp1=Math.min(tmp1, Math.max(b, d)-i);

				System.out.println(tmp1);
			}
	
			
		}
	}




}
