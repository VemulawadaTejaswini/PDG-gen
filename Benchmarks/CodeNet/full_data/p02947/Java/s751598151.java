import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int Ans=0, flag1=0,flag2=0;
    String input;
    String[][] in=new String[a][10];
    for(int x=0; x<a; x++){
      input=scan.next();
      in[x]=input.split("");
    }
    for(int n=0; n<a-1; n++){
      for(int m=n+1; m<a; m++){
        for(int x=0; x<10; x++){
          for(int y=0; y<10; y++){
            if(in[n][x].equals(in[m][y])){
              flag1++;
            }
          }
          if(flag1>0){
            flag2++;
          }
            flag1=0;
        }
        System.out.println(flag2);
        if(flag2==10){
          Ans++;
        }
        flag2=0;
      }
    }
    System.out.println(Ans);
  }
}