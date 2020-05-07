public class Calculating {
    private double x;

    public Calculating(double x) throws Except {

        if (x <= 1.441 || x >= 52.772) throw new Except("Wrong range", x);
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double formula1() {
        double y;
        y = Math.pow(x, 4) * 3.75 + Math.pow(x, 3) * 2.317 - Math.pow(x, 2) * 4.367 + x * 3.851;
        return y;
    }

    public double formula2() {
        double y;
        y = Math.pow(x, 3) * 5.661 - Math.pow(x, 2) * 3.485 + x * 6.331;
        return y;
    }

    public double formula3() {
        double y;
        y = Math.pow(x, 2) * 2.642 - 2 * 2.769;
        return y;
    }

    public double formula4() {
        double y;
        y = x * 2.965;
        return y;
    }

}