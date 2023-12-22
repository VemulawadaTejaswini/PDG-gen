import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DataSet d = new DataSet();
		d.input();
		Main m = new Main();
		System.out.println(m.calc(d));
	}
	
	public int calc(DataSet d){
		int min = 100000;
		for(char c='a';c<='z';c++){
			int count =0;
			int max = 0;
			for(int i=0;i<=d.s.length;i++){
				if(i == d.s.length){
					max = Math.max(count, max);
					min = Math.min(min, max);
				}
				else if(d.s[i]==c){
					max = Math.max(count, max);
					count = 0;
				}
				else count++;
			}
		}
		return min;
	}

}

class DataSet{
	
	String S;
	char[] s;
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		s = new char[S.length()];
		for(int i=0;i<S.length();i++)
			s[i] = S.charAt(i);
		
		sc.close();
	}
	
}