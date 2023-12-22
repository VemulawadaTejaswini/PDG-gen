import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[8];
        int c = 0;
        int min = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            switch(a[i] / 400){
                case 0:
                    b[0]++;
                    break;
                case 1:
                    b[1]++;
                    break;
                case 2:
                    b[2]++;
                    break;
                case 3:
                    b[3]++;
                    break;
                case 4:
                    b[4]++;
                    break;
                case 5:
                    b[5]++;
                    break;
                case 6:
                    b[6]++;
                    break;
                case 7:
                    b[7]++;
                    break;
                default:
                    c++;
                    break;
            }
        }
        for(int i = 0; i < 8; i++){
            if(b[i] > 0){
                min++;
            }
        }
        if(min < c){
            min = c;
        }
        if(min + c <= 8){
            max = min + c;
        }else{
            max = 8;
        }
        System.out.println(min + " " + max);
    }
}