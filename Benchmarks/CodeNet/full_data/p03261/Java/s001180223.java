import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        String result = "Yes";
        for(int i = 0; i < n; i++){
            words[i] = sc.next();
            for(int j = 0; j < i - 1; j++){
                if(words[j].equals(words[i])){
                    result = "No";
                }
            }
        }
        char firstEnd = words[0].charAt(words[0].length() - 1);
        for(int i = 1; i < n; i++){
            if(firstEnd != words[i].charAt(0)){
                result = "No";
            }
            firstEnd = words[i].charAt(words[i].length() - 1);
        }
    
        System.out.println(result);
    }
}
