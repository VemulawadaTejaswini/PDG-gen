import java.util.Scanner;


class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	int ans[] = new int[n];
    int middle = n/2;
    ans[middle] = sc.nextInt();
    int diff = n%2 == 0? -1: 1;
    int j = 1;
	
    for(int i = 1; i < n; i++){
      ans[middle + j*diff] = sc.nextInt();
      diff *= -1;
      if(i > 1 && i % 2 == 0) j++;
    }
    
    for(int i = 0; i < n; i++)
      System.out.printf("%d ", ans[i]);
  } 
  
}