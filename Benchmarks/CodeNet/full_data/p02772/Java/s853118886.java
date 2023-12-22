import java.util.*;
public class Main {
    public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
		int n1 = Integer.parseInt(sc.next());
      	int p[] = new int[n1];
      	int err = 0;
      	int cnt = 0;
      	for(int i=0;i<p.length;i++){
          p[i] = Integer.parseInt(sc.next());
          if( p[i]%2==0 ){
            if( p[i]%3==0||p[i]%5==0 ){
              cnt++;
            }else{
              err = -1;
            }
          }
        }
 
      
      	if( err == 0 ){
       	 System.out.println("APPROVED");
        }else{
          System.out.println("DENIED");
        }
    }
}