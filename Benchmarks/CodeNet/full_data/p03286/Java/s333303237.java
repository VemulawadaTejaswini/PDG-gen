import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   long N = sc.nextLong();
    StringBuilder sb = new StringBuilder();
    sb.append("");
//System.out.println(N);
    if(N!=0){
      do{
    /*    switch (N%4){
          case 2:
          sb.insert(0, "10");
          N+=2;
          break;
          case 3:
          sb.insert(0, "11");
          N+=1;
          break;
          case 0:
          sb.insert(0, "00");
          break;
          case 1:
          sb.insert(0, "01");
          N-=1;
        }
        N=N/4;*/
      if(N%4==-2||N%4==2){
        sb.insert(0, "10");
        N+=2;
      }else if(N%4==-1||N%4==3){
        sb.insert(0, "11");
        N+=1;
      }else if(N%4==0){
        sb.insert(0, "00");
      }else{
        sb.insert(0, "01");
        N-=1;
      }
      N=N/4;
      }while(N!=0);

      while(sb.charAt(0)=='0'){
        sb = sb.deleteCharAt(0);
      }
      System.out.println(sb);
    }else{
      System.out.println(0);
    }
  }
}
