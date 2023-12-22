import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	//String[] foo = sc.nextLine().split("");
      	int temp = 0;
      	String str = "Good";
      	for(int i = 0; i < 4; i++){
      		int hoge = sc.nextInt();
        	if(temp==hoge){
            	str = "Bad";
              	break;
            }
          	temp = hoge;
        }
      
      	System.out.println(str);
    }
}