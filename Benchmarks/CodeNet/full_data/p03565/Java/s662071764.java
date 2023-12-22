import java.util.*;
public class Main{
	public static void main(String[] argv){
		DubiousDco.run();
	}
}

class DubiousDco{
	public static void run(){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int ps = s.length()-1;
		int temp = s.length()-1;
		int pt = t.length()-1;
		while(ps >= 0){
			if(pt==-1){
				ps = temp+1;
				break;
			}
			if(t.charAt(pt) == s.charAt(temp) || s.charAt(temp) == '?'){
				pt--;
				temp--;
			}else{
				pt = t.length()-1;
				ps--;
				temp = ps;
				if(temp<pt){
					ps = -1;
				}
			}
		}
		if(ps==-1)
			System.out.println("UNRESTORABLE");
		else{
			s = s.substring(0,ps) + t + s.substring(ps+t.length());
			s = s.replace('?', 'a');
			System.out.println(s);
		}
	}
}