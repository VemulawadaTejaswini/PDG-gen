import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ta = input.nextInt();
        int aoi = input.nextInt();
        int a = input.nextInt();
        while(a>0){
            a-=1;
            if(ta>0){
                ta-=1;
            }
            else if(aoi>0&&ta==0){
                aoi-=1;
            }
        }
        System.out.println(ta +" " +aoi);
    }
}