import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int h = scan.nextInt();
    int w = scan.nextInt();
    
    int[][] value = new int[h*w][3];
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        int input = scan.nextInt();
        if(h%2==0){
          value[i*w+j][0]=input;
          value[i*w+j][1]=i+1;
          value[i*w+j][2]=j+1;
        }else{
          value[i*w+w-j-1][0]=input;
          value[i*w+w-j-1][1]=i+1;
          value[i*w+w-j-1][2]=j+1;
        }
      }
    }
    scan.close();
    
    int n=0;
    List<String> answer = new LinkedList<>();
    for(int i=0;i<h*w;i++){
      if(i==h*w-1)continue;
      if(value[i][0]%2==1){
        answer.add(value[i][1]+" "+value[i][2]+" "+value[i+1][1]+" "+value[i+1][2]);
        value[i+1][0]++;
        n++;
      }
    }
    System.out.println(n);
    for(String s:answer){
      System.out.println(s);
    }
    return;
  }
}