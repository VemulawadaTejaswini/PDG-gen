//165
public class func{
public void dateUpdatedAfterFocusLostSetup(){
    tester = new CdtTester(getShell(), CDT.BORDER | CDT.DROP_DOWN | CDT.COMPACT);
    tester.setPattern("dd");
    Calendar cal = tester.getCalendarInstance();
    cal.set(Calendar.DATE, 1);
    tester.setSelection(cal.getTime());
    button = new Button(getShell(), SWT.PUSH);
    button.setText("test");
}
}
