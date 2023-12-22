import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class CharDict{
		List<Integer> pos;
		public CharDict() {
			pos = new ArrayList<Integer>();
		}
		int posArr[];
		void toArray(){
			posArr = new int[pos.size()];
			for(int i = 0 ; i < posArr.length ; ++i){
				posArr[i] = pos.get(i);
			}
		}
		int nextPosition(int currentPosition){
			int last = posArr[posArr.length - 1];
			if(last < currentPosition){
				return posArr[0];
			}
			if(last == currentPosition){
				return currentPosition;
			}
			int insertPoint = Arrays.binarySearch(posArr, currentPosition);
			if(insertPoint >= 0){
				return posArr[insertPoint];
			}
			insertPoint = ~insertPoint;
			return posArr[insertPoint];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		CharDict dicts[] = new CharDict[26];
		char sarr[] = s.toCharArray();
		for(int i = 0 ; i < sarr.length ; ++i){
			int c = sarr[i] - 'a';
			if(dicts[c] == null){
				dicts[c] = new CharDict();
			}
			dicts[c].pos.add(i);
		}
		for(CharDict dict : dicts){
			if(dict != null){
				dict.toArray();				
			}
		}
		int N = s.length();
		char tarr[] = t.toCharArray();
		long ret = 0;
		int pos = 0;
		for(int i = 0 ; i < tarr.length ; ++i){
			int c = tarr[i] - 'a';
			if(dicts[c] == null){
				System.out.println(-1);
				return ;
			}
			CharDict dict = dicts[c];
			int nextP = dict.nextPosition(pos);
			if(nextP >= pos){
				ret += nextP - pos + 1;
			}else{
				ret += nextP + N - pos + 1;
			}
//			System.out.println(nextP);
			pos = nextP + 1;
			if(pos == N){
				pos = 0;
			}
		}
		System.out.println(ret);
	}
}
