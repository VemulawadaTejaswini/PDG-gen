import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public classMain {

	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  int N = sc.nextInt();
		  String S = sc.next();
		  sc.close();
		  
		  int answer = 0;
		  
		  for(int j = 1; j < N; j++) {
			  List<Character> aList = new ArrayList<>();
			  List<Character> bList = new ArrayList<>();
			  String a = S.substring(0, j);
			  String b = S.substring(j, N);

			  for(int i = 0; i < a.length(); i++) {
				  if(!aList.contains(a.charAt(i))) aList.add(a.charAt(i));
			  }
			  
			  for(int i = 0; i < b.length(); i++) {
				  if(!bList.contains(b.charAt(i))) bList.add(b.charAt(i));
			  }
			  
			  char alphabet = 'a';
			  int count = 0;
			  for(int i = 0; i < 26; i++) {
				  if(aList.contains((char)(alphabet + i)) && bList.contains((char)(alphabet + i))) {
					  count++;
				  }
			
			  }
			  answer = Math.max(answer, count);
		  }
		  
		  System.out.println(answer);
	      System.exit(0);
	    }
}