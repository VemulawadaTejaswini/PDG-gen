public class Main{
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        int headSum =sc.nextInt();
        int footSum =sc.nextInt();
        int kameFoot = headSum * 4;
        if(kameFoot >= footSum){
            if((kameFoot-footSum)%2==0&&(kameFoot-footSum)/2 <=headSum){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
       }
    }
