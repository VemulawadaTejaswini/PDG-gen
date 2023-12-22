import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] L = new int[n];
    
    for(int i=0; i<n; i++){
      L[i] = sc.nextInt();
    }
    
    int count = 0;
    
    for(int i=0; i<n-2; i++){
      for(int j=i+1; j<n-1; j++){
        for(int k=j+1; k<n; k++){
          if(L[i]<L[j]+L[k] && L[j]<L[i]+L[k] && L[k]<L[i]+L[j]){
            count++;
          }
        }
      }
    }
    
    System.out.println(count);
  }
}
