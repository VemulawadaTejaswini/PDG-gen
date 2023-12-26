public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int H[]= new int[N];
      	for(int i=0;i<N;i++){
		H[i] = sc.nextInt();
        }
      int cnt=1;
      for(int i=N-1;i>0;i--){
        for(int j=i-1;j>=0;j--){
			if(H[j]>H[i]){
            cnt--;
          	break;
        	}
        }
        cnt++;
      }
		System.out.println(cnt);
	}
}
