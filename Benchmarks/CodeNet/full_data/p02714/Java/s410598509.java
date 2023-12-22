import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            int n = Integer.parseInt(sc.next());
            String rgb = sc.next();

            int countR = 0;
            int countG = 0;
            int countB = 0;

            int countDiff = 0;

            for(int i = 0; i < n; i++){

                String subRGB = rgb.substring(i, i + 1);

                if(subRGB.equals("R"))countR++;
                else if(subRGB.equals("G"))countG++;
                else if(subRGB.equals("B"))countB++;

              	if(i >= n - 2)continue;
              	
                for(int j = i + 1; j < n; j++){
                    int k = j + (j - i);

                    if(k > (n - 1))break;
                    
                    String subJ = rgb.substring(j, j + 1);
                    String subK = rgb.substring(k, k + 1);

                    if(!subRGB.equals(subJ) && !subRGB.equals(subK) && !subJ.equals(subK)){
                        countDiff++;
                    }
                }
            }
			
            System.out.println((countR * countG * countB) - countDiff);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}