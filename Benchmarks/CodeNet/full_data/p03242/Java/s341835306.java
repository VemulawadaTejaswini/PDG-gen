import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String n[]=new String[3];

        for(int i=0; i<3; i++){
            if(s.charAt(i)=='1'){
                n[i]="9";
            }
            else{
                n[i]="1";
            }
        }
        System.out.println(n[0]+n[1]+n[2]);
        sc.close();
    }
}