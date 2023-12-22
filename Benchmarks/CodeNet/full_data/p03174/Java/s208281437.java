// No sorceries shall previal. //         
import java.io.*;
import java.util.*;
public class Main {
	//Variables
	static long mod = 1000000007;
	static long mod2 = 998244353;	
	static FastReader inp= new FastReader();
	static PrintWriter out= new PrintWriter(System.out);	
	public static void main(String args[]) {		    	
	   	Main g=new Main();
	   	g.main();
	   	out.close();
	}	
	
	long dp[][];
	int n;
	int a[][];
	
	//Main
	void main() {
		
		n=inp.nextInt();
		a=new int[n][n];
		for(int i=0;i<n;i++) input(a[i],n);
		dp=new long[1<<n][n];
		for(int i=0;i<1<<n;i++) Arrays.fill(dp[i], -1);
		out.println(go(0,0));
		
	}
	
	long go(int mask, int w) { //w=womenNumber
		if(w==n) return 1;
		if(dp[mask][w]!=-1) return dp[mask][w];
		long gg=0;
		for(int j=0;j<n;j++) {
			if(a[w][j]==0) continue;
			if((mask&(1<<j))==0) {
				gg=(gg+go(mask+(1<<j),w+1))%mod;
			}
		}
		return dp[mask][w]=gg;
	}
	
	static class Pair implements Comparable<Pair> {
		long f, s;
		Pair () {}
		Pair (long l_, long r_) {
		    this.f = l_;
		    this.s = r_;
		}
		@Override
        public int compareTo(Pair other) {
        	if(this.f==other.f) {
        		return Long.compare(this.s,other.s);
        	}
			return Long.compare(this.f, other.f);
		}
    }

