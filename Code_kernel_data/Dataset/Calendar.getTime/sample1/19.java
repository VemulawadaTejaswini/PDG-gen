//18
public class func{
	public void testMergeTranslationWorkCheckDate2(){
        Calendar c = new GregorianCalendar();
                generateTarget(ContentState.Translated, c.getTime(), "string1");
        c.add(Calendar.DATE, 30);
                generateTarget(ContentState.Translated, c.getTime(), "string2");
        testShouldMergeCondition(target1, target2, true, false);
}
}
