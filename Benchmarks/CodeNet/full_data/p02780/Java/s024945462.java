import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int dice=scan.nextInt();
    int in[]=new int[num];
    double par[]=new double[num];
    double plus=0;
    for(int x=0; x<num; x++){
      plus=0;
      in[x]=scan.nextInt();
      if(in[x]==1){
        plus=1;
      }else{
      plus=(1.0+in[x])/2.0;
      }
      par[x]=plus;
    }
    double max=0;
    double spare=0;
    for(int x=0; x<num-dice+1; x++){
      spare=0;
      for(int y=x; y<x+dice; y++){
        spare+=par[y];
      }
      if(max<spare){
        max=spare;
      }
      System.out.println(spare);
    }
    System.out.println(max);
  }
}