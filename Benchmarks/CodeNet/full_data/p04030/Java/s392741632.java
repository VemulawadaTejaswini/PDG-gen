import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		String str2 = "";
		for(char c : str.toCharArray()){
			if(c == 'B'){
				if(!str2.equals("")){
				str2 = str2.substring(0,str2.length()-1);
				}
			}
			else{
				str2 += c;
			}
		}
		System.out.println(str2);
	}

}
