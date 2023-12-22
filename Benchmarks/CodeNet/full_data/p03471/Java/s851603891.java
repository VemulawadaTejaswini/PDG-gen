import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int y = sc.nextInt();
    
    for(int i=0 ; i<n ; i++){
      for(int j=0 ; j<n ; j++){
        for(int k=0 ; k<n ; k++){
          
          int total = 10000*i + 5000*j + 1000*k;
          if( (y==total) && (i+j+k==n)){
            System.out.print(i+" "+j+" "+k);
            return;
          }
        }
      }
    }
  }
}       