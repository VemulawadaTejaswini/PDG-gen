
public class Atcorder {

	public int Answer(int N,int A,int B){
		
		int x = 0;
		int one = N * A;
		if(one >= B){
		x = B;
		}else{
			x = one;
		}
		
		return x;
	
	}
}
