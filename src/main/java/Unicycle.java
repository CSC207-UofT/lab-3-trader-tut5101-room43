public class Unicycle  implements Tradable, Drivable{

    private int maxspeed;
    private int numberOfUpgrades;

    /**
     * Initializes a new Unicycle
     * It fast af
     */
    public void Unicycle() {
        this.maxspeed = 2;
        this.numberOfUpgrades = 0;
    }

    /**
     * Increases the max speed exponentially
     */
    @Override
    public void upgradeSpeed() {
        this.maxspeed = this.maxspeed * this.maxspeed;
        this.numberOfUpgrades++;
    }

    /**
     * Decreases speed back to original speed.
     */
    @Override
    public void downgradeSpeed() {
        this.maxspeed = 2;
        this.numberOfUpgrades = 0;
    }

    /**
     * Returns the max speed
     * @return the max speed of this unicycle
     */
    @Override
    public int getMaxSpeed() {
        return this.maxspeed;
    }

    @Override
    public int getPrice() {
        return (int) Math.pow(5, this.numberOfUpgrades);
    }
}
