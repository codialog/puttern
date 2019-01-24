import java.util.Date;

public class FactoryPattern {
    public static void main(String[] args) {
        WatchFactory factory = new DidgitWatchFactory();
        Watch watch = factory.createWatch();
        watch.showTime();
    }
}


interface Watch {
    void showTime();
}

class DigitalWotch implements Watch {
    public void showTime() {
        System.out.println(new Date());
    }
}

class QuartzWotch implements Watch {
    public void showTime() {
        System.out.println("◴");
    }
}


interface WatchFactory {
    // фабрика позволяющая производить любые часы
    Watch createWatch();
}

class DidgitWatchFactory implements WatchFactory {
    public Watch createWatch() {
        return new DigitalWotch();
    }
}

class QuartzWatchFactory implements WatchFactory {
    public Watch createWatch() {
        return new QuartzWotch();
    }
}