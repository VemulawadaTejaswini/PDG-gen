import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long count = 0;
            for(int i=1;i<n+1;i++){
              if(i%3==0||i%5==0){
                continue;
              }
              count+=i;
            }
            System.out.println(count);
          }
        }

