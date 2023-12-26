public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toCharArray();
		for(int i = 0; i < str.length; i++){
			if(str[i] == '1'){
				str[i] = '9';
			}
			else if(str[i] == '9'){
				str[i] = '1';
			}
		}
		System.out.println(str);
	}
}
