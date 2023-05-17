public class func{
public void earliestObs_shouldReturnTheFirstObsGivenThePassedConcepUuid(){
        Obs earliestWeight = functions.earliestObs("c607c80f-1ea9-4da3-bb88-6276ce8868dd");
        Assert.assertEquals(50, earliestWeight.getValueNumeric().intValue());
        Assert.assertTrue("Obs datetime not correct", (StringUtils.equals("2008-08-01", df.format(earliestWeight.getObsDatetime()))
                || StringUtils.equals("2008-07-01", df.format(earliestWeight.getObsDatetime()))));
}
}
