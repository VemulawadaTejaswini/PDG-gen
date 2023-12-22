import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		String[] s = new String[k];
		Arrays.setAll(s, i -> sc.next());
		loop:
		for(int i=n; ; i++){
			for(int j=0; j<s.length; j++){
				if(String.valueOf(i).contains(s[j])){
					continue loop;
				}
			}
			System.out.println(i);
			break;
		}
	}
}
