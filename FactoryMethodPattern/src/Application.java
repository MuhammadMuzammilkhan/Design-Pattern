
// Here we make a class of Application in which we declare button for implementing Abstract Factory pattern.

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void Create() {
        button.Create();
        checkbox.Create();
    }

}