// proxy

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        System.out.println(stringUnity(a,b,c));
    }    
        
    public static int stringUnity(String a,String b,String c){
        int count = 0; 
        List<String> list_a = Arrays.asList(a.split(""));
        List<String> list_b = Arrays.asList(b.split(""));
        List<String> list_c = Arrays.asList(c.split(""));
        for(int i = 0; i < list_a.size(); i++){
            if(list_a.get(i).equals(list_b.get(i))&&list_a.get(i).equals(list_c.get(i))){
                count += 2;
            }else if(list_a.get(i).equals(list_b.get(i))){
                count += 1;
            }else if(list_a.get(i).equals(list_c.get(i))){
                count += 1;    
            }else if(list_b.get(i).equals(list_c.get(i))){
                count += 1;
            }else{
                count += 0;
            }
        }
        return list_a.size()*2 - count;
    }
}