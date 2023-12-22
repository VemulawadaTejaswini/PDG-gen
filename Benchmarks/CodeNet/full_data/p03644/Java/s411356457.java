import java.util.*;
public class Main{

public static void main(String[] args){
  Scanner inp = new Scanner(System.in);
  int N = inp.nextInt();
  int Max = 0;
  int mNum = 0;
  for(int count = 1; count <= N; count++){
    int cnt = 0;
    int ntemp = N;
    while(ntemp % 2 == 0){
      ntemp /= 2;
      cnt++;
    }
    if(cnt > Max){
      Max = cnt;
      mNum = N;
    }
      
    
    }
  System.out.println(mNum);    
}
}