import java.util.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int rei = Integer.valueOf(sc.next());
            int den = Integer.valueOf(sc.next());
            int wari = Integer.valueOf(sc.next());
 
            int reiMin = 0;
            List<Integer> reiPrice = new ArrayList<>();
            for(int i = 0; i < rei; i++){
                int ri = Integer.valueOf(sc.next());
                if(reiMin == 0)reiMin = ri;
                if(reiMin > ri)reiMin = ri;
                reiPrice.add(ri);
            }
            
            int denMin = 0;
            List<Integer> denPrice = new ArrayList<>();
            for(int j = 0; j < den; j++){
                int dj = Integer.valueOf(sc.next());
                if(denMin == 0)denMin = dj;
                if(denMin > dj)denMin = dj;
                denPrice.add(dj);
            }

            int wariPriceMin = 0;
            for(int k = 0; k < wari; k++){
                int thisPriceR = reiPrice.get(Integer.valueOf(sc.next()));
                int thisPriceD = denPrice.get(Integer.valueOf(sc.next()));
                int wariPrice = thisPriceD + thisPriceR - Integer.valueOf(sc.next());

                if(wariPriceMin == 0){
                    wariPriceMin = wariPrice;
                }
                if(wariPriceMin > wariPrice){
                    wariPriceMin = wariPrice;
                }
            }

            int seikiPriceMin = reiMin + denMin;

            if(seikiPriceMin < wariPriceMin){
                System.out.println(seikiPriceMin);
            }else{
                System.out.println(wariPriceMin);
            }
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}