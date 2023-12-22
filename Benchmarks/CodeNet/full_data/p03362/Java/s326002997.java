import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//つまり　2は素数だが、2+奇数だと、ワンチャン素数で割り切れない（合成数ではない）為、アウト
public class Main{

	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int kosu=0;
		int counter=0;

		int[] sosu=new int[55];
		sosu[0]=3;
		sosu[1]=5;
		sosu[2]=7;
		sosu[3]=11;
		sosu[4]=13;
		sosu[5]=17;
		sosu[6]=19;
		sosu[7]=23;
		sosu[8]=29;
		sosu[9]=31;
		sosu[10]=37;
		sosu[11]=41;
		sosu[12]=43;
		sosu[13]=47;
		sosu[14]=53;
		sosu[15]=61;
		sosu[16]=67;
		sosu[17]=71;
		sosu[18]=73;
		sosu[19]=79;
		sosu[20]=83;
		sosu[21]=89;
		sosu[22]=97;
		sosu[23]=101;
		sosu[24]=103;
		sosu[25]=107;
		sosu[26]=109;
		sosu[27]=113;
		sosu[28]=137;
		sosu[29]=139;
		sosu[30]=149;
		sosu[31]=151;
		sosu[32]=157;
		sosu[33]=163;
		sosu[34]=167;
		sosu[35]=173;
		sosu[36]=179;
		sosu[37]=181;
		sosu[38]=191;
		sosu[39]=193;
		sosu[40]=197;
		sosu[41]=199;
		sosu[42]=211;
		sosu[43]=223;
		sosu[44]=227;
		sosu[45]=229;
		sosu[46]=233;
		sosu[47]=227;
		sosu[48]=229;
		sosu[49]=233;
		sosu[50]=239;
		sosu[51]=241;
		sosu[52]=251;
		sosu[53]=257;
		sosu[54]=263;

		try {
			str=bfr.readLine();

			if(str.equals("")) {

			}
			else {
				kosu=Integer.parseInt(str);
				//int[] matomari=new int[kosu];
				String mojirt="";
				for(int i=0; i<55-kosu; i++) {
					mojirt=mojirt+sosu[i]+" ";
				}

				System.out.println(mojirt);
			}
		}catch(IOException e) {

		}

		catch(NumberFormatException ee) {
			System.exit(0);
		}

		catch(NullPointerException eee) {
			System.exit(0);
		}



	}
}