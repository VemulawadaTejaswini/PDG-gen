public class Main{
    public static void main(String[] args){
       try{ 
        Scanner in = new Scanner(System.in);
        int num[] = {};
        num = new int [3];
        int n = in.nextInt();
        num[0] = n;
        n = in.nextInt();
        num[1] = n;
        n = in.nextInt();
        num[2] = n;
        in.close();
        int t;
        if(num[0] > num[2]){
            t = num[0];
            num[0] = num[2];
            num[2] = t;
        }
        int s;
        for(int i = 0; i < 2; i++){
            if(num[i+1] < num[i]){
                s = num[i];
                num[i] = num[i+1];
                num[i+1] = s;
            }
        }
        for(int j = 0; j < 3; j++){
        if(j == 2){
            System.out.printf("%d", num[2]);
        }else{
            System.out.printf("%d ", num[j]);
        }
    }
        System.out.printf("\n"); 
    }  catch(NumberFormatException e){
        System.out.println(e);
    }
    }
}
