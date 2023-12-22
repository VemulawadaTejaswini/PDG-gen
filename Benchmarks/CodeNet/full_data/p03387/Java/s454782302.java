import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0;i < 3;i++){
            a[i] = sc.nextInt();
        }
        int max = 0;
        int count = 0;
        boolean can = true;
        max = Math.max(max,Math.max(a[0],Math.max(a[1],a[2])));
        if(3*max % 2 == (a[0] + a[1] + a[2]) % 2){
            for(int i = 0;i < 3;i++){
                count += (max - a[i]) / 2;
                if((max - a[i]) % 2 == 1 && can){
                    count++;
                    can = false;
                }
            }
        }
        else{
            for(int i = 0;i < 3;i++){
                count += (max + 1 - a[i]) / 2;
                if((max + 1 - a[0]) % 2 == 1 && can){
                    count++;
                    can = false;
                }
            }
        }
        System.out.println(count);
    }
}
