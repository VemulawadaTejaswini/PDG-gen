public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        String strA, strB;
        strA = String.valueOf(a);
        strB = String.valueOf(b);
        String strCon = strA + strB;
        int con = Integer.parseInt(strCon);
        double conSqrt;
        conSqrt = Math.sqrt(con);
        conSqrt = Math.round(conSqrt);
        if(conSqrt * conSqrt == con){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
