import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int right = sc.nextInt();
        int harf_right = right /2;
        //int[] place;
        //place = new int[num];
        int place;
        int i;
        int count = 0;
        for(i = 0; i < num; i++){
            place = sc.nextInt();
            if(place > harf_right){
                count += (right - place)*2;
            }else{
                count += place*2;
            }
        }
        System.out.print(count);
	}
}