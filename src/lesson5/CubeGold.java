package lesson5;

public class CubeGold extends GoldShape {
    double side;

    public CubeGold() {
    }

    public CubeGold(double side) {
        this.side = side;
    }

    public double getVolume() {
        return Math.pow(side, 3);
    }
}
