public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		try {
			int x,y;
			while(scan.hasNext()){
				x=scan.nextInt();
				y=scan.nextInt();
				System.out.println(Integer.toString(x+y).length());
			}
		} catch (Exception e) {
		}
	}
}
