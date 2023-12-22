import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int counter = sc.nextInt();
    int[] member = new int[counter];
    char[] memchar = sc.next().toCharArray();
    
    int start = 0;
    for(int i = 0;i<counter;i++){
      member[i] = (memchar[i] == 'E')?0:1;
      if(member[i] == 0)start ++;
    }
    
    int answer = 300000;
    for(int i = 0;i<counter;i++){
      if(member[i] == 0) start--;
      if(i!=0){
        if(member[i] == 1)start ++;
      }
      if(start < answer) answer = start;
    }
    System.out.println(answer);
  }
}