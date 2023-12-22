import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int flag = 0;
        int[] placeA = new int[a.length()];
        int[] placeB = new int[a.length()];
        for(int i =0;i<a.length();i++){
            if(a.charAt(i) == 'A'){
                placeA[flag] = i;
                flag++;
            }
            if(a.charAt(i) == 'Z'){
                placeB[flag] = i;
                flag++;
            }
        }
        int answer = 10000000;
        for(int i = 0;i<a.length();i++){
            for(int j = 0;j<a.length();j++){
                if(placeA[i] - placeB[j] != 0){
                    answer = Math.min(answer,Math.abs(placeA[i]-placeB[j])+1);
                }
            }
        }
        System.out.println(answer);
    }
}