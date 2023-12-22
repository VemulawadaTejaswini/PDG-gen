import java.util.*;
public class Main{

 public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;

        // String[] sList = new String[n];
        List<String> sList = new ArrayList<String>();

        for(int k=0;k<n;k++){
            String s = sc.next();
            String[] choice = s.split("");
            List<String> array = new ArrayList<String>();
            for(int i =0;i<10;i++ ){
                array.add(choice[i]);
            }
            Collections.sort(array);
            String tmp = "";
            for(int j=0;j<10;j++){
                tmp = tmp + array.get(j);
            }
            sList.add(tmp);
        }

        Collections.sort(sList);

        long countFlg = 1;
        for(int i=1;i<n;i++){
            
            if(sList.get(i-1).equals(sList.get(i)) && i != n-1){
                countFlg++;
            }else if(sList.get(i-1).equals(sList.get(i))){
                countFlg++;
                result = result + 1;
            }else if(countFlg !=1){
                result = result + (countFlg * (countFlg - 1))/2;
                countFlg = 1;
            }
        }
        System.out.println(result);
        
    }

}