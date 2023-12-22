import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        int group;
        long result=0;
        ArrayList<Integer> power = new ArrayList<Integer>();
        group = cin.nextInt();
        for(int i =0;i<3*group;i++){
            power.add(cin.nextInt());
        }
            Collections.sort(power, Comparator.reverseOrder());
            for(int j=1;j<group;j++){
	        result = result+power.get(2*j-1);
            }   
            System.out.println(result);
    }
}
