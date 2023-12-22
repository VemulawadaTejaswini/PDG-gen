import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int Ans=0;
    int tri[]=new int [num];
    for(int a=0; a<num; a++){
      tri[a]=scan.nextInt();
    }
    for(int a=0; a<num-2; a++){
      for(int b=a+1; b<num-1; b++){
        for(int c=b+1; c<num; c++){
          if(tri[a]<tri[b]+tri[c] && tri[b]<tri[a]+tri[c] && tri[c]<tri[a]+tri[b]){
            Ans++;
          }
        }
      }
    }
    System.out.println(Ans);
  }
}