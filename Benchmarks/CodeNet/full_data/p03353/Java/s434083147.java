import java.util.Scanner;
import java.util.TreeSet;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int x = scan.nextInt();
		TreeSet<String> list  = new TreeSet<String>();

		if(s.length() == 1){
			System.out.println(s);
			
		}else{
			for(int i =0; i < s.length()-1;i++){
				for(int j = i+1;j <= s.length();j++){
					if(j -i > 5){
						break;	
					}	
					list.add(s.substring(i, j));
				}
			}
			int c = 0;
			for(String a:list){
				if(c == x -1){
					System.out.println(a);
					break;
				}
				c++;
			}
		}
	}
}




