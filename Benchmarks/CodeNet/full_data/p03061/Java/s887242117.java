import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, x, y, tmp,m,m1;
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
    	if(tmp[i-2] > v[i]){
    		x = tmp[i-2];
    		y = v[i];
    	}
    	else{
    		x = v[i];
    		y = tmp[i-2];
    	}
    	while((tmp[i-1] = x % y) != 0){
    		x = y;
    		y = tmp[i-1];
    	}
    }
    for(int i=0;i<n-1;i++){
    	if(m>tmp[i])
    		m=tmp[i];
    	else if(m1>tmp[i])
    		m1=tmp[i];
    }
    System.out.println(m1);
  }
}
