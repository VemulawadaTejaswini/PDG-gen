import java.util.*;
class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(), D=sc.nextInt(), X=sc.nextInt(), arr[]=new int[N], total=X+N;
		for(int i=0 ; i<N ; i++){
			arr[i] = sc.nextInt();
		}

		for(int i=0 ; i<N ; i++){
			for(int j=1; ;j++){
				if(arr[i]*j+1<=D){
					total++;
				}else{
					break;
				}
			}
		}
		System.out.println(total);
	}
}