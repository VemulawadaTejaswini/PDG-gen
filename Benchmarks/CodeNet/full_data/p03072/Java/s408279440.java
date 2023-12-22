import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] b=new int[a];
        int count=0;
        int answer=0;
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
            if(count<=b[i]){
                count=b[i];
                answer++;
            }
        }
        System.out.println(answer);
    }
}
