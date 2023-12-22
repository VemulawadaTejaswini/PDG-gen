import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
  	if(N<2) System.exit(0);
  	int K = sc.nextInt();
  	if(K<1) System.exit(0);

  	int[] a = new int[N];
  	for (int i=0;i<N;i++){
		a[i] = sc.nextInt();
	}
  	Arrays.sort(a);
  	long[] product = new long[N*(N-1)/2];
  	int cnt=0;
	for(int j=0;j<N-1;j++){
      for(int l=j+1;l<N;l++){
        product[cnt]=a[j]*a[l];
        cnt++;
      }
    }
  	Arrays.sort(product);
  /*	for(cnt=0;cnt<N*(N-1)/2;cnt++){
		System.out.println("product["+cnt+"]:"+product[cnt]);
  		//System.out.printf("%d", product[K-1]);
    }*/
  	System.out.println(product[K-1]);
	}

}