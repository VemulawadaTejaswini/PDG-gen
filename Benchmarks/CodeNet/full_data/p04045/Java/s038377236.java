import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = br.readLine();
            String[] items = line.split("\\s+");
            String targetNumber = items[0];

            Set<String> validNumberSet = new TreeSet<>();
            for(int i = 0; i < 10; i ++){
                validNumberSet.add(String.valueOf(i));
            }
            validNumberSet.removeAll(Arrays.asList(br.readLine().split("\\s+")));

            char[] targets = targetNumber.toCharArray();
            for(int i=0; i < targets.length; i++){
                for(String s : validNumberSet) {
                    if(s.equals(String.valueOf(targets[i]))){
                        break;
                    } else if(s.compareTo(String.valueOf(targets[i])) > 0){
                        targets[i] = s.toCharArray()[0];
                        break;
                    }
                }
            }
            System.out.println(new String(targets));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}