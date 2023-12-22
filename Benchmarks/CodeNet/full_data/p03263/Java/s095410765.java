import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    int w = scan.nextInt();
    
    List<String> answer = new LinkedList<>();
    int n = 0;
    int[] start = {-1,-1};
    for(int i=1;i<=h;i++){
      for(int j=1;j<=w;j++){
        int input=scan.nextInt();
        if(input%2==1){
          if(start[0]==-1){
            start[0]=i;
            start[1]=j;
          }else{
            int[] goal = {i,j};
            while(start[0]!=goal[0]){
              answer.add(start[0]+" "+start[1]+" "+(++start[0])+" "+start[1]);
              n++;
            }
            while(start[1]!=goal[1]){
              answer.add(start[0]+" "+start[1]+" "+start[0]+" "+(++start[1]));
              n++;
            }
            start[0]=-1;
            start[1]=-1;
          }
        }
      }
    }
    scan.close();
    System.out.println(n);
    for(String s:answer){
      System.out.println(s);
    }
    return;
  }//main
}//Main