public class func{
public void buildOptions(JPanel searchOptions){
    searchOptions.add(UIUtil.createOptionLine(formatAccordingToStyle = new JCheckBox(
      CodeInsightBundle.message("dialog.edit.template.checkbox.reformat.according.to.style"), true)));
    searchOptions.add(UIUtil.createOptionLine(useStaticImport = new JCheckBox(
      CodeInsightBundle.message("dialog.edit.template.checkbox.use.static.import"), true)));
}
}
