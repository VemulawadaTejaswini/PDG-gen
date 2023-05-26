public class func{
public void GaussianParametersPanel(){
        wrapper.add(new JSpinner(deviationNumberModel));
        SpringUtilities.makeCompactGrid(wrapper, 4, 1, 6, 6, 6, 6);
        add(wrapper, BorderLayout.NORTH);
}
}
