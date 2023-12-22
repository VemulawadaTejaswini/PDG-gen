import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int[] aji = new int[n];
    int ajisum = 0;
    for(int count = 0;count<n;count++){
      aji[count] = l+(count+1)-1;
      ajisum += aji[count];
    }
    int abs = ajisum;
    if(abs<0){
      abs = abs*-1;
    }
    int eat = 0;
    for(int count = 0;count<n;count++){
      if(aji[count]>0&&aji[count]<abs){
        abs = aji[count];
        eat = aji[count];
      }else if(aji[count]<0&&aji[count]*-1<abs){
        abs = aji[count]*-1;
        eat = aji[count];
      }
      else{
        abs = 0;
        eat = 0;
        break;
      }
    }
    System.out.println(ajisum-eat);
  } 
}