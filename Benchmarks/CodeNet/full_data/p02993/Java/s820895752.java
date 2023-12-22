import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int[] hoge = sc.nextLine("");
      	int temp = 0;
      	String str = "Good";
      	for(int i = 0; i < 4; i++){
        	if(temp==hoge[i]){
            	str = "Bad";
            }
          	temp = hoge[i];
        }
      
      	System.out.println(str);
    }
}