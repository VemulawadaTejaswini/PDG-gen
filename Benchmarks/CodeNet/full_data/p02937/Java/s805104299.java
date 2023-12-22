import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final String s = scan.next();   
        final String t = scan.next();
        String resultStr = s;
        boolean isFind = true;
        String tempT;
        int count = 1;
        String [] findChar = new String[t.length()];
        int[] findIndex = new int[t.length()];

        // tを構成する全英文字がsに含まれているか
        for(int i = 0; i < t.length(); i++){
            tempT = t.substring(i, i + 1);
            if(s.contains(tempT)){
                findChar[i] = tempT;
                findIndex[i] = s.indexOf(tempT);
            }else{
                isFind = false;
                break;
            }
        }
        if(isFind){
            for(int i = 1; i < t.length(); i++){
                if(findIndex[i - 1] > findIndex[i]){
                    resultStr = resultStr + s;
                    count++;
                }
            }
            resultStr = resultStr.substring(0, (count - 1) * s.length() + findIndex[t.length() - 1] + 1);
            System.out.println(resultStr.length());


        }else{
            System.out.println("-1");
        }
        scan.close();
    }
}