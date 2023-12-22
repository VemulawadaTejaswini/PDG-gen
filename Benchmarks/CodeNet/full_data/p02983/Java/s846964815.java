import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int r = sc.nextInt();
    
    int min = l*r%2019;
    for(int i = l; i <= r; i++){
      for(int j = i+1; j <= r; j++){
      	if(min > (i*j%2019))
          min = i*j%2019;
      }
    }
    System.out.println(min); 
  }
}