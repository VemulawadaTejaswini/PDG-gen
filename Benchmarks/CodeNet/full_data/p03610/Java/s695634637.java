import java.util.*;
class Main{
	public static void main(String[] args){
		Runtime rt = Runtime.getRuntime();
		Scanner in = new Scanner(System.in);
		ArrayList<String> input = new ArrayList<String>();
		while(in.hasNext()){
			input.add(in.next());
		}
		String s=input.get(0);
		char[] s2=s.toCharArray();
		String a="";
		for (int i=0;i<s.length();i=i+2){
			a+=s2[i];
			if(i%1009==0)rt.gc();
		}
		System.out.println(a);
	}
}