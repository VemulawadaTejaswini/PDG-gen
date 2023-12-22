public class Main {
		public static void main(String[] args){
			int a = new java.util.Scanner(System.in).nextInt();
				// スライムの数
			String b = new java.util.Scanner(System.in).nextLine();
				// 文字列の入力
			if(a >= 2) {
				for(int i = 0; i < b.length()-1; ) {
					if(b.charAt(i) == (b.charAt(i+1))) {
						b = b.substring(0,i+1) + (b.length() >= 3? b.substring(i+2) : "");
					}
					else {
					i++;
					}
				}
			}
			//System.out.println(b);
			System.out.println(b.length());
	     }
	}