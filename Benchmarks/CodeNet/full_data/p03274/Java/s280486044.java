//package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    private static boolean isPrint = false;

    public static void main(String[] args) throws Exception {
    	
    	BufferedReader br = new BufferedReader(
				new InputStreamReader(Main.class.getResourceAsStream("/data.txt")));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] systemInLine = br.readLine().split(" ");
		//蜡烛总数 
		int candleCount = Integer.parseInt(systemInLine[0]);
		//点燃总数 
		int burning = Integer.parseInt(systemInLine[1]);
		showMessage("蜡烛总数:"+candleCount+",点燃总数:"+burning);
		systemInLine = br.readLine().split(" ");
    	
        
        int[] arr = new int[candleCount];
        
        for (int i = 0; i < candleCount; i++) {
            arr[i] = Integer.parseInt(systemInLine[i]);
        }

        int min = Integer.MAX_VALUE;
        int left, right, num;
        for (int i = 0; i < candleCount - burning + 1; i++) {
            left = arr[i];
            right = arr[i + burning - 1];
            //获取左边
            if (right < 0) {
                num = Math.abs(left);
                min = Math.min(min, num);
                continue;
            }
            //右边
            if (left >= 0) {
                num = right;
                min = Math.min(min, num);
                continue;
            }
            //比较计算
            if (left < 0 && right >= 0) {
            	num = Math.min(Math.abs(left) * 2 + right, Math.abs(left) + right * 2);
                min = Math.min(min, num);
            }
        }
        System.out.println(min);
    }
    public static void showMessage(Object message) {
		if(isPrint) {
			System.out.println(message);
		}
	}
}
