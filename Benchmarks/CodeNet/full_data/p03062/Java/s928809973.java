import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x, y,m,m1;
    m=m1=0;
    n = sc.nextInt();
    int v[] = new int[n];
    for(int i=0;i<n;i++){
    	v[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
    	if(m > v[i]+v[i+1])
    		m=v[i]+v[i+1];
    	m1+=v[i];
    }
    
    System.out.println(m1 - (m*2));
  }
}
