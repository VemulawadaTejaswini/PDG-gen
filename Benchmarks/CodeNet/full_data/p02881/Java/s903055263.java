import java.util.*;
public class Main{
        public static void main(String[]args){
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                List<Integer> Storage = new ArrayList<Integer>();
                for(int i = 2; i <= n; i++){
                        while(n % i == 0){
                                n = n / i;
                                Storage.add(i);
                                }
                        }
                int x = 1;
                int y = 1;
                for(int i = 0; i < Storage.size(); i++){
                        if(i % 2 == 0){
                                x = x*Storage.get(i);
                                }
                        else{
                                y = y*Storage.get(i);
                                }
                        }
                System.out.println(x+y-2);
                }
        }
