//31
public class func{
public void earliestObs_shouldReturnTheFirstObsGivenThePassedConceptId(){
        Obs earliestWeight = functions.earliestObs(5089);
        Assert.assertEquals(50, earliestWeight.getValueNumeric().intValue());
        Assert.assertTrue("Obs datetime not correct", (StringUtils.equals("2008-08-01", df.format(earliestWeight.getObsDatetime()))
                || StringUtils.equals("2008-07-01", df.format(earliestWeight.getObsDatetime()))));
}
}
