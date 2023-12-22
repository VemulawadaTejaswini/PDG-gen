import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int[] hights = new int[n];
      for(int i=0;i<n;i++){
      	hights[i] = scan.nextInt();
      }
      int check = 0;
      int ans =1;
      for(int i=1;i<n;i++){
      	for(int j=0;j<i;j++){
        	if(hights[i] >= hights[j]){
            	check++;
            }
            if(check == i){
            	ans++;
            }
        }
        check =0;
      }
      System.out.println(ans);
    }
}