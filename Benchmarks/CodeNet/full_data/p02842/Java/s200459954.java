import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        double c=n+0.5;
        int ans = (int)(n/1.08);
      	int check=0;
      	while(true){
          	if(ans*1.08>=c){
              break;
            }else if(n<= ans*1.08 && ans*1.08 <c){
              check=1;
              break;
            }
          	ans+=1;
        }

        if(check==1)System.out.println(ans);
        else System.out.println(":(");
        scan.close();
    }
}