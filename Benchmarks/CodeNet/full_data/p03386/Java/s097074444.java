import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();

    }
 
    int ans,tmp;
    public void input(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> ansList = new ArrayList<Integer>();
        for(int i = 0; i < k; i++){
            ansList.add(a + i);
            if(a + i == b){
                break;
            }
        }
        for(int i = 0; i < k; i++){
            if(ansList.contains(b - i)){
                break;
            }
            ansList.add(b - i);
        }
        Collections.sort(ansList);
        for(int i = 0; i < ansList.size(); i++){
            System.out.println(ansList.get(i));
        }
        sc.close();
    }

}