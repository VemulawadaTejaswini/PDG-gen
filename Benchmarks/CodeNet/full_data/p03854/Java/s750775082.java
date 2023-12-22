import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		if( sc.next().length() >100000 ){
			System.out.println("NO");
			return;
		}

		String s = sc.next();
		while(true){
			if(s.equals("")){
				System.out.println("YES");
				return;
			}else if( (s.length()>=11)&&(s.substring(0,11).equals("dreameraser"))){
				s = s.substring(11);
			}else if( (s.length()>=10)&&(s.substring(0,10).equals("dreamerase"))){
				s = s.substring(10);
			}else if( (s.length()>=7)&&(s.substring(0,7).equals("dreamer"))){
				s = s.substring(7);
			}else if( (s.length()>=6)&&(s.substring(0,6).equals("eraser"))){
				s = s.substring(6);
			}else if( (s.length()>=5)&&(s.substring(0,5).equals("dream"))){
				s = s.substring(5);
			}else if( (s.length()>=5)&&(s.substring(0,5).equals("erase"))){
				s = s.substring(5);
			}else{
				System.out.println("NO");
				return;
			}
		}
	}
}