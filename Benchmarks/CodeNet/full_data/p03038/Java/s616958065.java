import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cardNum = sc.nextInt();
        int sousaNum = sc.nextInt();

        long[] card = new long[cardNum];
        int[] maisuu = new int[sousaNum];
        long[] atai = new long[sousaNum];


        for(int i = 0;i<cardNum;i++){
         card[i] = sc.nextInt();
        }



        for(int j =0; j < sousaNum; j++){
          maisuu[j] = sc.nextInt();
          atai[j] = sc.nextInt();
        }

        for(int l = 0 ; l < sousaNum ; l++){
          Arrays.sort(card);
          for(int k = 0 ; k < maisuu[l] ;k++ ){
            if(atai[l] > card[k]){
              card[k] = atai[l];
            }else{
              break;
            }


          }

        }

        long sum = 0;

        for( int c=0; c<card.length; c++ ) {
                        sum += card[c];
                }
                System.out.println(sum);




    }
}
