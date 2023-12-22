import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	//入力一回目　Aが支配下に置きたい都市の数
    	//入力二回目　Bが支配下に置きたい都市の数
    	//入力三回目　A帝国の首都の場所
    	//入力四回目　B帝国の首都の場所
        Scanner sc = new Scanner(System.in);
        int [] num = new int[4];
        for (int i = 0; i < 4; i ++) {
        	num[i] = sc.nextInt();
        } 
        //A帝国の都市の場所
        Integer [] num1 = new Integer[num[0]];
        for (int i = 0; i < num[0]; i++) {
        	num1[i] = sc.nextInt();
        }
        //B帝国の都市の場所
        int [] num2 = new int[num[1]];
        for (int i = 0; i < num[1]; i++) {
        	num2[i] = sc.nextInt();
        }
        //A帝国の都市を降順にする
        Arrays.sort(num1, Comparator.reverseOrder());
        
        //B帝国の都を昇順にする
        Arrays.sort(num2);
        
        //戦争が起こるかどうかの判定
        if(num2[0]-num1[0] > 0) {
        	System.out.println("No War");
        }else {
        	System.out.println("War");
        }     
        
    }
}