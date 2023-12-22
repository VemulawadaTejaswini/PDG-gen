import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int tako[]=new int[num];
    int Ans=0;
    for(int a=0; a<num; a++){
      tako[a]=scan.nextInt();
    }
    if(num==2){
      Ans=tako[0]*tako[1];
    }else{
      for(int a=0; a<num-1; a++){
        for(int b=a+1; b<num; b++){
          Ans+=tako[a]*tako[b];
        }
      }
    }
    System.out.println(Ans);
  }
}