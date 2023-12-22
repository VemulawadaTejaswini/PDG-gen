import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int s = sc.nextInt();
    
    //0<=x,y,z<=k
	int sum = 0;
    for(int x=0 ; x<=s ; x++){
      for(int y=0 ; y<=s ; y++){
        for(int z=0 ; z<=k ; z++){
          if( (x+y+z)==s ){
            sum++;
          }
        }
      }
    }
    System.out.println(sum);
  }
}