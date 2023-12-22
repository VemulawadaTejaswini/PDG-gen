import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String[] s2 = s.split("");
        int n = s.length();
        int[] answer = new int[n];
        
        int r = 0;
        for(int i = 0; i < n; i++){
            if(s2[i].equals("R")){
                r++;
            }else if(r != 0){
                if(r == 1){
                    answer[i - 1]++;
                }else if(r % 2 == 0){
                    answer[i - 1] = r / 2;
                    answer[i] = r / 2;
                }else{
                    answer[i - 1] = r / 2 + 1;
                    answer[i] = r / 2;
                }
                r = 0;
            }
        }
        
        int l = 0;
        for(int i = n-1; i >= 0; i--){
            if(s2[i].equals("L")){
                l++;
            }else if(l != 0){
                if(l == 1){
                    answer[i + 1]++;
                }else if(l % 2 == 0){
                    answer[i + 1] += l / 2;
                    answer[i] += l / 2;
                }else{
                    answer[i + 1] += l / 2 + 1;
                    answer[i] += l / 2;
                }
                l = 0;
            }
        }
        
        String answer2 = "";
        for(int i = 0; i < n; i++){
            answer2 += answer[i] + " ";
        }
        
        answer2 = answer2.substring(0, answer2.length() -1);
        
        System.out.println(answer2);
    }
}