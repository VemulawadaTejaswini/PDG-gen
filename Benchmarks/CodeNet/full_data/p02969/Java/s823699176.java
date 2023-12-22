public class Main{
    public static void main(String[] args){
        try{
            int r = Integer.parseInt(args[0]);
            if(1 <= r || r <=100){

            System.out.println(r*r*3);

            }else{
                return;
            }

        }catch(Exception e){
            //do nothing
            return;
        }
    }
}