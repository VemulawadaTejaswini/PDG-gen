import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	Long num = sc.nextLong();
        Long sl = 0L;
        for(Long i = 1L; i < num + 1; i++){
            if(i * i <= num && sl < i * i){
                sl = i * i;
            }
        }
        System.out.println(sl);
	}
}