import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      ArrayList<Long> list = new ArrayList<Long>();
		// 整数の入力
		long a = sc.nextLong();
        long b = sc.nextLong();

        //i番目
        
       	long x;
        long y;
        if (a > b) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }

   
        list.add((long)1);
        for(long i=2;i<=y;i++){
         if((x%i==0)&&(y%i==0)){
           boolean coprime =true;
           for(long data:list)
             if(list.size()<=1){
              coprime=true;
             break;
             }
             else if(i%data==0 && data!=1){
               coprime =false;
               break;
             }

             if(coprime)list.add(i);
           }

         
        }
      
        //for(int i=0;i<n;i++)
		  // 出力
		//for(int data:list)
        System.out.println(list.size());
	}
}