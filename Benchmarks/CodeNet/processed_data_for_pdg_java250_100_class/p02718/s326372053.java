public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count=0;
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			count=count+a;
			list.add(a);
		}
		int ko = 0;
		for(int i=0;n>i;i++) {
			if(list.get(i)*4*m>=count)
				ko++;
		}
		if(ko>=m)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
