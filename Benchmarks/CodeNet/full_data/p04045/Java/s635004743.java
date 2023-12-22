import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int size;
	
	static boolean isTop(ArrayList<Integer> nArr, int i){
		if(i == nArr.size()-1) return true;
		else return false;
	}
	
	static int addArr(ArrayList<Integer> nArr, int i){
		nArr.set(i, 0);
		
		if(isTop(nArr, i)){
			nArr.add(1);
			nArr.set(i, 0);
			size++;
		}
		
		if(nArr.get(i+1) == 9){
			addArr(nArr, i+1);
		}else{
			nArr.set(i+1, nArr.get(i+1)+1);
		}
		
		return i;
	}
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		StringTokenizer strToken = new StringTokenizer(scan.nextLine(), " ");
		StringTokenizer digitToken = new StringTokenizer(scan.nextLine(), " ");
		ArrayList<Integer> disLikes = new ArrayList<Integer>();
		
		StringBuffer N = new StringBuffer(strToken.nextToken());
		StringBuffer K = new StringBuffer(strToken.nextToken());
		
		scan.close();
		
		while(digitToken.hasMoreTokens()){
			disLikes.add(Integer.parseInt(digitToken.nextToken()));
		}
		
		//돈을 자리수 대로 stack에 쌓는다
		ArrayList<Integer> nArr = new ArrayList<Integer>();
		N = N.reverse();
		for(int i=0; i<N.length(); i++){
			nArr.add(Integer.parseInt(Character.toString(N.toString().charAt(i))));			
		}
		
		size = nArr.size();
		
		for(int i=0; i<size;){
			while(true){
				if( disLikes.contains(nArr.get(i)) ){
					if(nArr.get(i) == 9){
						i = addArr(nArr, i);
					}else{
						nArr.set(i, nArr.get(i)+1);
						i++;
					}
				}else{
					break;
				}	
			}
		}
		
		String print="";
		
		for(int i=nArr.size()-1; i >=0; i-- ){
			print += nArr.get(i);
		}
		
		System.out.println(print);
	}
}