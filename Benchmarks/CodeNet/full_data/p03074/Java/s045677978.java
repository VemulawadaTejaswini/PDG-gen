import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String s = sc.next();
		
		int ans = 0;
		
		//All 1 case:
		if(s.length() == countCase(s, '1')) {
			ans = s.length();
		} else {
		
			char[] org = s.toCharArray();
			int[] positions = getPositions(org, '0'); //連続した0の箇所を探す

			for(int j = 0; j < b; j++) {
				List<Integer> maxPositions = getMaxValuePositions(positions);

				
				org = maxedReversed(org, maxPositions, positions);
				positions = getPositions(org, '0');

			}
			
			int[] ansPositions = getPositions(org, '1');
			
			ans = ansPositions[getMaxValuePositions(ansPositions).get(0).intValue()];
		}


		String reString = "" + ans;
		System.out.println(reString);
	}
	
	public static char[] maxedReversed(char[] org, List<Integer> maxValuePositions, int[] positions) {
		int maxOfSakadachi = 0;
		char[] maxReversedChars = null;
		for(Integer maxPostion: maxValuePositions) {
			char[] temp = reverseChars(org, maxPostion.intValue(), positions[maxPostion.intValue()]);
//			print(org,  "org :");
//			print(temp, "temp:");
			int[] tempPositions = getPositions(temp, '1');
//			print(tempPositions, "tpos:");
			List<Integer> tempMaxPositions = getMaxValuePositions(tempPositions);
			int tempMaxValue = tempPositions[tempMaxPositions.get(0).intValue()];
			if (tempMaxValue > maxOfSakadachi) {
				maxOfSakadachi = tempMaxValue;
				maxReversedChars = temp;
				
//				System.out.println("s="+maxOfSakadachi);
			}
		}
		return maxReversedChars;
	}
	
	public static void print(char[] chars, String pre) {
		System.out.print(pre);
		for(char c: chars) {
			System.out.print(c);
		}
		System.out.println();
	}
	public static void print(int[] chars, String pre) {
		System.out.print(pre);
		for(int c: chars) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static int countCase(String input, char find) {
		int ret = 0;
		for(char c: input.toCharArray() ) {
			if(c == find) {
				ret++;
			}
		}
		return ret;
	}
	public static int[] getPositions(char[] chars, char find) {
		int[] position = new int[chars.length];// 0が連続で並んでる個数
		for(int i = 0; i < chars.length; i++) {
			int j = 0;
			while ((i+j) < chars.length && chars[i+j] == find) {
				j++;
			}
			position[i] = j;
		}
		return position;
	}
	
	public static List<Integer> getMaxValuePositions(int[] positions) {
		List<Integer> ansList = new ArrayList<>();
		int tempMaxValue = 0;
		for(int i = 0; i < positions.length; i++) {
			if( positions[i] > tempMaxValue ) {
				tempMaxValue = positions[i];
			}
		}
		for(int i = 0; i < positions.length; i++) {
			if( positions[i] == tempMaxValue ) {
				ansList.add(i);
			}
		}
		
		
		return ansList;
 	}
	
	public static char[] reverseChars(char[] chars, int startPos, int length) {
		char[] retChars = new char[chars.length];
		
		for(int i = 0; i < chars.length; i++) {
			if(startPos <= i && i < startPos + length) {
				retChars[i] = reverse(chars[i]);
				
			} else {
				retChars[i] = chars[i];
			}
		}
		return retChars;
	}
	
	public static char reverse(char c) {
		if(c == '0') return '1';
		if(c == '1') return '0';
		return '0';
	}
}