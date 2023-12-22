import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < range; i++){
			set.add(sc.next()); 
		}
		if ( set.size() < range){
        	System.out.println("NO");
        }else{
         	System.out.println("YES"); 
        }
	}
}	