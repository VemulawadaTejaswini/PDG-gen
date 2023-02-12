public class func{
public void latestObs_shouldReturnTheMostRecentObsGivenThePassedConceptUuid(){
        Obs earliestWeight = functions.latestObs("c607c80f-1ea9-4da3-bb88-6276ce8868dd");
        Assert.assertEquals(61, earliestWeight.getValueNumeric().intValue());
        Assert.assertEquals("2008-08-19", df.format(earliestWeight.getObsDatetime()));
}
}
