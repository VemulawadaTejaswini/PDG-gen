import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int Ans=0, a=0;
    int tri[]=new int [num];
    while(a<num){
      tri[a]=scan.nextInt();
      a++;
    }
    for(int x=0; x<num-2; x++){
      for(int y=x+1; y<num-1; y++){
        for(int z=y+1; z<num; z++){
          if(tri[x]<tri[y]+tri[z] && tri[y]<tri[x]+tri[z] && tri[z]<tri[x]+tri[y]){
            Ans++;
          }
        }
      }
    }
    System.out.println(Ans);
  }
}