import java.util.Scanner;
import java.lang.Math;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int pro=scan.nextInt();
    int sub=scan.nextInt();
    int pronum[]=new int[sub];
    String rate[]=new String[sub];
    int ACans=0, WAans=0;
    boolean flag[]=new boolean[pro];
    for(int x=0; x<pro; x++){
      flag[x]=true;
    }
    if(sub>0){
      for(int x=0; x<sub ;x++){
        pronum[x]=scan.nextInt();
        rate[x]=scan.next();
      }
      for(int x=0; x<pro; x++){
        for(int y=0; y<sub; y++){
          if(x+1==pronum[y] && flag[x]){
            if(rate[y].equals("WA")){
              WAans++;
            }else if(rate[y].equals("AC")){
              ACans++;
              flag[x]=false;
            }
          }
        }
      }
    }
    System.out.println(ACans+" "+WAans);
  }
}