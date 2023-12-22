import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int min = 0;
        int over = 0;
        int[] b = new int[8];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++){
            if(a[i] < 400 && b[0] == 0){
                min++;
                b[0] = 1;
            }else if(a[i] < 800 && b[1] == 0 && a[i] >= 400){
                min++;
                b[1] = 1;
            }else if(a[i] < 1200 && b[2] == 0 && a[i] >= 800){
                min++;
                b[2] = 1;
            }else if(a[i] < 1600 && b[3] == 0 && a[i] >= 1200){
                min++;
                b[3] = 1;
            }else if(a[i] < 2000 && b[4] == 0 && a[i] >= 1600){
                min++;
                b[4] = 1;
            }else if(a[i] < 2400 && b[5] == 0 && a[i] >= 2000){
                min++;
                b[5] = 1;
            }else if(a[i] < 2800 && b[6] == 0 && a[i] >= 2400){
                min++;
                b[6] = 1;
            }else if(a[i] < 3200 && b[7] == 0 && a[i] >= 2800){
                min++;
                b[7] = 1;
            }
            if(a[i] >= 3200){
                over++;
            }
        }
        if(min > 0){
            System.out.println(min + " " + min + over);
        }else{
            System.out.println(1 + " " + over);
        }
    }
}