import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a=new int[4];
    int count=0;
    boolean flag=true;
	for(int j=0;j<3;j++) {
		int h=sc.nextInt()-1,w=sc.nextInt()-1;
		a[h]++;
		a[w]++;
	}
    for(int i=0;i<4;i++) {
    	if(a[i]>=2)count++;
		if(a[i]>=3 || count>=3) {
			flag=false;
			//break;
		}
		//System.out.println(a[i]);
    }
    if(flag) {
    	System.out.println("YES");
    }else {
    	System.out.println("NO");
    }
  }
}
