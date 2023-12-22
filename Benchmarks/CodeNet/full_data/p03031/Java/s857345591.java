import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int n,m,a,b,p,p2,k,s,switchN;
			int on,check,len;
			double mm;
			int index,index2,index3,result;
			Map <Integer,Integer> mapSwitchN = new HashMap<Integer,Integer> ();
			Map <Integer,Integer> mapS = new HashMap<Integer,Integer> ();
			Map <Integer,Integer> mapP = new HashMap<Integer,Integer> ();
			Map <Integer,Integer> mapAnswer = new HashMap<Integer,Integer> ();
			// All 4, On 3, Off 2, None 1
			String s1,s2,c,ze;
			ze="0000000000";

			n = sc.nextInt();
			m = sc.nextInt();
			
			Map <String,Integer> mapName = new TreeMap<String,Integer> ();
			Map <Integer,Integer> mapScore = new TreeMap<Integer,Integer> ();

			for(index=0;index<m;index++) {
				k = sc.nextInt();
				mapSwitchN.put(index,k);
				for(index2=0;index2<k;index2++){
					s= sc.nextInt();
					mapS.put(index*n+index2,s);
					}
				}
			
			for(index=0;index<m;index++) {
				p = sc.nextInt();
				mapP.put(index,p);
				}
			sc.close();

			result=0;
			mm=Math.pow(2, n);
			LoopX: for(index=0;index<mm;index++) {
				
				s1=Integer.toBinaryString(index);
				len=s1.length();
				s2=s1;
				if(len<n) s2=ze.substring(0,n-len)+s1;
				//System.out.println(s2);
				check=0;
				LoopY: for(index2=0;index2<m;index2++) {
					k=mapSwitchN.get(index2);
					on=0;
					for(index3=0;index3<k;index3++){
						s=mapS.get(index2*n+index3);
						c=s2.substring(s-1,s);
						if(c.contentEquals("1")) on=on+1;
						}
					on=on%2;
					if(on!=mapP.get(index2)) {
						check=1;
						break LoopY;
						}
					}
					//System.out.println(check);
					if(check==0) result++;
				}

			// 出力
			System.out.println(result);

	}
}