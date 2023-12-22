import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int y = sc.nextInt();
      	int k = -1;
      	int k5 = -1;
      	int k10 = -1;
      	int num = 0;
      	for(int i=0; i<=n; i++){
          for(int j=0; j<=n-i; j++){
            num = 1000*i + 5000*j + 10000*(n-j-i);
            if(num==y){
              k=i;
              k5=j;
              k10=n-j-i;
            }
          }
        }
      	System.out.println(k10 + " " + k5 + " " + k);
	}
}
