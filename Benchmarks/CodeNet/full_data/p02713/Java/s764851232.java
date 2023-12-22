import java.util.Scanner;

public class Main {

  private static int gcd(int a,int b){
      if((a%b)==0) return b;
      return gcd(b,a%b);
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
             int tmp;
             int count = 0;

            for(int i=1;i<a+1;i++){
              for(int j=1;j<a+1;j++){
                tmp = gcd(i,j);
                for(int k=1;k<a+1;k++){
                  count += gcd(k,tmp);
                  }
                }
              }
              System.out.println(count);
            }

          }
