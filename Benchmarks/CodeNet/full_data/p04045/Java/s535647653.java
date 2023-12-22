import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int size;
	
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
		
		//돈을 자리수 대로 stack에 쌓는다
		ArrayList<Integer> nArr = new ArrayList<Integer>();
		N = N.reverse();
		for(int i=0; i<N.length(); i++){
			nArr.add(Integer.parseInt(Character.toString(N.toString().charAt(i))));			
		}
		
		size = nArr.size();
		
		for(int i=0; i<size; i++){
			while(true){
				if( disLikes.contains(nArr.get(i)) ){
					if(nArr.get(i) == 9){
						addArr(i, nArr);
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
	
	static void addArr(int i, ArrayList<Integer> nArr){
		//해당 수가 9이고 top일 경우 stack의 사이즈를 1증가시키고 값을 1로 초기화 시킨다.
		if(i == size-1){
			nArr.add(1);
			nArr.set(i, 0);
			size++;
		}else{
			//해당 수가 9인데 top이 아닐경우 해당수를 0으로 세팅한다.
			nArr.set(i, 0);
			
			//다음 수가 9일경우에는 addArr를 한번더 호출한다.
			if(nArr.get(i+1) == 9){
				addArr(i+1, nArr);
			}else{
				//다음 수가 9가 아닐 경우엔  다음수를 +1한 수로 초기화시켜준다.
				nArr.set(i+1, nArr.get(i+1)+1);
			}						
		}
	}
}