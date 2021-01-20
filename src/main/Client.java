package main;

public class Client {

    private UIAbstractFactory uiAbstractFactory;

    public Client(UIAbstractFactory uiAbstractFactory) {
        this.uiAbstractFactory = uiAbstractFactory;
    }

    public void execute() {
        Icon icon = uiAbstractFactory.createIcon();
        Alert alert = uiAbstractFactory.createAlert();
        System.out.println(icon.getName());
        System.out.println(alert.getMessage());
    }

}
