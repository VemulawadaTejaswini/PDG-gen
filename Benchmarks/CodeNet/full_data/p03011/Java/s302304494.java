import java.util.*;
 
class Main{
  public studic main(String[] args){
    Scanner sc = new Scanner(System.in);
    int min = 100;
    int[] data = new int[3];
    data[0] = sc.nextInt();
    data[1] = sc.nextInt();
    data[2] = sc.nextInt();
 
    for(int i = 0; i < data.length; i++)
      min = Math.min(min,data[i]);
    System.out.println(min);
  }
}