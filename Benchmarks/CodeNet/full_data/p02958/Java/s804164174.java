import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            int b=sc.nextInt();
            if(i!=b){
                count++;
            }
        }
        if(count>2){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
    
}
