//41
public class func{
public void canLoan(Patron borrower){
    Calendar allowedAfter = determineAllowedAfterDate(borrower);
    Calendar today = determineTodaysDate();
    return allowedAfter.getTime().getTime() < today.getTime().getTime();
}
}
