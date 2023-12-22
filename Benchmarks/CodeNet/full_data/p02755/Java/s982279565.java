import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tax1 = sc.nextInt();
        int tax2 = sc.nextInt();
        double tmp1 = -1;
        double tmp2 = 0;
        int counter = -1;
        for(int i = 1;i < 1009;i++){
            tmp1 = i * 0.08;
            tmp1 = Math.floor(tmp1);
            //System.out.println(tmp1);
            tmp2 = i * 0.1;
            tmp2 = Math.floor(tmp2);
            if(tmp1 == tax1 && tmp2 == tax2){
                System.out.println(i);
                counter++;
                break;
            }
        }
        if(counter == -1){
            System.out.println(counter);
        }
    }
}