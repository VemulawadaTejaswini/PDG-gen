import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Shiritori shiritori = new Shiritori();
        for(int i= 0; i< N; i++){
            String word = br.readLine();
            if(!(shiritori.isRightInitial(word) && shiritori.isNotContains(word))){
                System.out.println("No");
                return;
            }
            shiritori.accepted(word);
        }
        System.out.println("Yes");
    }
}
class Shiritori{
    private List<String> wordList;
    public Shiritori(){
        this.wordList = new ArrayList<String>();
    }
    public boolean isRightInitial(String nextword){
        if(this.wordList.size() == 0) return true;
        String lastword = this.wordList.get(this.wordList.size() - 1);
        String head = nextword.substring(0, 1);
        String butt = lastword.substring(lastword.length() - 1, lastword.length());
        return head.equals(butt);
    }
    public boolean isNotContains(String nextword){
        return !(this.wordList.contains(nextword));
    }
    public boolean accepted(String nextword){
        this.wordList.add(nextword);
        return true;
    }
}