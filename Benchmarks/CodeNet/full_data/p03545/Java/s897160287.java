import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    char[] signs = new char[3];
    int sum = 0;
    int sign = 1;
    for(int i=0;i<8;i++){
      sum = 0;
      sign = 1;
      for(int j=0;j<3;j++){
        if(((i>>(2-j)) & 1)==1){
          sum+=(s[j] -'0')*sign;
          sign = 1;
          signs[j] = '+';
        }else{
          sum+=(s[j]-'0')*sign;
          sign = -1;
          signs[j] = '-';
        }
      }
      sum+=(s[3]-'0')*sign;
      if(sum == 7){
        for(int k=0;k<3;k++){
          System.out.print(s[k]+""+signs[k]);
        }
        System.out.print(s[3]+"=7");
        System.out.flush();
       	break;
      }
    }
  }
}