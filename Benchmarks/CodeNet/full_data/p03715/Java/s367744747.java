import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	int chokorateBlock[] = new int[2];
	int firstBlock[] = new int[2];;
	int secondBlock[] = new int[2];;
	int shirdBlock[] = new int[2];;
	int secondAndShirdBlock[] = new int[2];
	public static void main(String[] args) {
		Main chokorateBlock= new Main();
		
	}
	public Main() {
		InputStreamReader is = new InputStreamReader(System.in);       //（１）
        BufferedReader br = new BufferedReader(is);                    //（２）

//        System.out.println("何か入力してください.");
        
        String str = null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}                                    //（３）
		String[] divteStr = str.split(" ", 0);
		chokorateBlock[0] = Integer.parseInt(divteStr[0]);
		chokorateBlock[1] = Integer.parseInt(divteStr[1]);
//		System.out.println(chokorateBlock[0]+""+chokorateBlock[1]);
		int difarence[] = new int[4];
		cutHeight(chokorateBlock, firstBlock, secondAndShirdBlock);
		cutHeight(secondAndShirdBlock, secondBlock, shirdBlock);
		difarence[0] = bestBigDifarence();
		cutWidth(secondAndShirdBlock, secondBlock, shirdBlock);
		difarence[1] = bestBigDifarence();
		
		cutWidth(chokorateBlock, firstBlock, secondAndShirdBlock);
		cutWidth(secondAndShirdBlock, secondBlock, shirdBlock);
		difarence[2] = bestBigDifarence();
		cutHeight(secondAndShirdBlock, secondBlock, shirdBlock);
		difarence[3] = bestBigDifarence();
		System.out.println(lessBestNumber(difarence));
	}
	//縦に切る
	private void cutHeight(int[] block, int[] cutBlock1, int[] cutBlock2) {
		int cutHeightNumber = (int)((block[1]-0.2)/2);
		cutBlock1[0] = block[0];
		cutBlock1[1] = cutHeightNumber;
		cutBlock2[0] = block[0];
		cutBlock2[1] = block[1] - cutHeightNumber;

	}
	//横に切る
	private void cutWidth(int[] block, int[] cutBlock1, int[] cutBlock2) {
		int cutHeightNumber = (int)((block[0]-0.2)/2);
		
		cutBlock1[0] = cutHeightNumber;
		cutBlock1[1] = block[1];
		cutBlock2[0] = block[0] - cutHeightNumber;
		cutBlock2[1] = block[1];
	}
	private int bestBigDifarence() {
		int firstBlockArea = firstBlock[0] * firstBlock[1];
		int secondBlockArea = secondBlock[0] * secondBlock[1];
		int shirdBlockArea = shirdBlock[0] * shirdBlock[1];
//		System.out.println(firstBlock[0]+""+firstBlock[1]);
//		System.out.println(secondBlock[0]+""+secondBlock[1]);
//		System.out.println(shirdBlock[0]+""+shirdBlock[1]);
		int difarence[] = new int[3];
		difarence[0] = Math.abs(firstBlockArea - secondBlockArea) ;  
		difarence[1] = Math.abs(firstBlockArea - shirdBlockArea);
		difarence[2] = Math.abs(secondBlockArea - shirdBlockArea);
		
		return bigerBestNumber(difarence);
		
	}
	private int bigerBestNumber(int[] array) {
		int max = -100;
		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
			boolean flagMax = max < array[i];
			if(flagMax)
				max = array[i];
		}
		return max;

	}
	private int lessBestNumber(int[] array) {
		int max = 100;
		for (int i = 0; i < array.length; i++) {
			if(max > array[i])
				max = array[i];
		}
		return max;

	}
}