public class Main {
    public static void main(String[] args) {

        for (Planets planet : Planets.values()) {
            System.out.println("Current planet name is: " + planet.name());
            System.out.println("Current planet position is: " + planet.position);
            System.out.println("Previous planet name is: " + planet.getPrevious());
            System.out.println("Next planet name is: " + planet.getNext());
            System.out.println("Distance from Sun to current planet is: " + planet.getSunDistance() + " millions kilometers");
            System.out.println("Radius of current planet is: " + planet.getRadius() + " thousands kilometers");
            System.out.println("Distance from previous to current planet is: " + planet.getPrevDistance() + " millions kilometers");
            System.out.println("--------------------");
        }
    }
}
