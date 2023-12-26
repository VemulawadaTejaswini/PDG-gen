public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yohou = sc.next();
		String result = sc.next();
		int count = 0;
		int j = 0;
		String a,b;
		for(int i = 0; i < 3; i++) {
			j= i;
			a = yohou.substring(i, i+1);
			b = result.substring(j, j+1);
			if(a.equals(b)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
