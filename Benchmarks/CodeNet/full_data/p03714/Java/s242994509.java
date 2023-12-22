import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strs = br.readLine().split(" ");
		
		LinkedList<Integer> left = new LinkedList<Integer>();
		ArrayList<Integer> mid = new ArrayList<Integer>();
		LinkedList<Integer> right = new LinkedList<Integer>();
		
		
		for(int i = 0 ; i < n*3 ; i++){
			if(i < n){
				insert(left,Integer.parseInt(strs[i]));
			}else
			if(i < n*2){
				mid.add(Integer.parseInt(strs[i]));
			}else{
				insert(right,Integer.parseInt(strs[i]));
			}
		}
		
		int stBig = 0;
		for(int d : left){
			stBig += d;
		}
		int stLit = 0;
		for(int d : right){
			stLit += d;
		}
		
		int[] map = new int[n+1];
		for(int i = 0 ;i < map.length ; i++){
			map[i] = 0;
		}
		
		int plus = 0;
		for(int i = 0 ; i < mid.size() ; i++){
			if(left.getFirst() < mid.get(i) ){
				plus += mid.get(i) - left.getFirst();
				insert(left,mid.get(i));
				left.removeFirst();
			}
			map[i+1] += plus;
		}
		
		plus = 0;
		for(int j = 0 ; j < mid.size() ; j++){
			int i = mid.size() - j -1;
			if(right.getLast() > mid.get(i) ){
				plus += right.getLast() - mid.get(i);
				insert(right,mid.get(i));
				right.removeLast();
			}
			map[i] += plus;
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < map.length ; i++){
			max = (max < map[i])? map[i] : max;
		}
		System.out.println((stBig-stLit)+max);
		
	}
	
	public static void insert(LinkedList<Integer> list , int num){
		int i = 0;
		for(i = 0 ; i < list.size() ; i++){
			if(list.get(i) > num)
				break;
		}
		list.add(i,num);
	}
}
