public class func{
public void testMergeTranslationWorkSameStateAndContent(){
        Calendar c = new GregorianCalendar();
            generateTarget(ContentState.Translated, c.getTime(), content);
        c.add(Calendar.DATE, 30);
            generateTarget(ContentState.Translated, c.getTime(), content);
        testShouldMergeCondition(target1, target2, false, false);
}
}
