import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
      	int hako[] = new int[N];
        int flag = 0;
      
      for(int i =0;i<N;i++){
        hako[i] = Integer.parseInt(sc.next());
      }
		Arrays.sort(hako);
      
      for(int i=1;i<=N;i++){
        if(hako[i-1]>i){
          flag = 1;
        }
      }
        
      if(flag==1){
        System.out.println(-1);
      }else{
        for(int i=0;i<N;i++){
		System.out.println(hako[i]);
        }
        
      }
      
      
    }
}