	static void print(long a[]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			out.print(a[i]+" ");
		}
	}
		
	/*********************************************************************************************************************************************************************************************************
	 * ti;.                               .:,:i:         :,;;itt;.        fDDEDDEEEEEEKEEEEEKEEEEEEEEEEEEEEEEE###WKKKKKKKKKKKKKKKKKKKKWWWWWWWWWWWWWWWWWWW#WWWWWKKKKKEE      :,:.    f::::. .,ijLGDDDDDDDEEEEEEE*
	 *ti;.                               .:,:i:          .:,;itt;:      GLDEEGEEEEEEEEEEEEEEEEEEDEEEEEEEEEEE#W#WEKKKKKKKKKKKKKKKKKKKKKKKWWWWWWWWWWWWWWWWWWWWWWKKKKKKG.     .::.      f:,...,ijLGDDDDDDDDEEEEEE *
	 *ti;.                               .:,:i:            :,;;iti,    :fDDEEEEEEEEEEEEEEEKEEEEDEEEEEEEEEEEW##WEEEKKKKKKKKKKKKKKKKKKKKKWWWWWWWWWWWWWWWWWWWWWWWKKKKKKEG     .::.       .f,::,ijLGDDDDDDDDEEEEEE *
	 *ti;.                               .:,:i:             .,,;iti;.  LDDEEEEEEEEEEKEEEEWEEEDDEEEEEEEEEEE#WWWEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKWWWWWWWWWWWWWWWWWWWKKKKKEDj    .::.        .:L;;ijfGDDDDDDDDDEEEEE *
	 *ti;.                               .:,:i:              .:,;;iii:LLDEEEEEEEEEEEKEEEEEEEEDEEEEEEEEEEEW#WWEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKWWKWWWWWWWWWWWWWWKKKKKKKEL    .::.         .:;LijLGGDDDDDDDDEEEEE *
	 *ti;.                               .:,:;:                :,;;ittfDEEEEEEEEEEEEEEEEKEEEGEEEEEEEEEEEKWWWEEEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKKWWWWWWWWWWWWWWWKKKKKKKELj   .::.          :,;jffGGDDDDDDDDDEEEE *
	 *ti;.                               .:,:i:                 .,;;tGGDEEEEEEEEEEEKEEEKEEEDEEEEEEEEEEEEWWWEEEEEEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKKWWWWWWKWWWWWWKKKKKKKEEL   .::.          .:;itDGGDDDDDDDDDEEEE *
	 *ti;.                               .:::;:                   :;ifDEEEEEEEEEEEEKEEEKEEEEEEEEEEEEEEEWWWEEEEEEEEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKW#WWWKKKKKKKKEEf   .::.           :,itfGEDDDDDDDDDDDEE *
	 *ti;.                               .:::;:                    :GGEEEEEEEEEEEKEKEEKEEEEEEEEEEEEEEEEWWEEEEEEEEEEEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKW#WKKKKKKKKKEEDG  .::.           .,;jfLGKDLDDDDDDEEDD *
	 *ti;.                               .:::;:                     fDEEEEEEKKKKKKKKKEKEEEEEEEEEEEEEEE#WEEEEEEEEEEEEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKW#KKKKKKKKKKEEf .:::.           .,;tfLGDEDDDDDDDDEEE *
	 *ti;.                                :::;:                    fDEEEEEEKKKKKKKKKKWKEEEEEEEEEEEEEEEWKEEEEEEEEEEEEEEEEEEEEKEKKKKKKKKKKKKKKKKKKKKKKKKKKKKW##KKKKKKKKKEEft :::.           .,;tfLGDDDKDDDDDDDDD *
	 *ti;.                                .::;:                    fDEEEEEEKKKKKKKWKKKKKEEEEEEEEEEEEE#WEEWEEEEEDEEDEEEEEEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKKKKW#WKKKKKKKKEEGG :,:.           .,;tfLGGDDDKDDDDDDDD *
	 *ti;.                                .:.;:                   tGDEEEEKKKKKKKKKKKKKKKKKEEEEEEEEEEEWEEKWEEEEEEEDEEEEEEEEEEEEEEKEKKKKKKKKKKKKKKKKKKKKKKKKKKWWWKKKKKKKEEDf :::.           .,;tfLGGDDDDEDDDDDDD *
	 *ti;.                                .::;:                   fDEEEEEKKKKKKKKKKKWKKKKKKKKEEEEEEEWWEEWEEEEEEEEEEEEEEEEEEEEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKW##KKKKKKKEEEft.::.           .,;tfLGGDDDDDDEDDDDD *
	 *ti;.                                .:.;:                  tGDEEEKKKKKKKKKKKKKKKKKKKKKKEKEEEEE#EEWWEEEEEEEEEEEEEEEEEEEEEEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKW#WKKKKKKEEEGD:::.           .,;tfLGGDDDDDDDEDDDD *
	 *ti;.                                .:.,.                  LDEEEEKKKKKKKKKKWKWKKKKKKKKKKKKEEEKWEKW#EEEEEEEEEEEEEEEEKEEEEEEEEEEEEEEEKKKKKKKKKKKKKKKKKKKKW##KKKKKKEEEEf,,:.           .,;tfLGGDDDDDDDDEDDD *
	 *ti;.                               ..:.,.                 LGDEEEEKKKKKKKKKKWKKKKKKKKKKKKKKKKKWEEW#WEEEEEEEEEEEEEEEKEEEEEEEEEEEEEEEEEEEKEKKKKKKKKKKKKKKKK##KKKKKEEEEEfi;,.           .,;tfLGGDDDDDDDDDKDD *
	 *tt;.                                .:.,:                 jDEEEEKKKKKKKKKKWWKKKKKKKKKKKKKKKKKWKE#WWEEEEEEEEEEEEEEWEEEEEEEEEEEEEEEEEEEEEEEKKKKKKKKKKKKKKKKWWKKKKEEEEDfG;,:           .,;tfLGGDDDDDDDDDDKD *
	 *tii,.                               .:.,.                tGDEEEEKKKKKKKKKKWWWKKKKKKKKKKKKKKKWKKWWWKEEEEEEEEEEEEEKEEEEEEEEEEEEEEEEEEEEEEEEEEEEEKKKKKKKKKKKW#KKKKEEEEDGGi;,.          .,;tfLGGDDDDDDDDDDDE *
	 *ti;;,:.                             .:.,:                fDEEEEKKKKKKKKKKKWKKKKKKKKKKKKKKKKKWEK#WWKEEEEEEEEEEEEDEEEEEEEEEEEEEEGEEEEEEEEEEEEEEEEEEEKKKKKKKWWKKEEEEEEDDf;;;,.         .,;tfLGGDDDDDDDDDDDD *
	 *tii;,,:..                           ...,.               ;LEEEEEKKKKKKWKKKKWKKKKKKKKKKKKKKKKKEKKW#WEEEEEEEEEEEEEjEEEEEEEEEKEEEEGEEEEEEEEEKEEEEEEEEEEEEEEEEE#WKEEEEEEDDf;;;;,:        .,itfLGGDDDDDDDDDDDD *
	 *ti;,,,,,:.                          ...,.               LDEEEEKKKKKKKKKKKWWWKKKKKKKKKKKKKKKWKK#W#WEEEEEEEEEEEDDLEEEEEEEEEWEEEEDEEEEEEEEEKEEEEEEEEEEEEEEEEEWWEEEEEEEDDfj,,,,,:.      .,itfGGGDDDDDDDDDDDD *
	 *tii,,,,::::.                        ...,:              .fDEEEEKKKKKKWKKKKWWWKKKKKKKKKKKKKKKEKKW#WWEEEEEEEEEEEKiKEEKEEEEEEWEEEEDEEEEEEEEEEEEEEEEEEEEEEEEEEEWWEEEEEEEDDLD:::,,,:.     .,ijfGGGDDDDDDDDDDDD *
	 *ti;:::::::::..                      .:.,:              LDEEEEKKKKKKKWKKKKWWKKKKKKKKKKKKKKKKtKKWWWWKEEEEEEEEEDiiDEEEEEEEEWWEEEEEEDEEEEEEEEEEEEEEEEEEEEEEEEEEWKEEEEEDDDGL:. .:,,,:    .,ijLGGGDDDDDDDDDDDD *
	 *tt;. .::::::::..                    ...,:             :fDEEEKKKKKKKKKKKKWW#KKKKKKKKKKKKKKKKfKKWWWWKEEEEEEEEDti,DEKEEEEEEWWEEEDEEEEEEEEEKEEEEEEEEEEEEEDEEEEE#WEEEEEGGDGf:.  .:,;,:.  .,ijLGGDDDDDDDDDDDDD *
	 *tt;.   .:::::::..                   ...,:             GDEEEKKKKKKKKWKKKKWWWKKKWKKKKKKKWWWKDEKLWWWWKKEEEEEEDEi,LDEEEEEEEEWWEEEEEEEEEEEEEEEEEEEEEEEEEDEDEEEEEW#EEEEDDDDGf,.    :,,,:...,ijLGGGDDDDDDDDDDDD *
	 *tt;.    .....::::..                 ...,:             fDEEEKKKKKKKKWKKKKWWWWKKKWKKKKKKKKKKfWKiWWW#KKEEEEEEEi;.EDfEEEDEEiWWEEEEEEEEEEEEDGKEEEEEEEEEEDEEEEEEEWWEEEEDDDGGLi.     .,;,:::,ijLGGGDDDDDDDDDDDD *
	 *tt;.      ....:::::.                ...,.            iDEEEEKKKKKKKKWKKWKWWWWWKKWWWKKKKKKKKtWKt#WWWKKEEEEEDji..DDKDDEDEGiWKEEEEEEEEEEDDEjEEEEEEEEEEEDEEEEEEEKWKEEDDDDGGff.      .:,;,,;ijLGGGDDDDDDDDDDDD *
	 *tt;.        ....::::..              .:.,:           .LDEEEKKKKKKKKKKKKWWWWKWWWWWWWWWWKKKKWtKKiDWWWKKKEEEEKi:..DEDDDDDDiiWKEEEEEEEEEEDDEijDEEEEEKEEEEEEEEEEEEWWEEGDDDGGLG.       .:,;;iijLGGGDDDDDDDDDDDD *
	 *tt;.          .....:::..            ...,.           .fEEEEKKKKKKKKWKKKKWWWWWWWWWWWWWWKWKKKiKDiLWWWWKEEEEEi,..fD:DDDDDti;WEEEEEEEEEEKDDi:iDDEEEEWEEEEEEEEEEEE#WEEGDDDDGGG.         :,iitjLGGGDDDDDDDDDDDD *
	 *tti.            .....:::..          ...,.           GDEEEKKKKKKKKKWKKKWWW#WWWWWWWWWWWKWKKjiEjitWWWKKWEEEDi...DDLDDDDji;;WEEEEEEEEEEEDEj.iDDEEEEWEEEEEEEEEEEEWWEEDDDDDDGf.          .,;tjfLGGDDDDDDDDDDDD *
	 *tti.              ....::::..        ...,.           fEEEKKKKKKKKKKKKKKKW#WWWWWWWWWWWWWWWWtiEiiiWWWKKEWKEi....D.EDDDEi;.fWEEEEEEEEEEDDfL.;EDDEEEWEEEEEEEEEEEEWWEEEDDDDDGf.           :;ijfLGGDDDDDDDDDDDD *
	 *tti.                ....::::..      ...,.          LDEEEKKKKKKKKKKKKKKWWWWWWWWWWWWWWWW####WKiiiWWWKKKEEK,...:E:DDDEii..GWEEEEEEEEDWDDiL.,KDDEEEWEEEEEEEEEEEEWWKEEDDDDDGf:           .,itfLGGDDDDDDDDDDDD *
	 *tti.                 .....:::..     ...,.          fDEEEKKKKKKKKKWKKKKWWWWWWWWWWWWW########WLiiWWWKKKEEjD...G,DDDDi;...EWEEEEEEEEDKDEii..LDDEEEWEEEEEEEEEEEEWWWEEDDDDDGfi           .,;tfLGGGDDDDDDDDDDD *
	 *tti.                   .....:::..   ...,.         iGEEEKKKKKKKKKKWKKKKWWWWWWWWWWWW###########KiWWWKKEEE,.D..D.DDDii:...KKEEEEEEEEEDDj:...tEDEEEWEEEEEEEEEEEEWWWEEEDDDDDLL           .,;tjLLGGDDDDDDDDDDD *
	 *tti.                     ....::::......:.         LEEEKKKKKKKKKKWWKKKWWW#KWWWWWWWW#####W####W##KWWKKEEL..:D.jjDDi;,....KKEEEEEEEDfDDi...:iKDEEEWKEEEEEEEEEEEWWWEEEEDDDDLG           .,;tjLLGGDDDDDDDDDDD *
	 *tti.                        ...::::::..,.        :GEEEKKKKKKKKKKKKWWWWW##WWWWWWWWW##WKWK#W#W####WWKEEK.....G.DDti,.....KKEEEEEEDWGDf.,...iKDEEEWWEEEEEEEEEEEW#WEEEEEDDDGL           .,;tjLLGGDDDDDDDDDDD *
	 *tti.                         ....::::::,.        GDEEKKKKKKKKKKKKKWWWW###WWWWWWWWWW#WWWK###W#####WKEKK.....jDDL;;......KKEEEEEEEEEDi.f...;KDEEEWWEEEEEEEEEEEWWWWEEEEEDDGf           .,;tjLLGGDDDDDDDDDDD *
	 *tti.                           ....:::,,.       .LEEEKKKKKWKKKKKWWWWWW###WWWWWWWWWW#WWKW#WW##W#WWWKEKD:....:DD:;......;KEEEEEEEKiDD..f...,KKEEEWWEEEEEEEEEEEWWWWEEEEEDDDf           .:;tjLLGGGDDDDDDDDDD *
	 *tti.                             ...::,,,:.     GDEEKKKKKKKKKKKKWWWWWWW#WWWWWWWWWWW#KjKWWWWWWWWWWWWEK.j,..;fD.;.......fKEEEEEDKG:Di..,....DKEEEWWEEEEEEKEKKKWWWWEEEEEEDDf           .:;tjLLGGDDDDDDDDDDD *
	 *jti.                              ...::,,,,:.  .fEEEKKKKKWKKKKKKWWWWWWW#WWWWWWWWWWK#KKKWWWWWWWWWWWWWK..f:.:G.,:.......EKEEEEEKK;:E:.......fKEEEWWKEKEKKKKKKKW#WWEEEEEEDDf:          .,;tfLLGGDDDDDDDDDDD *
	 *tti.                               ...:,,,;;,: iDEEKKKKKWKKKKKKKWWWWWWW#WWWWWWWWWWK#WDKWWKKWWWWWWWWWE..;G:G..,........KKEEEEEKi.Gi..:.....tKEEKWWWKKKKKKKKKKW##WKEEEEEEDfi          .,;tfLLGGGDDDDDDDDDD *
	 *tti.                               ....::,,;;;,LEEKKKKKKWKKKKKWWWWWWW###WWWWWWWWWWKWWDKWEEEWKKWWWWWKKj.:LG..;.........EKEEEEKG;.G...;.....;KKEKWWWKKKKKKKKKKW##WWKEEEEEDfL          .,;tfLGGGDDDDDDDDDDD *
	 *jti.                                ...::::,;ijDEEKKKKKWKKKKKKWKWWWWW##WWWWWWWWWWWKK#KKGDGDWEEWKKWKKGE,.i;.:.........:EKEEEKE;.:L...j.....,KWEKWWWKKKKKKKKKK####WKKEEEEDLG          .,;tfLGGGGDDDDDDDDDD *
	 *jti.                                ...:...,,;GEEKKKKKWWKKKKKWWWWWWWW###WWWWWWWWWKKKWWKiLGGEDEDEKGKKiEG..;...........jKEEEKK;:.G....,.....:KKEWWWWKKKKKKKWKK####WKKKKEEEGL          .,;tfLGGGGDDDDDDDDDD *
	 *jti.                                ...:.  .:,GEEKKKKKWKKKKKWWWWWWWW####WWWWWWWWWKKKWWKii;fDLGDK: EEi:E:.............EKEEKK;;..L...........KKKWWWWKKKKKKKWKK####WKKKWKEEDf          .,;tfGGGGDDDDDDDDDDD *
	 *jti.                                ...:.    ,EEKKKKKWWKKKKKWWWWWWWWW###WWWWWWWWKKKKfWWLt;i,. fi  EG..D:.............EKEKK;;..t....:.......KWKWWWWKKKKKKKWKK####WKKKWEEEDf:.        .,;tfGGGGDDDDDDDDDDD *
	 *jti.                                ...:.    GEEKKKKKWKKKKKWWWWWWWWW####WWWWWWWKKKKKt;KKEfff     .;t.................KKKKi;:..GtGGfG.......KWWWWWWKKKKKKKWKK###WWWKKKKEEEf,,:       .,;tfGGGGDDDDDDDDDDD *
	 *jti.                                ...:.    GEKKKKKWWKKKKKWWWWWWWWWW##WWWWWWWKKKKKKt;EiKKKK,   ...t................jEKKG;;..,.....,LGi....KWWWWWWKKKKKKWKKKW####WKKKKKEEL,,,:.     .,;tfGGGDDDDDDDDDDDD *
	 *jti.                                ...:.  .GEEKKKKKWKKKKKWWWWWWWWWW###WWWWWWWKKKKKKtiE::tGG........................EEEj;;...,.........:D..DKWWWWWWKKKKK#KKW###W#WKKKKKEEfj:,,,:.   .,;tfGGGDDDDDDDDDDDD *
	 *jti.                                ...:.   DEKKKKKWWKKKKKWWWWWWWWW####WWWWWWWKKKKKKiiE:::.::.......................EEi;;...j.....f......:iDKWWWWWWKKKKK#WW######WKKKKKEELG :,,,,:. .,;tfGGGDDDDDDDDDDDD *
	 *jti.                                ...:.  fEEKKKKWWKKKKWWWWWWWWWWW###WWWWWWWWKKKKKK;tE::..........................DD;.;,.::......;........EWWWWWWWKKKKW#WW#####WWKKKWKKELG  .:,,,:::,;tfGGGDDDDDDDDDDDD *
	 *jti.                                ...:. .DEKEKKKWWKKKKWWWWWWWWWWW###WWWWWWWWKKKKKE,iD::..........................D..,;.,;tLffi...........DWDWWWW#KKKWWWWW#####W#KKKWKEEGL    .:,;,,,;tfGGGDDDDDDDDDDDD *
	 *jti.                                ...:. ;EEKKKKWWKKKKKWWWWWW#WWWW####WWWWWWKKKKKEL:iD:..........................j ..;..;;:.....i,........DKtWWWWWKKWWWWWW#####WWWKKKEKEDf     .:,;;;itfGGGDDDDDDDDDDDD *
	 *jti.                                ...:. DEKKKKKWWKKKKWWWWWWW#WWWW####WWWWWWKKKKKEj:iG...............................:....................GKiWWWWWKKWW#WWW######WWKKKKKEEf       .,;iitfGGGDDDDDDDDDDDD *
	 *jti.                                ...:.:EKKKKKWWKKKKKWWWWWWW#WWW#####WWWWWKWKKKKEi:if:.................................iEKEKKKKKKDj......DKiWWWWWKWK##WW#######WWKKK:KEEL        .:;itfGGGDDDDDDDDDDDD *
	 *jji.                                ...:,DEEKKKWWWKWKKWWWWWWWWWWWW#####WWWWWWWKKKKEi:it..................................j.  KKKKKKKKKKKf..DKiWWWWWKWW##WW#######WWKKK,KEEf         .,;tfGGGDDDDDDDDDDDD *
	 *jji.                                ..L:iDEEKKKWWKKKKKWWWWWWWWWWWW#####WWWWWKWKKKKKi.i;..................................  . KKKWWWWWWWWK..DGiWWWWWKK##WWW#####W#WWKKKjEKEL,        .:;tfGGGDDDDDDDDDDDD *
	 *jji.                               .f:::EEEKKKWWWKKKKKWWWWWWWWWWWW#####WWWWWKWKKKKK;.i,.................................::  KKEKWWWWWWfWK..EiiWWWWWKWW#WW##########KKKD,KELj        .:;tfGGDDDDDDDDDDDDD *
	 *jji.                             .t::::,DEEKKKWWKKKKWWWWWWWWW#WWWW#####WWWWKKWKKKEK;.i:.................................GDDEEEKKKWWWWWtWWD.E;iWWWWWW###WW#########WWKKK.EEDG        .:;tfGGGDDDDDDDDDDDD *
	 *jji.                          . j..::::EKEKKKWWWKKKKWWWWWWWWW#WWW######WWWWKKWKKKEK;.t:.................................ELLEDDEEEWWWWEtWK,.KiiWWWWWW###W##########WWKKK:EEEG     .;tjfLLGDDDDDDDDDDDDDDD *
	 *jji.                          i.::::::,EEEKKWWWKKKKKWWWWWWWWW#WWW#####WWWWWKWKKKKEE,.t..................................DfiEGDDDEEKKKttKWG.KiiWWWWW##WWW##########WWKKK:fEEL  ,fGGGDDDDDDDDEEEDDDDDDDDDD *
	 *jji.                        .;:..:::::DEEEKKWWWKKKKKWWWWWWWWW#WWWW####WWWWWWWKKKKED,.t..................................ifjDDGGEGDKK.ttKKE.DiWWWWW###WW##########WWWKKK:.KELiLGGGGDDDDDDDDDDDDEEEDDDDDDD *
	 *jji.                       i.:.::::::,KEEKKWWWKKKKKKWWWWWWWWW#WWWW####WWWWWWWKKKKEL:.j..................................GGf,;ifLLED .iiKKi:fWWWWWW##W#W##########WWWKKK:.KKLGGDDDDDDDDDDDDDDDDEDDEEDDDDD *
	 *jji.                     .j:.::::::::EEEKKKWWWKKKKKKWWWWWWWW##WWW#####WWWWWWWKKKKKf:.f..................................:EEfftf .,. ;iE,..jWWWWWWW###W############WWKKK,:KKGDDDDDDDDDDDDDDDDDDDDDDDEDDDD *
	 *jji.                    .:.::::::::,,EEEKKWWWKKKKKKKWWWWWWWW##WWW#####WWWWWWWKKKKKt..G....................................EEELL;   .j....tKWWWWWWW################WWWKKtfGKGEDDDDDDDDDDDDDDDDDDDDDDDEEDD *
	 *jji.                   :...:::::::,,jEEKKWWWWKKKKKKWWWWWWWWW##KWW#####KWWWWWWKKKKEi..D....................................:jEEE.........;KKWWWWWWWW#WW##W##########WWKKDLGKEKDDDDDDDDDDDDDDDDDDDDDDDDDED *
	 *jji.                  i:.::::::::,,,EEEKKWWWWKKKKKWWWWWWWWWW##WWW#####WWWWWWWKKKKKi..D......................................:::::......,KKKWWWWWWWWW#####W########WWWKKKGGKKEGGGGGGGGDDDDDDDDDDDDDDDDDDE *
	 *jji.                 i..:::::::::,,tEEKKWWWWKKKKKWWWWWWWWWWW##WW######WWWWWWWKKKKKi..D......................................::::......:EKKKWWWWWWWWWWW##WW########W#WKKWGGKKGGGGGGGGGGGGGGGDDDDDDDDDDDDD *
	 *jji.                .:::::::::::,,,EEEKKWWWWKKKKKWWWWWWWWWWW##WW#####WWWWWWWWKKKKKi..D....................................:::::::::..tELii;KWWWWWWWWWW##WW######WWWWWWKWGGGKGGGGGGGGGGGGGGGGGGGGGGGGGGDG *
	 *jjt.                :.::::::::,,,,fEEKKWWWWKKKKKKWWWWWWWWWW###WW####WWWWWWW#WKKKKKi..D....................................:::::::.:.,;;;;;;,KKWWWWWWWWW#WW########WWWKKWGGGKGGGGGGGGGGGGGGGGGGGGGGGGGGGG *
	 *jji.               ;.::::::::,,,,;EEEKWWWWWKKKKKWWWWWWWWWWWW##WW###WKWWWWWK#WKKKKKi..G......................................:::::::,;;;;:...KKKWWWWWWWWWKWW#######WWWWKKGLGKDGGGGGGLLGGGGGGGGGGGGGGGGGGG *
	 *jjt.              f.:::::::::,,,,fEEKKWWWWWKKKKKWWWWWWWWWWW###WW##WKKWWWWWW#WKKKKK;.jt........i.............................:::::::;j;;....:E.KKKWWWWWWWKWW#####W#WWWWKKLLGWEEGGGGGLGGGGGGGGGGGGGGGGGGGG *
	 *jjt.             ...:::::::,,,,,;DEEKWWWWWKKKKKWWWWWWWWWWWW####WWWKKKWWWWWWWWKKKKK;.E;.........t.............................:::::ii;;.....D...KKWWWWWWWKWW#####WWEWWWKKGGGEKKGGGGGLGGGGGGGGGGGGGLGGGGGG *
	 *fji.             ;.:::::::,,,,,;LEEKKWWWWWKKKKKWWWWWWWWWWWW####KWKKKKWWWWWWWWKKKKKi.D;..........j.............................:::tt;,.....:.....KKWWWWWWKWWWW##WWWGWWWKKGGGGKEGGGGGGGGGGGGGGGGGGGLLGGGGL *
	 *fji.            t::::::::,,,,,,;EEEKWWWWWKKKKKKKWWWWWWWWWWW##WKWKKKKKWWWWWWWWKKKKKi:D;............j...........................::LL;,.............KKWWWWWKWWWWWWWWWGWWWKKGGGGKGGGGGGGGGGGGGGGGGGGGLLGGGGL *
	 *fjt:            .:::::::,,,,,,,DEEKWWWWWWKKKKKKKWWWWWWWWWWWWKKWKKKKKKWWWWK#WWKKKKWitE;........... ............................:G;;:...............KKKWWKKWWWWWWWWWGWWWKKGGGGWGGGGGGGGGGGGGGGGGGGGGGGGGGL *
	 *fjji;:.       .f:::::::,,,,,,,;EEEKWWWWWWKKKKKKWWWWWWWWWWWKKKKKKKKKKKWWKWWWWWKKKKWGKD;........................................L;;..................DKKWKKWWWWWWWWWGWWWKKDGGGKDGGGGGGGGGGGGGGGGGGGGGGGGGG *
	 *fjjtii;,:.     :::::::,,,,,,,;EEEKWWWWWWKKKKKKWWWWWWWWWWKKKKKKKKKKKKWWWWWW#WWKKKKWiEj;......................................:i,;....,...............;KKEKWWWWWWWWWGKWWKKDDGGDEGGGDGGGGGDGGGGGGGGGGGGGGGG *
	 *fjtiiiii;;:.  j::::::,,,,,,,;;EEEKWWWWW#KKKKKWWWWWWWWWKKKKKKWKKKKKKKWWWWWWWWWKKKKWtEL;:....................................;;;:...,;j................:KEEWWWWWWWWWDDWWKKDDDDDKDDDDDDDDDDDDDDDGGGGGGGGGGG *
	 *fjti;;iiii;;,:::::::,,,,,,,,;EEEKWWWWWWWKKKKWWWWWWWWKKKKKKKWKKKKKKKWWWWWWW#W#KKKKWEEii;...................................f;:....,;L...................EEKWWWWWWWWDDWWKKDDDDDKEDDDDDDDDDDDDDDDDDDDDDGGGG *
	 *fjt,,,;;;;ii;f::::::,,,,,,,;;EEKWWWWWWWKKKKKWWWKWWKKKKKKKKKKKKKKKKKWWWWWWW#W#KKKKWKEij;:...............................:G;,.....,;f....................:tKKWWWWWWWDDWWKKDDDDDKKDDDDDDDDDDDDDDDDDDDDDDDDD *
	 *jjt. ..:,;;;;,::::,,,,,,,,;;GEEWWWWWWWWKKKKWKKWKKKKKKKKKKKKKKKKKKKKWWWWWWW#W#KKKKWEDi;j;............................,Li;L;;;..,;;f........................KKKKWWWKDDWWKKDDDGDKKGGGGGGGGDGDDDDDDDDDDDDDDD *
	 *fjt.    .:,,,:::::,,,,,,,;;;EEKWWWWWWWKKKKKKWKKKKKKKKKKKKKKKKKKKKKWKKKWKW##W#KKKKWEti;;G;........................tEEEL;;;;;;;;;;L..........................DKKKKKEDDWWKEDGftiLE;;;;itjLGGGGGGDDDDDDDDDDD *
	 *fjt.       .j::::,,,,,,,;;;DEEWWWWWWWWKKKKWKKKKKKKKKKKKKKKKKKKKKKKWKKWWWK##W#KKKKKEii;;;L;...................iDEEEEEEKKi;j;;;;jD.....:......................,KKKKDGGEKKE:::::;E::::::::::,tLGGDDDDDDDDDD *
	 *fjt.       .;:::,,,,,,,;;;;EEKWWWWWWWWKWKKKKKKKKKKKKKKKWKKKKKKKKKKWKKWWWW#WW#KKKKKKii;;;;f;.............:tDEEEEEKKKKKKKKEti;;;L...............................EEKf;:iKKE::::::E::::::::::::::ifDDDDDDDDD *
	 *fjt:        :::,,,,,,,,;;;DEEWWWWWWWWWEKKKKKKKKKKKKKKKKKKKKKKKKKKWWKKWWWW####KKKKKEiii;;;;f,.........iDEEEEKKKKKKKKKKKKKKKf;iG......i..........................fK::::KKE::::::E::::::::::::::::,tGGDDDDD *
	 *fjt:       t:::,,,,,,;;;;iDEKWWWWWWKEKKKKKKKKKKKKKKKKKKKKKKKKKKKKWWKKWWWW####WKKKKLiii;;;;;L,....,Li;EDEEEEKKKKKKKKKKKKKKKKiG......;:...........................:i:::KKE:::::,E,::::::::::::::::::iGDDDD *
	 *jjt.       f::,,,,,,,;;;;GEEWWWWKEEKEKKKKKKKKKKKKKKKKWKKKKKKKKKKKWWKWWWWW###WWKKKKiii;;;;;;;G,;L;;iiEEEEEEEKKKKKKKKKKKKKWWKE......;t.........:....................j::KEE:,::,,D,,::::,,,,,,:::::::::tDDD *
	 *fjt:.      ,::,,,,,,,;;;;EEWWKEEEEEEKKKKKKKKKKKKKKKKWKKKKKKKKKKKWWKKWWWWW#W#KKKKKKiiiiii;;;;;i;;iiiEEKEEKKWKKKKKKKWKKKKKWWWGi;...;t......,;;;;,....................:,EEE,,,,,,D,,,,,,,,,,,,,,,,::,::::tG *
	 *fjt:.     ,::,,,,,,,;;;;DEKEEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKKKKKWWWWWWWWW#W#KKKKKKiiiii;;i;;;;;iiiKKKEKKKKWWKWWWWWWKKKKWWWWW;;;:;L.....;;;;;;;;;....................,KEE,,,,,,E,,,,,,,,,,,,,,,,,,,,,,,,; *
	 *fjt:.     f:,,,,,,,;;;;jEDEEEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKKKKKWWWWWWWW#W##KKKKKKiiiiiiii;i;;iiiEKKKKKKKKWKWWWWWWWWKKKWWWWWKi;;i.....,jEEfGi;;;;;...................EED,,,,,,E,,,,,,,,,,,,,,,,,,,,,,,,, *
	 *fjt:.    .f::,,,,,,;;jEEDEEEEEEEEEEKKKKKKKKKKKKKKKWKKKKKKKKKKKKKWWWKWWWWW###KKKKKLiiiiiiiiiiiiiiEEKKKKKKKKWWWWWWWWWWWWKWWWWWWGi;i;,..;jDDDKEGi;;;;;;:................EED,,,,,,D,,,,,,,,,,,,,,,,,,,,,,,,, *
	 *fjt:.  .. ;::,,,,,;;EDDEEEEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKWWKKW#WW####KWKKKiiiiiiiiiiiiijKKKKKKKKKKWWWWWWWWWWWWWWWWWWWWWt;i;;;;i;DDDDDDGi;;;;;;;;:.............EDf;,,,;,G;;;;;;;;;;;;;;;,,,,,,,,,, *
	 *fjt:......:,,,,,,;LDDDEEEEEEEEEEEKKKKKKKKKKKKKKKKWKKKKKKKKKKKKKWWWWKWWWW####KKKKKiiiiiiiiiiijKEKKWKKKKKKKWWWWWWWWWWWWWWWWWWWWWWiLiii;i;DEEEEDDE;i;;;;;;;;;:..........EDi,;;;;;L;;;;;;;;;;;;;;;;;;,,,,,,, *
	 *fjt:......:,,,,,;EDDDEEKEEEEEEEEEKKKKKKKKKKKKKKKWKKKKKKKKKKKKKKWWWWKKWWW##W#KWKKWEiiiiiijGKKKKKWWKKKKKKKKWWWWWWWWWWWWWWWWWWWWWWKi;iiiiDDEEEEEEDEi;;;;;;;;;;;;;,:.....ED;;;;;;;j;;;;;;;;;;;;;;;;;;;;;;;,, *
	 *fjt:.....t,,,,,;DDDDEEEKEEEEEEEEKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKWWWKKKWWWW##WKWKKWKiiiKKKKKKKKKWWKKKKKKKKWWWWWWWWWWWWWWW#WWWWWWWWWiiiiifLEEEEEEEEDi;i;;;;;;;;;;;;.....DD;;;;;;;i;;;;;;;;;;;;;;;;;;;;;;;;; *
	 *fjt:.....G,,,,,GDDDEEEEEEEEEEEEKKKKKKKKKKKKKKKKWKKKKKKKKKKKKKKKWWWKKKWWW###WKWKKWKitKKKKKKKKKWKKKKKKKKKKWWWWWWWWWWWWWW###WWWWWWWWEiiiiiiiEEEEEEEEDGiiii;;;;;;;;;.....GD;;;;;;;i;;;;;;;;;;;;;;;;;;;;;;;;; *
	 *fjt:.....L,,,,;GDDDEEEEEEEEEEKEKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKWWWWWDGWWW###KKWWKWKKKKKKKKKKKKKKKKKKKKKKKWWWWWWWWWWWWW####WWWWWWWWWiiiiiiiiEEEEEEEEEEDi;i;;;;;;;;.....Lj;;;;;;i;iiiiii;;;;;;ii;;;;;;;;;;; *
	 ***********************************************************************************************************************************************************************************************************/
	
	public class DSU {
        int n;
        int parent[];
        int totalSets;
        DSU(int n){
            this.n=n;
            parent=new int[n];
            for(int i=0;i<n;i++)parent[i]=i;
            totalSets=n;
        }
        int find(int i){
            int x=parent[i];
            if(x==i) return x;
            return parent[i]=find(x);
        }
        boolean union(int a, int b){
            int pa=find(a);
            int pb=find(b);
            if(pa==pb) return false;
            parent[pa]=pb;
            totalSets--;
            return true;
        }
    }
	
	class SegTree {
		int n;
		int seg[];
		SegTree(int n){
			this.n=n;
			seg=new int[4*n];
		}
		void build(int x,int lx, int rx) {
			if(lx==rx) {
				seg[x]=0;
				return;
			}
			int mid=lx+rx>>1;
			build(2*x,lx,mid);
			build(2*x+1,mid+1,rx);
			seg[x]=merge(seg[2*x],seg[2*x+1]);
		}
		void set(int i) {
			set(i,1,0,n-1);
		}
		void set(int i, int x, int lx, int rx) {
			if(lx==rx) {
				seg[x]=1;
				return;
			}
			int mid=lx+rx>>1;
			if(i<=mid) set(i,2*x,lx,mid);
			else set(i,2*x+1,mid+1,rx);
			seg[x]=merge(seg[2*x],seg[2*x+1]);
		}
		int merge(int x, int y) {
			return x+y;
		}
		int query(int l, int r) {
			return query(l,r,1,0,n-1);
		}
		int query(int l, int r, int x, int lx, int rx) {
			if(l<=lx && r>=rx) return seg[x];
			if(l>rx || r<lx) return 0;
			int mid=lx+rx>>1;
			return merge(query(l,r,2*x,lx,mid),query(l,r,2*x+1,mid+1,rx));
		}
		
	}
		
	    static class Segment implements Comparable<Segment> {
			int l, r, initialIndex;
			Segment () {}
			Segment (int l_, int r_, int d_) {
			    this.l = l_;
			    this.r = r_;
			    this.initialIndex = d_;
			}
			@Override
			public int compareTo(Segment o) {
			    return l - o.l;
			}
	    }
	    
	    static class FastReader { 
	        BufferedReader br; 
	        StringTokenizer st; 
	  
	        public FastReader() { 
	            br = new BufferedReader(new InputStreamReader(System.in)); 
	        } 
	        String next() { 
	            while (st==null || !st.hasMoreElements()) { 
	                try { 
	                    st = new StringTokenizer(br.readLine()); 
	                } 
	                catch (IOException  e) { 
	                    e.printStackTrace(); 
	                } 
	            } 
	            return st.nextToken(); 
	        } 
	        int nextInt() { 
	            return Integer.parseInt(next()); 
	        } 
	        long nextLong() { 
	            return Long.parseLong(next()); 
	        } 
	        double nextDouble() { 
	            return Double.parseDouble(next()); 
	        } 
	        String nextLine() { 
	            String s=""; 
	            try { 
	                s=br.readLine(); 
	            } 
	            catch (IOException e) { 
	                e.printStackTrace(); 
	            } 
	            return s; 
	        } 
	    } 
	    
		//merge-sort
		public static void sort(long arr[], int start, int end) { 		
				if(start>=end)
					return;		
				int mid=(start+end)/2;
				sort(arr,start,mid);
				sort(arr,mid+1,end);
				merge(arr,start,mid,end);	
		}	
		private static void merge(long arr[], int start, int mid, int end) {		
				int i, j=mid+1,c=0;
				long temp[]= new long[end-start+1];
				for(i=start;i<=mid && j<=end;c++) {
					if(arr[i]<=arr[j]) {
						temp[c]=arr[i];
						i++;
					}
					else {
						temp[c]=arr[j];
						j++;
					}
				}
				while(i<=mid) temp[c++]=arr[i++];
				while(j<=end) temp[c++]=arr[j++];
				c=0;
				while(start<=end) arr[start++]=temp[c++];
		}
		
		void reverse(long[] A,int l,int r) {
	        int i=l,j=r-1;
	        while(i<j) {
	            long t=A[i];
	            A[i]=A[j];
	            A[j]=t;
	            i++;j--;
	        }
	    }
	    void reverse(int[] A,int l,int r) {
	        int i=l,j=r-1;
	        while(i<j) {
	            int t=A[i];
	            A[i]=A[j];
	            A[j]=t;
	            i++;j--;
	        }
	    }
	    
	    // Input arrays
		static void input(long a[], int n) {
			for(int i=0;i<n;i++) {
				a[i]=inp.nextLong();
			}
		}
		static void input(int a[], int n) {
			for(int i=0;i<n;i++) {
				a[i]=inp.nextInt();
			}
		}	
		static void input(String s[],int n) {
			for(int i=0;i<n;i++) {
				s[i]=inp.next();
			}
		}
		
}
