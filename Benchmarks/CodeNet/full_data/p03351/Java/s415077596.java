import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        ArrayList<Integer> distance = new ArrayList<Integer>();
        distance = getNumArray(line);
        int a = distance.get(0);
        int b = distance.get(1);
        int c = distance.get(2);
        int d = distance.get(3);
        
        if(isSpeakable(a, c, d)){
            System.out.println("Yes");
        }else if(isSpeakable(a, b, d) && isSpeakable(b, c, d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
    public static ArrayList<Integer> getNumArray(String line){
        String[] str = line.split(" ");
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(String strNum : str){
            num.add(Integer.parseInt(strNum));
        }
        return num;
    }
    
    public static boolean isSpeakable(int n1, int n2, int distance){
        boolean speakable = true;
        boolean unspeakable = false;
        
        if(Math.abs(n1 - n2) <= distance){
            return speakable;
        }else{
            return unspeakable;
        }
    }
}

