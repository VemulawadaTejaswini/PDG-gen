import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long[] res=new long[1000000000];
    for(int i=0;i<n;i++) res[sc.nextInt()-1]++;
    int m=sc.nextInt();
    for(int i=0;i<m;i++) {
    	res[sc.nextInt()-1]--;
    	if(res[i]<0) {
    		System.out.println("NO");
    		System.exit(0);
    	}
    }
    System.out.println("YES");
  }
}
