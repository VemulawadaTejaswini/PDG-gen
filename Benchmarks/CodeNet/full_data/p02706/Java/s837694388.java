import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int m = in.nextInt();
        int ar[] = new int[n];
      	int sum=0;
      	for(int i=0;i<m;i++){
          ar[i]=in.nextInt();
          sum+=ar[i];
        }
      	if(sum>0)
          System.out.println(sum);
        else
          System.out.println("-1");
          
	}

}