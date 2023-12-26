public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		Set<Integer> map = new HashSet<Integer>();
		map.add(a);
		int count = 0;
		if(map.contains(b)){
			count++;
		}else map.add(b);
		if(map.contains(c)){
			count++;
		}else map.add(c);
		if(count == 1){
			System.out.println("Yes");
		}else System.out.println("No");
	}
}
