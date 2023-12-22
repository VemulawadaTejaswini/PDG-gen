import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int[] in=new int[num];
    boolean flag=true;
    for(int x=0; x<num; x++){
      in[x]=scan.nextInt();
    }
    for(int x=0; x<num-1; x++){
      for(int y=x+1; y<num; y++){
        int a=in[x];
        int b=in[y];
        if(a==b){
          flag=false;
          break;
        }
      }
    }
    if(flag){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}