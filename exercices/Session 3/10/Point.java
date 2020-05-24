class Point implements Debuggable {
  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public double getX() {
    return this.x;
  }
  public double getY() {
    return this.y;
  }
}