public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		String T=sc.next();
		char toridasi=T.charAt(T.length()-1);
		String tasi=S+toridasi;
		if(T.equals(tasi)) {
			System.out.println("Yes");
		}else {
				System.out.println("No");
			}
		}
  }
