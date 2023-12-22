import java.util.*;
import java.lang.*;
public class Main {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            double rateA=.08;
            double rateB=.1;
            int potenialA=(int)(A/rateA);
            int potenialB=(int)(B/rateB);
            int smallestStart=0;
            if (potenialA<potenialB){
                smallestStart=potenialB;
            }else{
                smallestStart=potenialA;
            }
            int price=smallestStart;
            boolean answerFound=false;
            boolean possible=false;
            while(answerFound==false){
                if((int)(price*rateA)==A&&(int)(price*rateB)==B){
                    possible=true;
                    answerFound=true;
                    break;
                }
                if((int)(price*rateA)>A||(int)(price*rateB)>B){
                    answerFound=true;
                    break;
                }
                price++;
            }
            if(possible){
                System.out.println(price);
            }else{
                System.out.println(-1);
            }
        }
}



