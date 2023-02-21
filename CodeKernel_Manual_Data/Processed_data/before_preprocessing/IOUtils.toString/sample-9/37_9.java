public class dummy {

public void execute() throws MojoExecutionException {

        Log log = getLog();

        try {
            String template = null;
            if (templateFile != null) {
                log.info("reading template file" + templateFile.getAbsolutePath());
                template = FileUtils.readFileToString(templateFile);
            } else {
                template = IOUtils.toString(HtmlTemplateMojo.class.getClassLoader()
                        .getResourceAsStream("com/flexdms/htmltemplate/tpl.js"));
                log.info("Using default template ");

                log.info(template);
            }

            log.info("srcDirectory is " + srcDirectory.getAbsolutePath());
            if (!srcDirectory.exists()) {
                log.info("SrcDirectory does not exist");
            }
            Scanner scanner = buildContext.newScanner(srcDirectory, true);
            scanner.scan();
            //scanner.setIncludes(new String[] { "**/*.html" });
            String files[] = scanner.getIncludedFiles();
            ;
            if (files == null) {
                log.info("no file is changed. Do not renerate template file");
                return;
            }
            java.util.Arrays.sort(files);
            Writer writer = new OutputStreamWriter(buildContext.newFileOutputStream(finalFile));
            List<String> modules = new ArrayList<String>(20);

            String templateNamePrefix = template.substring(template.indexOf('"') + 1,
                    template.indexOf("@@@@name@@@@"));
            if (fileHeader != null) {
                writer.write(fileHeader);
            }
            for (String childFile : files) {
                transformFile(childFile, srcDirectory, writer, template, modules);
            }
            if (fileFooter != null) {
                writer.write(fileFooter);
            }
            //handleDirectory(srcDirectory, FilenameUtils.normalizeNoEndSeparator(srcDirectory.getAbsolutePath(), true), writer, template, modules);
            if (generateModule) {
                writer.write("angular.module(\"ui." + srcDirectory.getName() + ".tpls\", [");
                for (String module : modules) {
                    writer.write("\"" + templateNamePrefix + module + "\",\n");
                }
                writer.write("]);\n");
            }
            writer.close();
            log.info("Finish writing file " + finalFile.getAbsolutePath());
        } catch (IOException e) {
            throw new MojoExecutionException(e.getMessage());
        }

    }

}