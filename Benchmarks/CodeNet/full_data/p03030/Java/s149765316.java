import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <String> cityNames = new ArrayList<String>();
        ArrayList <Integer> scores = new ArrayList<Integer>();
        ArrayList <String> dictionary = new ArrayList<String>(); 
        for(int i = 0; i < n; i++){
            String temp = sc.next();
            String cityName = temp;
            temp = sc.next();
            int score = Integer.parseInt(temp);
            if(!cityNames.contains(cityName)){
                dictionary.add(cityName);
            }
            cityNames.add(cityName);
            scores.add(score);
        }
        Collections.sort(dictionary);
        for(int i = 0; i < dictionary.size(); i++){
            ArrayList <Integer> scoreOrder = new ArrayList<Integer>();
            String cityName = dictionary.get(i);
            for(int j = 0; j < cityNames.size(); j++){
                if(cityNames.get(j).equals(cityName)){
                    scoreOrder.add(scores.get(j));
                }
            }
            Collections.sort(scoreOrder,Comparator.reverseOrder());
            for(int j = 0; j < scoreOrder.size();j++){
                System.out.println(scores.indexOf(scoreOrder.get(j)) + 1);
            }
            scoreOrder.clear();
        }
        
    }

}
