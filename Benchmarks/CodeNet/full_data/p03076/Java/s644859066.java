import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dishes = new int[5];
        int idx = -1;
        int max = -1;
        int sum = 0;
        int tmp ;
        for(int i=0;i<5;i++){
            tmp = Integer.parseInt(sc.next());
            if((tmp+9)/10*10-tmp > max){
                idx = i;
                max = (tmp+9)/10*10-tmp;
            }
            dishes[i] = tmp;
        }
        sc.close();
        for(int i=0;i<5;i++){
            if(i==idx){
                sum+=dishes[idx];
            }else{
                sum+=(dishes[i]+9)/10*10;
            }
        }
        System.out.println(sum);
    }
}