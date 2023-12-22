import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		Queue A = new PriorityQueue();
		Queue B = new PriorityQueue();
		Queue C = new PriorityQueue();
		Queue D = new PriorityQueue();
		
		/*int[]A = new int[W];
		int[]B = new int[W];
		int[]C = new int[W];
		int[]D = new int[W];*/
		int w1 = 0;
		for(int i = 0 ; i<N; i++){
			int w = sc.nextInt();
			int v = sc.nextInt();
			if(i == 0 )w1 = w;
			if(w-w1 == 0){
				A.add(v);
				//a++;
			}
			else if(w-w1 == 1){
				//B[b] = v;
				B.add(v);
		//		b++;
			}
			else if(w-w1 == 2){
			//	C[c] = v;
			//	c++;
				C.add(v);
			}
			else if(w-w1 == 3){
		//		D[d] = v;
		//		d++;
				D.add(v);
			}
		}
	/*	System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);*/
		/*Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		Arrays.sort(D);
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		System.out.println(Arrays.toString(C));
		System.out.println(Arrays.toString(D));*/
		int res = 0;
		
		for(int i = 0 ; i<=A.size(); i++){
			for(int j = 0 ; j<=B.size(); j++){
				for(int x = 0 ; x<=C.size(); x++){
					for(int y = 0 ; y<=D.size(); y++){
						int w = i*w1+j*(w1+1)+x*(w1+2)+y*(w1+3);
						int v = 0;
						if(w<=W){
							int a = i, b = j, c = x, d = y;
							Queue ca = new PriorityQueue(A);
							Queue cb = new PriorityQueue(B);
							Queue cc = new PriorityQueue(C);
							Queue cd = new PriorityQueue(D);
							while(a-->0){
								v+=(int)ca.poll();
							}
							while(b-->0){
								v+=(int)cb.poll();
							}
							while(c-->0){
								v+=(int)cc.poll();
							}
							while(d-->0){
								v+=(int)cd.poll();
							}
						}
						res = Math.max(res, v);
					}
				}
			}
		}
/*		System.out.println("- -- - - - - - - - - - - - - - ");
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println("- - - - - - - - - - - - - - - - ");*/
		System.out.println(res);
		/*for(int i = A.length-1 ; i>=0 && A[i]!=0; i--){
			for(int j = B.length-1 ; j>=0 && B[i]!=0 ; j--){
				for(int k = C.length-1; k>=0 && C[i]!=0; k--){
					for(int m = D.length-1 ; m>=0 && D[i]!=0 ; m--){
						if(i*w1+j*(w1+1)+k*(w1+2)+m*(w1+3) <= W ){
							int v = A[i]+B[j]+C[k]+D[m];
							res = Math.max(v, res);
						}
					}
				}
			}
		}*/
	//	System.out.println(res);
	}
}
