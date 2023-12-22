import java.util.*;
import static java.lang.System.*;

public class Main{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] kuku = {9,8,7,6,5,4,3,2,1};
	int A;
	koko: for(int i=0;i<9;i++){
    A= kuku[i];
    for(int j=0;i<9;i++){
    if((A*kuku[j])==N){
    out.println("Yes");
    break koko;
    }else{
    out.println("No");
    break koko;
    }
    }
    }



}
}