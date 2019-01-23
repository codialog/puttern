public class DelegatePattern {
    public static void main(String[] args) {
        Painter painter = new Painter();
        painter.setGraphics(new Square());
        painter.drow();
    }
}

interface Graphics {
    void draw();
}

class Triangle implements Graphics {
    public void draw() {
        System.out.println("triangle");
    }
}

class Square implements Graphics {
    public void draw() {
        System.out.println("square");
    }
}

class Circle implements Graphics {
    public void draw() {
        System.out.println("circle");
    }
}
class Painter {
    Graphics graphics;
    void setGraphics(Graphics g)  {
        graphics = g;
    }

    void drow() {
        // делегируется метод ресованеие, фигуре
        graphics.draw();
    }
}
