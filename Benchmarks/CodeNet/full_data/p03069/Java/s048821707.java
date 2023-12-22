import java.util.Scanner;
import java.util.ArrayList;

public final class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        String s = stdIn.next();

        char[] ca = s.toCharArray();

        ArrayList<Integer> grope = new ArrayList<>();
        boolean firstIsWhite = (ca[0] == '.') ? true : false;
        int counter = 1;
        char lastlit = ca[0];
        for(int i=1; i<n; i++){
            if(lastlit == ca[i]){
                counter++;
            }else{
                grope.add(counter);
                counter = 1;
            }
            lastlit = ca[i];
        }

        int ans = 0;

        if((firstIsWhite && grope.size()%2 == 0) || (!firstIsWhite && grope.size()%2 ==1)){
            for(int i=grope.size()-1; i>=0; i--){
                if(i == grope.size()-1){

                }else{
                    if(grope.get(i)<grope.get(i+1)){
                        ans++;
                        if(i != 0){
                            grope.set(i-1, grope.get(i-1) + grope.get(i) + grope.get(i+1));
                        }
                    }else{
                        ans++;
                    }
                }
            }
        }else{
            for(int i=grope.size()-1; i>=0; i--){
                if(i == grope.size()-1){
                    if(grope.get(i-1)<grope.get(i)){
                        ans++;
                        if(i != 0 && i!=1){
                            grope.set(i-2, grope.get(i-2) + grope.get(i-1) + grope.get(i));
                        }
                    }else{
                        ans++;
                    }
                }else if(i == 0){
                    //何もしない
                }
            }
        }

        System.out.println(ans);
    }
}