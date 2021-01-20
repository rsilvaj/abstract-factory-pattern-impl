package test;

import main.Client;
import main.LinuxUIFactory;
import main.UIAbstractFactory;

public class LinuxTest {

    public static void main(String[] args) {
        UIAbstractFactory linux = new LinuxUIFactory();
        Client client = new Client(linux);
        client.execute();
    }

}
