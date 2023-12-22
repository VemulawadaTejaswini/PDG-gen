public class test {

 

    /**
     * @param args
     */
    public static void main(final String[] args) {

 

        final String aStr = args[0];

 

        /** 不一致件数カウント */
        int aCount = 0;
        /** インクリメント変数 */
        int aI = 0;

 

        while (aI * 2 < aStr.length()) {

 

            if (aStr.charAt(aI) == aStr.charAt(aStr.length() - aI - 1)) {
                // 何もしない
            } else {
                aCount++;
            }

 

            aI++;
        }

 

        System.out.println(aCount);
    }
}