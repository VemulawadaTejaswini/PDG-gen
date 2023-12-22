import java.util.*;
public class quiz {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt(); 
    int b = scan.nextInt();
    int result = 0;
    int[] Arr = new int[]{ 1,2,3 }; 
    for(int i = 0; i < Arr.lenght(); i++)
      if(Arr[i]!=a && Arr[i]!=b)
        result = Arr[i];
    System.out.println(result);
  }
}