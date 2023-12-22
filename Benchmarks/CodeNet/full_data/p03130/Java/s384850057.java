import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int c[]=new int[4];
    int a;
    for(int i=0;i<4;i++) c[i]=0;
    for(int i=0;i<6;i++){
      a=scan.nextInt();
      c[a]++;
    }
    for(int i=0;i<4;i++){
      if(c[i]==3) c[0]=0;
    }
    if(c[0]==0){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}
