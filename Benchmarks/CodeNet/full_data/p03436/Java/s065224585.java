import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
 

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
public class Main {
	static int a1[]= {0,-1,0,1};
	static int b1[]= {-1,0,1,0};
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	static int K;
	public static void main(String[] args) {
		int H=sc.nextInt();int W=sc.nextInt();
		int v[][]=new int[H][W];
		String tmp;
		int ctn=0;
		for(int a=0;a<H;a++) {
			tmp=sc.next();
			for(int b=0;b<W;b++) {
				v[a][b]=tmp.charAt(b);
				if(v[a][b]==46) {
					ctn++;
				}
			}
		}
		int sx=0;int sy=0;
		int gx=H-1;int gy=W-1;
		//# 35 . 46
		Queue<Integer> q1=new ArrayDeque<>();
		Queue<Integer> q2=new ArrayDeque<>();
		Queue<Integer> q3=new ArrayDeque<>();
		q1.add(sx);q2.add(sy);q3.add(0);
		v[sx][sy]=35;
		int x,y,i;
		int ans=0;
		while(q1.peek()!=null) {
			x=q1.poll();
			y=q2.poll();
			i=q3.poll()+1;
			//p("FIRST"+"      "+x+" "+y);
				for(int b=0;b<4;b++) {
				//	p("b"+b);
					if(x+a1[b]>=0&&y+b1[b]>=0) {
						if(x+a1[b]<H&&y+b1[b]<W) {
						if(v[x+a1[b]][y+b1[b]]==46) {
							q1.add(x+a1[b]);
							q2.add(y+b1[b]);
							q3.add(i);
							v[x+a1[b]][y+b1[b]]=35;
							if(gx==x+a1[b]&&gy==y+b1[b]) {
							//	p("GOT GOAL"+"        "+i);
								ans=i;
								break;
							}
						}
						}
					}
				}
			
		}
		p(ctn-ans-1);
		
		
		
	}	
}
