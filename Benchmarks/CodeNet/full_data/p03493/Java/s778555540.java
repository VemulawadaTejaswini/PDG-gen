import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] array = sc.split("");
        int num =0;
        for(int i=0;i<array.length;i++){
          if(array[i]==1){
         	num+=1;
          }
        }
        System.out.println(num);
    }
}
