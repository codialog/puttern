public class FacadePattern {

    public static void main(String[] args) {

        //For to hide this realization need facade pattern
        Power power = new Power();
        power.on();

        DVDRom dvdRom = new DVDRom();
        dvdRom.load();

        HDD hdd = new HDD();
        hdd.copyFromDVD(dvdRom);

    }
}


class Power {
    void on() {
        System.out.println("Power on");
    }

    void off() {
        System.out.println("Power off");
    }
}

class DVDRom {
    private boolean data = false;
    public boolean hasData() {
        return data;
    }

    void load() {
        data = true;
    }

    void unload() {
        data = false;
    }
}

class HDD {
    void copyFromDVD(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("Сopying");
        } else {
            System.out.println("No data on dvd");
        }
    }
}

