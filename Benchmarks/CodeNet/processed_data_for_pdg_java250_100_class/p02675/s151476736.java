public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Integer.parseInt(sc.next());
		String nn =String.valueOf(n);
		String aaa = nn.substring(nn.length()-1);
		 n = Integer.parseInt(aaa);
		if(n==2||n==4||n==5||n==7||n==9) 
		{System.out.println("hon");
		}else if (n==0||n==1||n==6||n==8) {
			System.out.println("pon");
		}else {
			System.out.println("bon");
		}
	}
}
