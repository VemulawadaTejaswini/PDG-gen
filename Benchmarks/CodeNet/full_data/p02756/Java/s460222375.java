import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Q = sc.nextInt();
		StringBuffer str = new StringBuffer(S);

		String[] kaisu = new String[Q];
		for (int i = 0; i < kaisu.length; i++) {
			if(sc.nextInt() ==1){
				str = str.reverse();
			}else{
				if(sc.nextInt()==1){
					str = str.insert(0, sc.next());
				}else{
					str = str.insert(str.length(), sc.next());
				}
			}
				
		}
		System.out.println(str);
      	sc.close();
    }
		
		
}