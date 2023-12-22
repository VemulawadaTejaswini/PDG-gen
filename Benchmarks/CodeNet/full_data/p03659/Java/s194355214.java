import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ena000078
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> cards = new ArrayList<>();
        for (int i=0;i<N;i++){
            cards.add(sc.nextInt());
        }
        
        Collections.sort(cards);
        
        int len = cards.size();
        
        int sumA = 0;
        int sumB = 0;
        
        switch (len){
            case 2:
                sumA = cards.get(0);
                sumB = cards.get(1);
                break;
                
            case 3:
                sumA = cards.get(0);
                sumB = cards.get(2);
                if(sumA < sumB){
                    sumA += cards.get(1);
                }else{
                    sumB += cards.get(1);
                }
                break;
                
            default:
                int mod = len % 4;
                for(int i=0;i<(len-mod)/2;i++){
                    if(i % 2 == 0){
                        sumA += cards.get(i);
                        sumA += cards.get(len-1-i);
                    }else{
                        sumB += cards.get(i);
                        sumB += cards.get(len-1-i);
                    }
                    //System.out.println(sumA + ","+ sumB);
                }
                switch(mod){
                    case 0:
                        break;
                    case 1:
                        if(sumA<sumB){
                            sumA += cards.get(len/2);
                        }else{
                            sumB += cards.get(len/2);
                        }
                        break;
                    case 2:
                        if(sumA<sumB){
                            sumA += cards.get(len/2+1);
                            sumB += cards.get(len/2);
                        }else{
                            sumA += cards.get(len/2);
                            sumB += cards.get(len/2+1);
                        }
                        break;
                    case 3:
                        if(sumA<sumB){
                            sumA += cards.get(len/2+1);
                            sumB += cards.get(len/2-1);
                        }else{
                            sumA += cards.get(len/2-1);
                            sumB += cards.get(len/2+1);
                        }
                        if(sumA<sumB){
                            sumA += cards.get(len/2);
                        }else{
                            sumB += cards.get(len/2);
                        }
                }
        }
        System.out.println(Math.abs(sumA - sumB));
    }
}