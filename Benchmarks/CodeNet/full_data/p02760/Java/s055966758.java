import java.util.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final int TOTAL_NUM = 13;

    private static final String HEART = "H";
    private static final String DIAMOND = "D";
    private static final String SPADE = "S";
    private static final String CLUB = "C";

    private static Set mapCardHeart = new LinkedHashSet();
    private static Set mapCardDiamond = new LinkedHashSet();
    private static Set mapCardSpade = new LinkedHashSet();
    private static Set mapCardClub = new LinkedHashSet();

    // Mapだと上書きされちゃう！！
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int iCardNum = Integer.parseInt(sc.next());
        readCard(iCardNum);
        output();
    }

    private static void readCard(final int iCardNum) {
        final Scanner sc = new Scanner(System.in);
        for (int i = 0; i < iCardNum; i++) {
            final String sCardType = sc.next();
            final int iCardVal = Integer.parseInt(sc.next());
            procSelectCardType(sCardType, iCardVal);
        }
    }

    private static String convOutput(final String sCardType, final int iCardVal) {
        final StringBuilder sb = new StringBuilder();
        sb.append(sCardType);
        sb.append(" ");
        sb.append(iCardVal);
        return sb.toString();
    }

    private final static void procSelectCardType(final String sCardType, final int iCardVal) {
        switch (sCardType) {
            case HEART:
                setHeart(iCardVal);
                break;

            case DIAMOND:
                setDiamond(iCardVal);
                break;

            case SPADE:
                setSpade(iCardVal);
                break;

            case CLUB:
                setClub(iCardVal);
                break;

            default:
                break;
        }
    }

    private static void output() {
        String sOut = "";
        if (!mapCardHeart.isEmpty()) {
            final int iNotCnt = TOTAL_NUM - mapCardHeart.size();
            sOut += convOutput(HEART, iNotCnt);
        }
        if (!mapCardDiamond.isEmpty()) {
            final int iNotCnt = TOTAL_NUM - mapCardDiamond.size();
            sOut += convOutput(DIAMOND, iNotCnt);
        }

        if (!mapCardSpade.isEmpty()) {
            final int iNotCnt = TOTAL_NUM - mapCardSpade.size();
            sOut += convOutput(SPADE, iNotCnt);
        }

        if (!mapCardClub.isEmpty()) {
            final int iNotCnt = TOTAL_NUM - mapCardClub.size();
            sOut += convOutput(CLUB, iNotCnt);
        }
        System.out.println(sOut);
    }

    private static void setHeart(final int iCardVal) {
        mapCardHeart.add(iCardVal);
    }

    private static void setDiamond(final int iCardVal) {
        mapCardDiamond.add(iCardVal)
    }

    private static void setSpade(final int iCardVal) {
        mapCardSpade.add(iCardVal);
    }

    private static void setClub(final int iCardVal) {
        mapCardClub.add(iCardVal);
    }

}