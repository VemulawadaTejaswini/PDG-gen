//470
public class func{
public void buildUpdateIntervalPanel(){
        pnl.add(tfUpdateInterval = new JosmTextField(5));
        lblUpdateInterval.setLabelFor(tfUpdateInterval);
        SelectAllOnFocusGainedDecorator.decorate(tfUpdateInterval);
}
}
