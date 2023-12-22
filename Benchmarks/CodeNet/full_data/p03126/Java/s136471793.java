import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int answer;

        String[] likeFoods;
        
        
        List<LinkedList<String>> allAnkerts = new LinkedList<LinkedList<String>>();
        List<String> allPersonLikeFoods = new LinkedList<String>();
        List<String> firstPersonAns = new LinkedList<String>();



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";

        try {
			while ((line = reader.readLine()) != null) {
				
				LinkedList<String> ankert = new LinkedList<String>();
		        likeFoods = line.split(" ");
		        
		        for (String likeFood : likeFoods ) {
		        	ankert.add(likeFood);
		        }
		        
		        allAnkerts.add(ankert);
			}
			for (int ite = 0; ite < allAnkerts.size(); ite++ ) {
				if (ite == 0) {
					firstPersonAns = allAnkerts.get(0);
				} else if (ite == 1){
					for (String food : allAnkerts.get(1)) {
						if (firstPersonAns.contains(food)) {
							allPersonLikeFoods.add(food);
						}
					}
					if (allPersonLikeFoods.size() == 0) {
						answer = 0;
						System.out.println(answer);
						return; // end
					}
				} else {
					for (String food : allAnkerts.get(ite)) {
						if (!allPersonLikeFoods.contains(food)) {
							allPersonLikeFoods.remove(food);
						} 
					}
				}
			}
			
			answer = allPersonLikeFoods.size();
			System.out.println(answer);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



    }
}
