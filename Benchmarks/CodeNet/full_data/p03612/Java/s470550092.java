import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int size = 100001;
            int len = sc.nextInt();
            int[] num;
            num = new int[len];
            int i;
        try{
            for(i = 0;i < len ;i++)num[i] = sc.nextInt();
            int buf = 0;
            int count = 0;
            for(i = 0;i < len ;i++){
                if(num[i] == i+1){
                    count++;
                    if(i == len-1){
                        num[i] = buf;
                        num[i] = num[i-1];
                        num[i-1] =buf;
                    }else{
                        num[i] = buf;
                        num[i] = num[i+1];
                        num[i+1] = buf;
                    }
                }
            }
            System.out.print(count);
        }
        catch(Exception e){
            System.out.print("error");
        }
	}
}