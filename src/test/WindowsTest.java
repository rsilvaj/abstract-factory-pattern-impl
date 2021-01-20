package test;

import main.Client;
import main.UIAbstractFactory;
import main.WindowsUIFactory;

public class WindowsTest {

    public static void main(String[] args) {
        UIAbstractFactory windows = new WindowsUIFactory();
        Client client = new Client(windows);
        client.execute();
    }

}
