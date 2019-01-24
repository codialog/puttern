import java.util.Date;

public class FactoryPattern {
    public static void main(String[] args) {
        Watch watch = new QuartzWotch();
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
