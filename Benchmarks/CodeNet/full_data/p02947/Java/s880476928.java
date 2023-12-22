import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer N = scan.nextInt();
        ArrayList<String> str = new ArrayList<String>();

        for(int i=0;i<N;i++){
            String s = strSort(scan.next());
            str.add(s);
        }

        Collections.sort(str);

        //for(int i=0;i<N;i++) System.out.println(str.get(i));

        long sum = 0;
        for(int i=0;i<N-1;i++){
            if(str.get(i).equals(str.get(i+1))){
                int counter = i;
                int num = 1;
                while(true){
                    //System.out.println("count");

                    if(counter<N-1){
                        if(str.get(counter).equals(str.get(counter+1))){
                            num++;
                            counter++;
                        }else{
                            break;
                        }
                    }else{
                        break;
                    }
                }             
                //System.out.println("num:" + num);   
                sum += calcNumOfCombination(num, 2);
                //System.out.println(sum);
                i=counter;
            }
        }

        System.out.println(sum);

    }

    static int calcNumOfCombination(int n, int r){
        return factorial(n) / (factorial(r) * factorial(n-r));
    }
    static int factorial(int n){
        int answer = 1;
	while(n > 1){
	    answer *= n;
	    n--;
	}
        return answer;
    }

    public static String strSort(String str){
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return new String(c);        
    }
}
