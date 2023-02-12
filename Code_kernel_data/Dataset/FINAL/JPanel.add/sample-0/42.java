public class func{
public void BinomialParametersPanel(){
        wrapper.add(new JSpinner(probabilityNumberModel));
        SpringUtilities.makeCompactGrid(wrapper, 4, 1, 6, 6, 6, 6);
        add(wrapper, BorderLayout.NORTH);
}
}
