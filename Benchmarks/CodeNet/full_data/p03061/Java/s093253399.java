import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x, y,m,m1;
    m=m1=0;
    n = sc.nextInt();
    int v[] = new int[n];
    int tmp[] = new int[n];
    for(int i=0;i<n;i++){
    	v[i]=sc.nextInt();
    }
    if(v[0]>v[1]){
    	x=v[0];
    	y=v[1];
    }
    else{
    	x=v[1];
    	y=v[0];
    }
    while((tmp[0] = x % y) != 0){
    	x = y;
    	y = tmp[0];
    }
    for(int i=2;i<n;i++){
    	if(y > v[i]){
    		x = y;
    		y = v[i];
    	}
    	else{
    		x = v[i];
    	}
    	while((tmp[i-1] = x % y) != 0){
    		x = y;
    		y = tmp[i-1];
    	}
    }
    System.out.println(y);
  }
}
