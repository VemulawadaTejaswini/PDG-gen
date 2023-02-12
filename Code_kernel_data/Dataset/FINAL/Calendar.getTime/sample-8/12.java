public class func{
public void shouldThrowExceptionIfStartDateEqualToCurrentDateWhenDeletingPeriod(){
    Calendar periodStartDate = Calendar.getInstance();
    ProcessingPeriod processingPeriod = make(a(defaultProcessingPeriod, with(startDate, periodStartDate.getTime())));
    when(mapper.getById(processingPeriod.getId())).thenReturn(processingPeriod);
}
}
