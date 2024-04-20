public class App {
    public static void main(String[] args) {
        GUIFactory factory;
        Application app;
        String osName = System.getProperty("os.name").toLowerCase();
        System.out.println(osName);
        //here it will be print OperatingSystem name.my OS is window that's way it print the windowOS rather then Mac OS. 
        if (osName.contains("mac")) {
            factory = new MacFactory();
            app = new Application(factory);
        } else {
            factory = new WindowFactory();
            app = new Application(factory);

        }

        app.Create();

    }

}
