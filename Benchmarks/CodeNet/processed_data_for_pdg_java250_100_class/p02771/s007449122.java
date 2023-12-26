public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<3;i++)
		{
			int a=in.nextInt();
			set.add(a);
		}
		if(set.size()==2)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
