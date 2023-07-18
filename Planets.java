

public enum Planets {
    MERCURY(0, 2.4397, null),
    VENUS(50,6.0518,MERCURY),
    EARTH(42,6.371, VENUS),
    MARS(78, 3.3895, EARTH),
    JUPITER(550,69.911, MARS),
    SATURN(651, 58.232, JUPITER),
    URANUS(1446, 25.362, SATURN),
    NEPTUNE(1622, 24.622, URANUS);

    public int position;
    private int prevDistance;
    private int sunDistance;
    private double radius;
    private Planets previous;
    private Planets next;

    Planets(int prevDistance, double radius, Planets previous) {
        this.prevDistance = prevDistance;
        this.radius = radius;
        this.previous = previous;
        this.position = ordinal() + 1;
        this.next = setNextForPrevious();
        this.sunDistance = getSunDistance();
    }

    private Planets setNextForPrevious() {
        if (previous != null) {
            previous.next = this;
        }
        return next;
    }

    public Planets getPrevious() {
        return previous;
    }

    public int getPrevDistance() {
        return prevDistance;
    }

    public int getSunDistance() {
        if (previous == null) {
            return 0;
        }
        return previous.sunDistance + prevDistance;
    }

    public double getRadius() {
        return radius;
    }

    public Planets getNext() {
        return next;
    }
}
