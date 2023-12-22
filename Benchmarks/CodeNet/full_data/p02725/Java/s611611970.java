import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int peri= sc.nextInt();
        int n=sc.nextInt();
        int dist=0;
        int[] home=new int[n];
        int min=21;int max=-1;
        for (int i = 0; i <home.length; i++) {
             home[i]=sc.nextInt();
             min=Math.min(min,home[i]);
             max=Math.max(max,home[i]);

        }
        if(min!=0){
            System.out.println(20-(max-min));
        }
        else{
            System.out.println(20-(max-home[1]));
        }




     }
}
