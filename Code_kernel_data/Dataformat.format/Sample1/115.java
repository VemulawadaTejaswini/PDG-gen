//114
public class func{
	public void getSubject(){
      Context appContext = Preconditions.checkNotNull(getApplicationContext());
      DateFormat dateFormat = getDateFormat(appContext);
      return getResources().getString(R.string.encrypted_pdf_backup_email_title) + " " + dateFormat.format(now);
}
}
