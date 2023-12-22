import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] str = s.split("");

		for(int i=0;i<str.length;i++){
			if(str[i] != str[str.length -1 - i]){
				str[str.length - 1 - i] = str[i]; 
			}
		}
		for(int i=0;i<str.length;i++){
			System.out.print(str[i]);
		}
		System.out.print("\n");
	}
}
