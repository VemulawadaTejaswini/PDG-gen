import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, max1,max2,max3;
    max1 = max2= max3= 0;
    n = sc.nextInt();
    int v[] = new int[n];
    int c[] = new int[n];
    for(int i=0;i<n;i++){
    	v[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
    	c[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
    	if(max1 <= v[i] - c[i]){
    		max1 = 0;
    		max1 = v[i] - c[i];
    	}
    	else if(max2 <= v[i] - c[i]){
    		max2 = 0;
    		max2 = v[i] - c[i];
    	}
    	else if(max3 <= v[i] - c[i]){
    		max3 = 0;
    		max3 = v[i] - c[i];
    	}
    }
    int sum = max1 + max2+ max3;
    System.out.println(sum);
  }
}
