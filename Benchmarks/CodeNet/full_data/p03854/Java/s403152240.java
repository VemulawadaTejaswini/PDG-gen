import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t="";
		while(true){
			if(s.equals("")){
				System.out.println("YES");
				return;
			}else if( (s.length()>=7)&&(s.substring(0,7).equals("dreamer"))){
				s = s.substring(7);
				t = t+"dreamer";
			
			}else if( (s.length()>=6)&&(s.substring(0,6).equals("eraser"))){
				s = s.substring(6);
				t = t+"eraser";
			}else if( (s.length()>=5)&&(s.substring(0,5).equals("dream"))){
				s = s.substring(5);
				t = t+"dream";
			}else if( (s.length()>=5)&&(s.substring(0,5).equals("erase"))){
				s = s.substring(5);
				t = t+"erase";
			}else{
				System.out.println("NO");
				return;
			}
		}
	}
}