import java.util.Scanner;
public class Main{

	private static int helper(int[][] powers,int num,int candies,int modu,int[] as,int[] bs){
		if (num==1){
			int temp=0;
			for(int i=as[0];i<=bs[0];i++){
				temp+=powers[i-1][candies];
				temp%=modu;
				if (temp<0){
					temp+=modu;
				}
			}
			return temp;
		}
		int temp=0;
		for (int a=0;a<=candies;a++){
			int temp0=0;
			for(int b=as[num-1];b<=bs[num-1];b++){
				temp0+=powers[b-1][a];
				temp0%=modu;
				if (temp0<0){
					temp0+=modu;
				}
			}
			temp+=(temp0*helper(powers,num-1,candies-a,modu,as,bs))%modu;
			temp%=modu;
			if(temp<0){
				temp+=modu;
			}
		}
		return temp;
	}

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int M=(int)Math.pow(10,9)+7;
		int[][] temp=new int[400][401];
		for(int i=0;i<400;i++){
			temp[i][0]=1;}
		for (int i=0;i<400;i++){
			for(int j=1;j<401;j++){
				temp[i][j]=temp[i][j-1]*(i+1);
				temp[i][j]%=M;
				if (temp[i][j]<0){
					temp[i][j]+=M;
				}}}
		int N=in.nextInt();
		int C=in.nextInt();
		int[] A=new int[N];
		int[] B=new int[N];
		for (int i=0;i<N;i++){
			A[i]=in.nextInt();}
		for (int i=0;i<N;i++){
			B[i]=in.nextInt();}
		int result=helper(temp,N,C,M,A,B);
		System.out.print(result);
	}
}