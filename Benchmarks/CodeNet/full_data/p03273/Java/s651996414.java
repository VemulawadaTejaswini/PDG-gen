import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();		
		List<List<Integer>> listHeight = new ArrayList<>();

		for(int cntHeight = 0 ; cntHeight < height ; cntHeight++){
			String str = sc.next();
			List<Integer> listWidth = new ArrayList<>();
			for(int cntWidth = 0 ; cntWidth < width ; cntWidth++){				
				char chr = str.charAt(cntWidth);
				int input = (chr == '#') ? 1 : 0;
				listWidth.add(input);
			}
			listHeight.add(listWidth);
		}
		sc.close();

		for(int cntHeight = height-1 ; cntHeight > -1 ; cntHeight--){
			int sum = 0;
			for(int cntWidth = 0 ; cntWidth < width ; cntWidth++){				
				sum = sum + listHeight.get(cntHeight).get(cntWidth);			
			}
			if(sum == 0){
				listHeight.remove(cntHeight);
				height--;
			}
		}

		for(int cntWidth = width-1 ; cntWidth > -1 ; cntWidth--){
			int sum = 0;
			for(List<Integer> list :listHeight){
				sum = sum + list.get(cntWidth);
			}			
			if(sum == 0){
				for(List<Integer> list :listHeight){
					list.remove(cntWidth);					
				}
				width--;
			}
		}
		
		for(List<Integer> list : listHeight){
			for(int cntWidth = 0 ; cntWidth < width ; cntWidth++){	
				System.out.print(list.get(cntWidth)==1 ? "#" : ".");
			}
			System.out.println("\n");
		}
	}
}