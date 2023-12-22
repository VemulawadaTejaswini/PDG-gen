import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int x = scan.nextInt();
		ArrayList<String> list  = new ArrayList<String>();

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
			ArrayList<String> xlist = new ArrayList<String>(new HashSet<>(list));


			Collections.sort(xlist);
			System.out.println(xlist.get(x-1));



		}
	}





}




