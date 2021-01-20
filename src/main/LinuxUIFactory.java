package main;

public class LinuxUIFactory implements UIAbstractFactory {

    @Override
    public Icon createIcon() {
        return new LinuxIcon();
    }

    @Override
    public Alert createAlert() {
        return new LinuxAlert();
    }

}
