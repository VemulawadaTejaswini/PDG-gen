import java.util.*;
public class Main{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	ArrayList<Integer> intList = new ArrayList<Integer>();
      	for(int i = 0; i<N;i++){
        	intList.add(sc.nextInt());
        }
        int a = getMax(intList,N);
      	ArrayList<Integer> getAt = new ArrayList<Integer>();
        for(int j = 0;j<N;j++){
        	getAt.add(getMax(intList,N-j));
        }
      	for(int k = 0;k<N;k++){
      		int result = getAt.get(N-1-k);
      		System.out.print(result+" ");
        }
    }
  	public static int getMax(ArrayList<Integer> list,int N){
    	int count = 1;
      	for(int i :list){
            if(i==N){break;}
            count++;
        }
      	return count;
    }

}