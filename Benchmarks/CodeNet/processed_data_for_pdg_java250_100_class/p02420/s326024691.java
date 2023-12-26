public class Main{
	public static void main(String[] args) {
		String c="";
		Scanner sc=new Scanner(System.in);
		while(true) {
			String str=sc.next();
			int n=str.length();
			if(str.equals("-")) {
				break;
			}
			int m=Integer.parseInt(sc.next());
			for(int i=0;i<m;i++) {
				int h=Integer.parseInt(sc.next());
				String a=str.substring(0,h);
				String b=str.substring(h,n);
				str=b+a;
			}
			System.out.println(str);
		}
	}
}
