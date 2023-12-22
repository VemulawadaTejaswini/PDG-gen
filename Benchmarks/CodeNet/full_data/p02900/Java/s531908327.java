import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      ArrayList<Integer> list = new ArrayList<Integer>();
		// 整数の入力
		int a = sc.nextInt();
        int b = sc.nextInt();

        //i番目
        
       	int x;
        int y;
        if (a > b) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }

   
        list.add(1);
        for(int i=2;i<=y;i++){
         if((x%i==0)&&(y%i==0)){
           boolean coprime =true;
           for(int data:list)
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
		for(int data:list)
        System.out.println(data);
	}
}