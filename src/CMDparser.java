import org.apache.commons.cli.*;

/**
 * User: che
 * Date: 13.02.14
 * Time: 16:46
 */
public class CMDparser {
    public static String HOST = null;
    public static String USER = null;
    public static String PASS = null;


    public CMDparser(String args[]) throws Exception{
        init(args);
    }

    public void init(String[] args) throws Exception {

        Options posixOptions = new Options();

        Option host = new Option("h", "host", true, "URL of the test site in format http://your.site.");
        host.setArgs(1);
        host.setArgName("host");
        posixOptions.addOption(host);

        Option user = new Option("u", "user", true, "User login.");
        user.setArgs(1);
        user.setArgName("user");
        posixOptions.addOption(user);

        Option pass = new Option("p", "password", true, "User password.");
        user.setArgs(1);
        user.setArgName("pass");
        posixOptions.addOption(pass);

        CommandLineParser cmdLinePosixParser = new PosixParser();
        CommandLine commandLine = cmdLinePosixParser.parse(posixOptions, args);


        if( commandLine.hasOption("host")) {
            HOST = commandLine.getOptionValue("host");
        }
        else {
            System.out.println("no args \"URL\" ");
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp( "java -jar Checker.jar [OPTIONS]", posixOptions );

            System.exit(1);
        }

        if( commandLine.hasOption("user")) {
            USER = commandLine.getOptionValue("user");
        }
        else {
            System.out.println("no args \"username\" ");
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp( "java -jar HeliosChecker.jar [OPTIONS]", posixOptions );
            System.exit(1);
        }

        if( commandLine.hasOption("password")) {
            PASS = commandLine.getOptionValue("password");
        }
        else {
            System.out.println("no args \"password\" ");
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp( "java -jar HeliosChecker.jar [OPTIONS]", posixOptions );
            System.exit(1);
        }

    }

}
