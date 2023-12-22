import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int slime = sc.nextInt();
		String a = sc.next();
        String b[] = a.split("");
        int ans = slime;
     
        for(int i = 0; i < slime - 1;i++){
			if(b[i].equals(b[i+1])){
              ans -= 1;
            }
        }
      	System.out.println(ans);
 
    }
}