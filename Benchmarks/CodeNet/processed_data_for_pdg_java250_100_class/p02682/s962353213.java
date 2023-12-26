public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();	
		int B = in.nextInt();	
		int C = in.nextInt();	
		int K = in.nextInt();	
		int max = 0;			
		if(K<=A){			
			max += K;
		}else{
          	max += A;
			K-=A;
          	if((K-B) >= 0){			
				K-=B;
                if(K > 0){				
					max -= K;
				}
			}
		}
		System.out.println(max);
	}
}
