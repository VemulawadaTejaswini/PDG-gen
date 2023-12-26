public class Main {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true) {
			String str=cin.next();
			if(str.charAt(0)=='-')break;
			int m=cin.nextInt();
			for(int i=0;i<m;i++) {
				int h=cin.nextInt();
				String h1=str.substring(h,str.length());
				String h2=str.substring(0, h);
				str=h1+h2;
			}
			System.out.println(str);
		}
	}
}
