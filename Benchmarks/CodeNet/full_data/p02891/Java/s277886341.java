import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        int k = Integer.parseInt(str2);
        int count[] = new int[str1.length()];
        int cnt = 0;
        for(int i = 0; i < str1.length()-1; i++){
            if(str1.charAt(i) == str1.charAt(i+1)){
                count[cnt] += 1;
            }else{
                cnt++;
            }
        }
        int res = 0;
        for(int i = 0; i < str1.length(); i++){
            if(count[i]+1 < 2){
                continue;
            }else if((count[i]+1) % 2 == 0){
                res += (count[i]+1) / 2;
            }else{
                res += (count[i]) /2;
            }
        }
        System.out.println((long)res*k);
    }
}
