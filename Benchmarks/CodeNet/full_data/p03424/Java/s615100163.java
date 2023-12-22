import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			sc.nextLine();
			String S = sc.nextLine();
			String[] arare = S.split(" ", 0);
			List<String> listA = new ArrayList<String>();
			for(int i=0; i<arare.length; i++){
				listA.add(arare[i]);
				//System.out.println(S);
			}
			//System.out.println(listA);
			List<String> listB = new ArrayList<String>(new HashSet<>(listA));
			//System.out.println(listB.size());
			if(listB.size()==3){
				System.out.println("Three");
			}else if(listB.size()==4){
				System.out.println("Four");
			}
		}
}
