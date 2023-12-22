public class Main{
	public static void main(String[] args){
		int R = Integer.parseInt(args[0]);
		int G = Integer.parseInt(args[1]);
		int B = Integer.parseInt(args[2]);
		int N = Integer.parseInt(args[3]);
		int combinations = 0;
		
		for(int r = 0;r*R <= N; r++){
			for(int g = 0; r*R + g*G <= N; g++){
				for(int b = 0; r*R + g*G + b*B <= N; b++){
					if(r*R + g*G + b*B == N){
						combinations++;
					}
				}
			}
		}
		
		System.out.println(combinations);
	}
}