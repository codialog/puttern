public class FacadePattern {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.copy();
    }
}

class Computer {
    // to hide concrete realization used facade pattern
    Power power = new Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();

    void copy() {
        power.on();
        dvdRom.load();
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

