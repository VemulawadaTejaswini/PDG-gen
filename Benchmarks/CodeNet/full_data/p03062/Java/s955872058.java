import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,m,m1;
    m = m1 = 0;
    n = sc.nextInt();
    int v[] = new int[n];
    for(int i=0;i<n;i++){
    	v[i]=sc.nextInt();
    }
    m = v[0]+v[1];
    for(int i=0;i<n-1;i++){
    	if(0 > v[i]){
    		v[i]*=-1;
    	}
    	m1 += v[i];
    }
    System.out.println(m1);
  }
}
