import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);
		
		Info info[] = new Info[m];
		for(int i = 0; i < m; i++){
			tmpArray = br.readLine().split(" ");
			info[i] = new Info(Integer.parseInt(tmpArray[0]), 
					Integer.parseInt(tmpArray[1]), 
					Integer.parseInt(tmpArray[2])
					);
		}
		
		Arrays.sort(info);
		
		Person[] people = new Person[n];
		for(int i = 0; i < n; i++){
			people[i] = new Person();
		}
		
		boolean available = true;
		for(int i = 0; i < m; i++){
			Person p1 = people[info[i].l - 1];
			Person p2 = people[info[i].r - 1];
			int d = info[i].d;
			//どちらも未確定
			if(!p1.fixed && !p2.fixed){
				p1.setPos(0);
				p2.setPos(d);
			}
			//p1だけ確定
			else if(!p2.fixed){
				p2.setPos(p1.pos + d);
			}
			//p2だけ確定
			else if(!p1.fixed){
				p1.setPos(p2.pos + d);
			}
			//両方とも確定（矛盾チェック）
			else {
				if(p1.pos + d != p2.pos){
					available = false;
					break;
				}
			}
			
		}
		
		if(available){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}

}

class Person {
	boolean fixed = false;
	long pos = Long.MIN_VALUE;
	
	public void setPos(long pos){
		fixed = true;
		this.pos = pos;
	}
}

class Info implements Comparable<Info>{
	int l;
	int r;
	int d;
	
	public Info (int l, int r, int d){
		if(l <= r){
			this.l = l;
			this.r = r;
			this.d = d;
		}
		else {
			this.l = r;
			this.r = l;
			this.d = -d;
		}
	}

	@Override
	public int compareTo(Info info) {
		// TODO Auto-generated method stub
		return this.l == info.l ? (this.r - info.r) : this.l - info.l;
	}
}