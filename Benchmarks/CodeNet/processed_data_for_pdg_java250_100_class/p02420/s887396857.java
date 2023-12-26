class Main
{
public static void main (String[] args) throws java.lang.Exception
{
	Scanner scan = new Scanner(System.in);
	List<String> list = new ArrayList<String>();
	while (true) {
		String str = scan.next();
		if ("-".equals(str)) {
			break;
		}
		int m = scan.nextInt();
		int h[] = new int[m];
		for (int i = 0; i < m; i++) {
			h[i] = scan.nextInt();
			str = str.substring(h[i]) + str.substring(0, h[i]);						
		}
		list.add(str);
	}
	for (String str : list) {
		System.out.println(str); 
	}
}
}
