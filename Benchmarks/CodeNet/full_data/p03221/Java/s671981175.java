import java.util.*;
//import java.lang.Math;

public class Main{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<Info> list = new ArrayList<>(m);
		for(int i = 0; i < m; ++i){
			int p = sc.nextInt();
			int y = sc.nextInt();
			list.add(new Info(p, y, i));
		}
		
		Collections.sort(list, (I0, I1) -> (I0.p != I1.p) ? I0.p - I1.p : I0.y - I1.y);
		//System.out.println(list);
		
		int x = 1;
		for(int i = 0; i < m; ++i){
			if(i > 0 && list.get(i - 1).p == list.get(i).p){
				++x;
			}else{
				x = 1;
			}
			list.get(i).x = x;
		}
		
		//System.out.println(list);
		Collections.sort(list, (I0, I1) -> I0.o - I1.o);
		//System.out.println(list);
		
		for(int i = 0; i < m; ++i){
			showZero(6 - String.valueOf(list.get(i).p).length());
			System.out.print(list.get(i).p);
			showZero(6 - String.valueOf(list.get(i).x).length());
			System.out.println(list.get(i).x);
		}
	}
	
	static void showZero(int num){
		for(int i = 0; i < num; ++i){
			System.out.print(0);
		}
	}
}

class Info{
	int p;
	int y;
	int o;
	int x;
	
	public Info(int p, int y, int o){
		this.p = p;
		this.y = y;
		this.o = o;
	}
	
	/*@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[p = ");
		sb.append(p);
		sb.append(", y = ");
		sb.append(y);
		sb.append(", o = ");
		sb.append(o);
		sb.append(", x = ");
		sb.append(x);
		sb.append(']');
		return sb.toString();
	}*/
}