import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	List<String> list = new ArrayList<String>();
    for(int i=0;i<n;i++){
    	list.add(scan.next());
    }
    List<Character > b =new ArrayList<Character > () ;
	List<Character > c = new ArrayList<Character >  () ;
	b= cha(list.get(0));
	 Collections.sort(b);
	 if(n==1){
		 for(char t:b){
	    	System.out.print(t);
		 }
	    }else{
	c = cha(list.get(1));
	 	Collections.sort(c);
	 b.retainAll(c);
    for(int i=1;i<n-1;i++){
    	List<Character > d =new ArrayList<Character > () ;
    	List<Character > e = new ArrayList<Character >  () ;
    	d= cha(list.get(i));
    	e = cha(list.get(i+1));
    	Collections.sort(d);
    	Collections.sort(e);
    	 d.retainAll(e);
    	 b.retainAll(d);
      }
    Collections.sort(b);
    for(char g:b){
    System.out.print(g);
    }
}
}
	public static List<Character > cha(String s){
		List<Character > a = new ArrayList<Character >();
		for(int i=0;i<s.length();i++){
			a.add(s.charAt(i));
		}
		return a;
	}
}