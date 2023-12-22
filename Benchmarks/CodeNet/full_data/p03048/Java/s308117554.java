import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i*r<=n; i++){
          if(i*r==n) {
            count++;
            break;
          }
          for(int j=0; i*r+j*g<=n; j++){
            if(i*r+j*g==n){
              count++;
              break;
            }
            if((n-i*r+j*g)%b == 0) count++;
          }
        }
		System.out.println(count);
	}
}