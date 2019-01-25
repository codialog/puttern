public class AbstractFactoryPattern {
    public static void main(final String[] arguments) throws Exception {
        IGUIFactory factory = null;

        final String appearance = "OSX"; // Current operating system

        if (appearance.equals("OSX")) {
            factory = new OSXFactory();
        } else if  (appearance.equals("Windows")) {
            factory = new WinFactory();
        } else {
            throw new Exception("No such operating system");
        }
        final IButton button = factory.createButton();

        button.paint();
    }
}



interface IButton {
    void paint();
}

interface IGUIFactory {
    IButton createButton();
}

class WinFactory implements IGUIFactory {
    public IButton createButton() {
        return new WinButton();
    }
}
class OSXFactory implements IGUIFactory {
    public IButton createButton() {
        return new OSXButton();
    }
}

class WinButton implements IButton {
    public void paint() {
        System.out.println("WinButton");
    }
}
class OSXButton implements IButton {
    public void paint() {
        System.out.println("OSXButton");
    }
}