import java.util.*;
import java.io.*;
 
public class Main{
    public static void main(String[] args){
        Main m = new Main();
        m.input();
    }
 
    public void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        ArrayList<Integer> li = primeSet();
        for(int j = 0; j < n; j++){
            System.out.print(li.get(j));
            if(j == n - 1){
                break;
            }
            System.out.print(" ");
        }
        System.out.println();
        
    }

    public ArrayList<Integer> primeSet(){
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(2);
        
        for(int i = 3; i <= 555; i = i + 2){
            boolean check = true;
            for(int j = 0; j < li.size(); j++){
                if(i % li.get(j) == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                if(i % 4 == 1){
                    li.add(i);
                }
            }
        }

        return li;
    }
    
}