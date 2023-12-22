

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Atcoder用

/*
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] abc = br.readLine().split(" ");
		int a = Integer.parseInt(abc[0]);
		int b = Integer.parseInt(abc[1]);
		int c = Integer.parseInt(abc[2]);
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] HW = br.readLine().split(" ");
		int h = Integer.parseInt(HW[0]);
		int w = Integer.parseInt(HW[1]);


		//TODO ArrayListに変える
		ArrayList<ArrayList<String>> ban = new ArrayList();
		//String[][] ban = new String[h][w];
		String[] line;

		for(int height=0;height<h;height++){
			line = br.readLine().split("");
			ArrayList<String> second = new ArrayList<String>();
			for(int width=0;width<w;width++){
				second.add(line[width]);
				//ban[height][width] = line[width];
			}
			ban.add(second);
		}

		/* test
		for(int x=0;x<h;x++){
			for(int y=0;y<w;y++){
				System.out.print(ban.get(x).get(y));
			}
			System.out.println();
		}*/

		boolean isYokoWhite = true;
		boolean isTateWhite = true;

		while(isYokoWhite){
			isYokoWhite = false;
			for(int x=0;x<ban.size();x++){
				isYokoWhite = yoko(ban,x);
				if(isYokoWhite){
					ban.remove(x);
					break;
				}
			}
		}

		if(ban.size()==0)System.exit(0);
		
		while(isTateWhite){
			isTateWhite = false;
			for(int x=0;x<ban.get(0).size();x++){
				isTateWhite = tate(ban,x);
				if(isTateWhite){
					for(int a = 0;a<ban.size();a++){
						ban.get(a).remove(x);
					}
				}
				if(isTateWhite)break;
			}
		}




		for(int x=0;x<ban.size();x++){
			for(int y=0;y<ban.get(0).size();y++){
				System.out.print(ban.get(x).get(y));
			}
			System.out.println();
		}

	}

	static boolean tate(ArrayList<ArrayList<String>> s,int j){
		boolean isWhite = true;
		for (int i = 0;i<s.size();i++){
			if(s.get(i).get(j).equals("#")){
				isWhite = false;
				break;
			}
		}
		return isWhite;
	}

	static boolean yoko(ArrayList<ArrayList<String>> s, int i){
		boolean isWhite = true;
		for(int j = 0;j<s.get(i).size();j++){
			if(s.get(i).get(j).equals("#")){
				isWhite = false;
				break;
			}
		}
		return isWhite;
	}

}
