import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	int k = scn.nextInt();
      	if(k>(a+b)/2-a){
        	for(int i=0; i<b-a+1; ++i){
				System.out.println(a+i);
			}
        }else if(a==b){
          System.out.println(a);
        }else{
         	for(int i=a; i<k; ++i){
				System.out.println(i);
			}
          	for(int i=b-1-k; i<b; ++i){
				System.out.println(i);
			}
        }
	}
}
