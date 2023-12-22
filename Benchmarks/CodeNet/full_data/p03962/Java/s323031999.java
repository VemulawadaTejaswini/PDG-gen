import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] data=new int[3];
    for(int i=0;i<3;i++){
      data[i]=sc.nextInt();
    }
    Arrays.sort(data);
    if(data[0]==data[1]){
      if(data[1]==data[2]){
        System.out.println(1);
      }else{
        System.out.println(2);
      }
    }else{
      if(data[1]==data[2]){
        System.out.println(2)
      }else{
        System.out.println(3);
      }
    }
  }
}