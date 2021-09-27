import java.util.List;

public class Donkey implements Tradable, Domesticatable, {

    /**
     * Construct a Trader, randomly giving them both an inventory and
     * a wishlist using the items in item_list.
     *
     * @param item_list A List of Tradable objects that may be placed in
     *                  either this Trader's inventory or wishlist.
     */

    public Donkey() {
        super();
    }

    @Override
    public String sound() {
        return "yeehaw";
    }

    @Override
    public int getPrice() {
        return 12;
    }
}
