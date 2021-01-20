package main;

public class WindowsUIFactory implements UIAbstractFactory {

    @Override
    public Icon createIcon() {
        return new WindowsIcon();
    }

    @Override
    public Alert createAlert() {
        return new WindowsAlert();
    }

}
