import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        String c = sc.next(); 

        int[] acArray = new int[a];

        String[] strArray = new String[a];
        for(int i = 0; i < a ; i++){
            strArray[i] = String.valueOf(c.charAt(i));
            acArray[i] = 2000000;
        }

        int[] questionArray = new int[2 * b];
        for(int j = 0; j < b * 2 ; j++){
            questionArray[j] = sc.nextInt();
        } 

        

        int count = 0;
        int ans = 0;

        int i = c.indexOf("A");
        while(i >= 0){
            //debug
            //System.out.println(i);

            if(strArray[i+1].equals("C")){
                acArray[count] = i;
                //debug
                //System.out.println(acArray[count]);
                count++;
            }
            i = c.indexOf("A", i+1);
        }

        for(int l = 0; l < questionArray.length ; l = l+2){
            for(int m = 0 ; m < acArray.length ;m++){
                if(questionArray[l]-1 <= acArray[m] && questionArray[l+1]-1 >= acArray[m]+1){
                    ans = ans + 1;
                    //debug
                    //System.out.println(ans);
                } 
            }
            System.out.println(ans);
            ans = 0;
        }
    }
}