import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num_que=scan.nextInt();
        int[] time=new int[num_que];
        int i,j;
        for(i=0;i<num_que;i++){
            time[i]=scan.nextInt();
        }
        int num_drink=scan.nextInt();
        int[] sign=new int[num_drink];
        int[] change=new int[num_drink];
        for(i=0;i<num_drink;i++){
            sign[i]=scan.nextInt();
            change[i]=scan.nextInt();
        }

        int sum_time=0;
        for(i=0;i<num_drink;i++){
            sum_time=0;
            for(j=0;j<num_que;j++){
                if(sign[i]==j+1){
                    sum_time+=change[i];
                }
                else{
                    sum_time+=time[j];
                }
            }
            System.out.println(sum_time);
        }
    }
}