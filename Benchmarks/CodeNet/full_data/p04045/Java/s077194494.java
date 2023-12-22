import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		StringTokenizer strToken = new StringTokenizer(scan.nextLine(), " ");
		StringTokenizer digitToken = new StringTokenizer(scan.nextLine(), " ");
		ArrayList<Integer> disLikes = new ArrayList<Integer>();
		
		StringBuffer N = new StringBuffer(strToken.nextToken());
		StringBuffer K = new StringBuffer(strToken.nextToken());
		
		while(digitToken.hasMoreTokens()){
			disLikes.add(Integer.parseInt(digitToken.nextToken()));
		}
		
		ArrayList<Integer> nArr = new ArrayList<Integer>();
		N = N.reverse();
		for(int i=0; i<N.length(); i++){
			nArr.add(Integer.parseInt(Character.toString(N.toString().charAt(i))));			
		}
		
		int top = nArr.size();
		
		for(int i=0; i<top; i++){
			while(true){
				if( disLikes.contains(nArr.get(i)) ){
					if(nArr.get(i) == 9){
						if(i == top-1){
							nArr.add(1);
							nArr.set(i, 0);
							top = top+1;
						}else{
							nArr.set(i+1, nArr.get(i+1)+1);
							nArr.set(i, 0);
						}
					}else{
						nArr.set(i, nArr.get(i)+1);  							
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