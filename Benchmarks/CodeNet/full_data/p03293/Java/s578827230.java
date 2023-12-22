	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			String str1 = sc.next();
			String str2 = sc.next();

			boolean flg = false;
			char [] array = new char[str1.length()];
			char tmp;

			for(int i =0;i<str1.length();i++) {
				if(str1.equals(str2)) {
					flg = true;
					break;
				}

				for(int j=0;j<str1.length();j++) {
					array[j]=str1.charAt(j);
				}

				tmp = array[array.length-1];

				for(int j=str1.length()-1; j>0;j--) {
					array[j]=str1.charAt(j-1);
				}

				array[0] = tmp;

				StringBuilder sb = new StringBuilder();
				for(int j=0; j<array.length;j++) {
					sb.append(array[j]);
				}
				str1 = new String(sb);

			}

			if(flg == true) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}

		}

	}


