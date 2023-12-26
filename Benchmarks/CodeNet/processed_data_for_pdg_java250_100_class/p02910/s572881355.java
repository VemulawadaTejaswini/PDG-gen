public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine(); 
		sc.close();
		int length = S.length();
		boolean flag = true;
		for(int i=1;i<=length;i++) {
			int index = i%2;
			String firstS = S.substring(0,1);
			if(index==1) {
				if(firstS.equals("L")) {
					flag = false;
					break;
				}
			}else if(index==0) {
				if(firstS.equals("R")) {
					flag = false;
					break;
				}
			}
			S = S.substring(1);
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
