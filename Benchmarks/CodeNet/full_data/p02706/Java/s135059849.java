import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
    public static void main(String args[]) throws IOException {
	Scanner scanner = new Scanner(System.in);
	int summer = scanner.nextInt();
	//宿題の数
	int num = scanner.nextInt();
	//計算用
      int tmp = 0;
      
	for(int i=0;i<num;i++){
        tmp += scanner.nextInt();
	}

    if(summer>=num){
      System.out.println(summer-tmp);
    }else{
       System.out.println(-1);
    }
      
    }
}