import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] len = new int[n];
    int tmp,w=0,h=0;
    int flag = 0;

    for(int i=0;i<n;i++){
      len[i] = sc.nextInt();
    }
    Arrays.sort(len);
    tmp = len[n-1];
    for(int i=1;i<n;i++){
      if(tmp == len[n-1-i] && flag == 0){
        w = tmp;
        flag = 1;
        tmp = 0;
      }else if(tmp == len[n-1-i] && flag == 1){
        h = tmp;
        break;
      }else{
        tmp = len[n-1-i];
      }
    }
    System.out.println(w*h);
  }
}