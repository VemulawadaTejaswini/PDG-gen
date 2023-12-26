public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for(int i = 3; i <= n; i++){
			if(i % 3 == 0){
				System.out.print(" " + i);
			}else{
				String strNum = String.valueOf(i);
				boolean isMatch = false;
				for(int j = 0; j < strNum.length(); j++){
					char x = strNum.charAt(j);
					if(x == '3'){
						isMatch = true;
					}
				}
				if(isMatch){
					System.out.print(" " + i);					
				}
			}
		} 
		System.out.println();
	}
}
