import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
      Scanner scan= new Scanner(System.in);
      int n=scan.nextInt();
      int i;
      ArrayList<Integer>list=new ArrayList<Integer>();
      
      for(i=0;i<n;i++){
        int c=scan.nextInt();
        list.add(c);
	}
      
     Collections.sort(list,Collections.reverseOrder());
      long sum=0;
      int count=0;
      for(i=0;i<n-1;i=i+2){
        if(count<=(n/2)){
          sum=sum+list.get(i);
          count++;
}
        if(count>n/2){
          break;
        }
}
      
      
      System.out.println(sum);
      
      }
    
    
    }