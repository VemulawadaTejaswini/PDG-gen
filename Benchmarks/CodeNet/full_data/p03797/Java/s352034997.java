package spring21;

public class ABC055_C {
	public static void main(String[] args){
		int N=1,M=6,sum=0;
		for(;;){
			if(N>=1&&M>=2){
				N--;
				M-=2;
				sum++;
			}
			else if(N==0&&M>=4){
				sum++;
				M-=4;
			}
			else{
				break;
			}
		}
			System.out.println(sum);
	}
}