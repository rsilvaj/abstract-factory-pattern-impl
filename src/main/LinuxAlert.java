package main;

public class LinuxAlert implements Alert {

    @Override
    public String getMessage() {
        return "Alert from Linux";
    }

}
