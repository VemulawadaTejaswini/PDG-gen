import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
		
      	int a = scan.nextInt();
      	int b = scan.nextInt();

      	int cnt = 1;
		int rlt = b - a;
      	while(rlt > a){
        	rlt = rlt - a;
              
             cnt++; 
        }

      if(rlt < a && rlt != 0){
            cnt++;
          }
      
      	System.out.println(cnt);
    }
}
