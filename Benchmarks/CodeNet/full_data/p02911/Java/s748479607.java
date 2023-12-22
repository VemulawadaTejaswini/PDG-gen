import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int sanka = sc.nextInt();
        int point = sc.nextInt();
        int seikai = sc.nextInt();
        int[] array = new int[sanka];

        for(int i = 0; i < sanka; i++){
            array[i] = point - seikai;
        }
        for(int i = 0; i < seikai; i++){
            array[sc.nextInt() - 1]++;
        }
        for(int i = 0; i < sanka; i++){
            if(array[i] <= 0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }     
}