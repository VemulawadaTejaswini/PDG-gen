import java.util.Scanner;

class D_EnoughArray {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
      	int N=in.nextInt();
      	int K=in.nextInt();
      	int A[]=new int[N];
      	for(int i=0;i<N;i++) {
          A[i]=in.nextInt();
      	}
      	long sum=0;
      	long ans=0;
      	int i=0;	
      	int j=0;
      	while(true){
          	if(sum>=K){
            	ans+=N-i+1;
//              	System.out.println("Sum : "+sum+", i : "+i);
//              	System.out.println("Ans : "+ans);
              	sum-=A[j++];	
            }
          	else{
              	if(i==N)
                  break;
            	sum+=A[i++];
            }
          	
        }
      	System.out.println(ans);
      	in.close();
	}

}