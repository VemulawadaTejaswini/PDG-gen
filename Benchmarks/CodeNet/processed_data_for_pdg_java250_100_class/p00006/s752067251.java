public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		try {
			while(scan.hasNext()){
				StringBuffer sb=new StringBuffer(scan.nextLine());
				System.out.println(sb.reverse());
			}
		} catch (Exception e) {
		}
	}
}
