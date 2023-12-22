import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int gyou = stdIn.nextInt();
        int retsu = stdIn.nextInt();
        String masu[][] = new String[gyou][retsu];
        int count = 0;
        int max = 0;
        int hikari = 0;
        //int doko = 0;
        
        for(int i = 0; i < gyou; i++){
            String s = stdIn.next();
            char c[] = s.toCharArray();
            
            for(int j = 0; j < retsu; j++){
                masu[i][j] = String.valueOf(c[j]);
            }
        }
        
        for(int i = 0; i < gyou; i++){
            for(int j = 0; j < retsu; j++){
                if(masu[i][j].equals(".")){
                    
                    hikari = 0;
                    for(int k = 0; k < gyou; k++){
                        if(k < i){
                            if(masu[k][j].equals("#")){
                                hikari = 0;
                            }else{
                                hikari++;
                            }
                        }
                        
                        if(k > i){
                            if(masu[k][j].equals(".")){
                                hikari++;
                            }else{
                                break;
                            }
                        }
                    }
                    
                    count += hikari;
                    hikari = 0;
                    for(int k = 0; k < retsu; k++){
                        if(k < j){
                            if(masu[i][k].equals("#")){
                                hikari = 0;
                            }else{
                                hikari++;
                            }
                        }
                        
                        if(k > j){
                            if(masu[i][k].equals(".")){
                                hikari++;
                            }else{
                                break;
                            }
                        }
                    }
                    count += hikari;
                    //System.out.println(count);
                    if(count + 1 > max){
                        max = count + 1;
                    }
                    
                    count = 0;
                }
            }
        }
        
        //System.out.println(doko);
        System.out.println(max);
    }
}