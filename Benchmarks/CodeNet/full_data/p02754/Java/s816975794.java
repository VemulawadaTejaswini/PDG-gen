import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner sc = new Scanner(System.in);
		 int count=sc.nextInt();
		 int b=sc.nextInt();
		 int r=sc.nextInt();
		 
		 ArrayList<String> ball= new ArrayList();
		 boolean ju=false;
		 while(true){
			 for(int i=0;i<b;i++){
				 ball.add("b");
				 if(ball.size()>count){
					 ju=true;
					 break;
					 }
			 }
			 if(ju)
				 break;
			 
			 for(int i=0;i<r;i++){
				 ball.add("r");
				 if(ball.size()>count){
					 ju=true;
					 break;
					 }
			 }
			 if(ju)
				 break;
		 }
		 
		 int s = 0;
		 for(int i=0;i<count;i++){
			 if(ball.get(i).equals("b"))
				 s++;
		 }
		 System.out.print(s);
	}

}
