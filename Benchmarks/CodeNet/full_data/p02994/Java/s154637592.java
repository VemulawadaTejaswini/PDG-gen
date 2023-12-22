import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int apple = sc.nextInt();
      	int L     = sc.nextInt();
      	int min = 1000;
      	int cnt = 0;
      
      for(int i = 1;i <= apple;i++){
      	int nam = L + i -1;
      	min = Math.min(min,Math.abs(nam));
      	cnt += nam;
      }
 	
     if(cnt<0){
		System.out.print(cnt+min);
     }else{
     	System.out.print(cnt-min);
     }

    }
}