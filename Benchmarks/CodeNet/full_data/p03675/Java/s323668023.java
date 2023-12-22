import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 回数
		int N = sc.nextInt();
		//元になる数列を格納
		ArrayList list = new ArrayList(1);
		ArrayList b = new ArrayList(1);
	
		while (sc.hasNextLine()) {
		  list.add(sc.next());
		    
		}
	
		//メイン処理
		for(int i = 0; i < N; i++){
		    //新しい配列に要素を格納
		    if(i % 2 == N % 2){
		        b.add(list.get(i));
		        
		    }else{
		        b.add(0,list.get(i));
		    }
		}
		//テストコード
		//String str = b.get();
		
		//回答用出力
		for(int j = 0; j < b.size(); j++){
		    if(j == (b.size()-1)){
		        System.out.print(b.get(j));
		    }else{
		        System.out.print(b.get(j)+" ");
		    }
		    //System.out.print(b.get(j));
		}
	    
	}
}