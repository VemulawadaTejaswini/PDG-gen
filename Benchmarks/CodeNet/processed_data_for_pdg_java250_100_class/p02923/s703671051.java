public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt(); 
	int[] H = new int[N];
  	int cnt = 0;
  	int max = 0;
  	for (int i=0;i<N;i++){
      	H[i] = sc.nextInt();
    }
  	int k=0,j=0;
  	for(k=0;k<N-1;k++){
	  	for (j=k;j<N-1;j++){
    	 	if(H[j] >= H[j+1]){
        	 	cnt++; 
       		}else{
              	if (cnt == N-1){
                  	System.out.println(cnt); 
                  	System.exit(0);
                }
				else if(max < cnt){
                  	max = cnt;
                }
              	cnt = 0;
          		break;
        	}
        }
      	if (cnt == N-1){
			System.out.println(cnt);   
			System.exit(0);
        }else if(max < cnt){
          	max = cnt;
        }
      	cnt = 0;
    }
  	System.out.println(max);                           
}
}
