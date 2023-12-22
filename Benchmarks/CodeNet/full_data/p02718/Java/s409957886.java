import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int sum = 0;
    int count = 0;
    int[] pop = new int[n];
    for(int i = 0; i < n; i++){
      pop[i] = scan.nextInt();
      sum += pop[i];
    }
    for(int i = 0; i < n; i++){
      sum += pop[i];
    }
    int border = sum/(4*m);
    for(int i = 0; i<n; i++){
      if(pop[i] >= border){
        count++;
      }
    }
     if(count == m){
       System.out.println("Yes");
     }else{
       System.out.println("No");
     }
  }
}