public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int cnt = 0;
		for(char a : S.toCharArray()){
			if(a == '1'){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
