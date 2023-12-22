import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wordsN = scanner.nextInt();
        String[] shiritoriW = new String[wordsN];
        String ans="Yes";
        shiritoriW[0] = scanner.next();
        checkLoop:
        for(int i=1;i<wordsN;i++){
            shiritoriW[i] = scanner.next();
            if(!(shiritoriW[i].charAt(0)==shiritoriW[i-1].charAt(shiritoriW[i-1].length()-1))){
                ans="No";
              break;
            } else {
                for(int j=i-1;j>=0;j--){
                    if(shiritoriW[i].equals(shiritoriW[j])){
                        ans = "No";
                        break checkLoop;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
