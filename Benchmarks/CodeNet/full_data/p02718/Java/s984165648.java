import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[n];
    int b = 0;
    
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
      b = b+a[i];
    }

    Arrays.sort(a);
    
    int line = 1/4/m;
    int c = 0;
    
    for(int j=0;j<n;j++){
		if(a[j]>b*line){
			c++;
        }
    }
    
    if(a[m-1]>=b*line){
      System.out.println("Yes");
    }else if(c>m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}