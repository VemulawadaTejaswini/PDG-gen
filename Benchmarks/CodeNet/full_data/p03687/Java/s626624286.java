import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        int[] count = new int[26];
        System.out.println();
        
        char[] input = new char[line.length()];
        line.getChars(0, line.length(), input, 0);
        
        
        // アルファベットの数をカウント
        for (int i = 0; i < input.length; i++) {
			count[input[i]-'a']++;
		}
        
        // 一番多いアルファベットのカウントを調べる
        int max_count = 0;
        for (int i = 0; i < count.length; i++) {
        	if (max_count < count[i]) {
        		max_count = count[i];
        	}
//			System.out.println('a'+i+": " + count[i]);
		}
        
        int seq_max_best = 100;
        // 一番多いアルファベットに対して、トライ
        for (int i = 0; i < count.length; i++) {
//        	System.out.println("try" + i);
        	if (count[i] == max_count) {
	        	int seq_max = simulate('a' + i, input);
	        	if (seq_max_best > seq_max) {
	        		seq_max_best = seq_max;
	        	}
        	}
		}
        
        
        
        System.out.println(seq_max_best);
        
        
	}
	
	public static int simulate(int max, char[] input) {
        int seq_max = 0;
        int seq = 0;
        // maxまでの文字数が一番長いものをカウント
        for (int i = 0; i < input.length; i++) {
			if (input[i] == max) {
				// 最長を見つけたらseq_maxにセットして、seqをリセット
				if (seq_max < seq) {
					seq_max = seq;
					seq = 0;
				}
			} else {
				seq++;
			}
		}
        
        // 最後がmaxで終わらない文字列の時
		if (seq_max < seq) {
			seq_max = seq;
			seq = 0;
		}
		
		return seq_max;
	}
	

}
