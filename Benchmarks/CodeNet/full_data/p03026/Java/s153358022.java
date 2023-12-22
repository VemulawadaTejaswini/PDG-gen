import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int[] value = new int[num];
        for(int i=0; i<num; i++){
		  value[i] = sc.nextInt();
        }
        /*for(int i=0; i<value.length-1; i++) {
            for(int j=value.length-1; j>i; j--) {
                if(value[j-1] > value[j]) {
                    int tmp = value[j-1];
                    value[j-1] = value[j];
                    value[j] = tmp;
                }
             }
        }*/
        Arrays.sort(value);
        for(int i=0; i<num; i++){
		  System.out.println(value[i]);
        }
		System.out.println((a+b+c) + " " + s);
	}
}