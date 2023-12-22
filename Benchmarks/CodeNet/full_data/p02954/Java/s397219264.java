import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        char c[] = s.toCharArray();
        int peopleR[] = new int[s.length()];
        int peopleL[] = new int[s.length()];
        int people[] = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            peopleR[i] = 1;
            peopleL[i] = 1;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(c[i] == 'R'){
                people[i + 1] += peopleR[i];
                peopleR[i + 1] += peopleR[i];
                peopleR[i] = 0;
            }
        }
        
        for(int i = s.length() - 1; i >= 0; i--){
            if(c[i] == 'L'){
                people[i - 1] += peopleL[i];
                peopleL[i - 1] += peopleL[i];
                peopleL[i] = 0;
            }
        }
        
        for(int i = 0; i < s.length(); i++){
            if(c[i] == 'R'){
                if(c[i + 1] =='L'){
                   int tmp = people[i];
                   people[i] = people[i + 1];
                   people[i + 1] = tmp;
                }
            }
        }
        
        for(int i = 0; i < s.length() - 1; i++){
            System.out.print(people[i] + " ");
        }
        System.out.print(people[s.length() - 1]);
    }
}