import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
        int nam[] = new int[n];
        int flag = 0;
      
      for(int i = 0; i < n ;i++){
      	nam[i] = in.nextInt();
      }
      
      int bh = -999;
      for(int i = 0;i < n ; i++){
      if(bh<=nam[i]-1){
       	nam[i] -= 1 ;
      }else if(bh<=nam[i]){
       	nam[i] = nam[i];
      }else{
      	flag = 1;
        break;
      }
        bh = nam[i];
    }

	if(flag==1){
     	System.out.print("No"); 
    }else{
     	System.out.print("Yes"); 
    }
      
	}
}
