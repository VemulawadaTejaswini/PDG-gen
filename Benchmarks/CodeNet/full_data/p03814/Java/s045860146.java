import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int flag = 0;
        int placeA = 0;
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i) == 'A'){
                placeA = i;
                break;
            }
        }
        int[] placeB = new int[a.length()];
        for(int i =0;i<a.length();i++){
            if(a.charAt(i) == 'Z'){
                placeB[flag] = i;
                flag++;
            }
        }
        int answer = 0;
        for(int i = 0;i<a.length();i++){
                    answer = Math.max(answer,placeB[i]-placeA+1);
        }
        System.out.println(answer);
    }
}