//103
public class func{
public void createBirthDate(final int year,final int month,final int dayOfMonth){
    Calendar birthDate = Calendar.getInstance();
    birthDate.clear();
    birthDate.set(Calendar.DAY_OF_MONTH, dayOfMonth);
    return birthDate.getTime();
}
}
