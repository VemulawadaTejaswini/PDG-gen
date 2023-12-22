import java.util.*;

class Main{
	public static void main(String[] args){
      	int n, k;
      	boolean loop = true;
    	Scanner sc = new Scanner(System.in);
      	n = sc.nextInt();
      	k = sc.nextInt();
      	
      	int i = 1, ans = 0;
      	while(loop){
          	int count = 0;
          	int j = i;
        	while(true){
        		//System.out.print(j);
        	  count++;
              if(j > n){
              	loop = false;
                break;
              }
              if(count == k){
              	ans++;
              	//System.out.println();
                break;
              }
              j++;
            }
          	i++;
        }
      
      	System.out.println(ans);
    }
}
