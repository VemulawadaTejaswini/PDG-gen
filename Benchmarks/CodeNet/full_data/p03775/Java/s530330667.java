import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        int input;
        int mini;
        int minj;
        ArrayList<Integer> value = new ArrayList<Integer>();
        input=cin.nextInt();
        for(int i=1;i*i<=input;i++){
            for(int j=1;j*j<=input;j++){
                if(i*j==input){
                    mini = String.valueOf(i).length();
                    minj = String.valueOf(j).length();
                    if(mini>minj){
                        value.add(mini);
                    }else{
                        value.add(minj);
                    }
                }
            }
        }
        if(value.size()==0){
            value.add(String.valueOf(input).length());
        }
        Collections.sort(value);
        System.out.println(value.get(0));
        }
    }
