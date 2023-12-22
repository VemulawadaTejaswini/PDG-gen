import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 


public class Main {
	static int a1[]= {0,-1,0,1};
	static int b1[]= {-1,0,1,0};
	private static Scanner sc = new Scanner(System.in);
	//result = Math.pow(num1, num3)
	//StringBuffer str = new StringBuffer(hoge1);
	//String hoge2 = str.reverse().toString();
	//map.containsKey(A)

	//Map<String, Integer> map = new HashMap<String, Integer>(n);
	/*for ( キーのデータ型 key : マップの名前.keySet() ) {
		データのデータ型 data = マップの名前.get( key );
		
		// keyやdataを使った処理;
	}*/
	//int i = Integer.parseInt(s);
	//Queue<String> qq=new ArrayDeque<>(); //add,poll,peek
	//Deque<String> qq=new ArrayDeque<>();//push,pop,peek
	//ArrayList<String> cc = new ArrayList<>(n);
	//Collections.sort(list);
	//Array.sort(list);
	//Arrays.asList(c).contains("a")
	//list.set(1,"walk");
	public static void main(String[] args) {
		String S=sc.next();//65 //67 //71//84
		int ctn=0;
		int ans=0;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)==65||S.charAt(i)==67||S.charAt(i)==71||S.charAt(i)==84) {
				ctn++;
			}else {
				ctn=0;
			}
			ans=Math.max(ans, ctn);
		}
		p(ans);
	}
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
}
	