/**
 * This is the example of object level adapter because we are adapting
 * GroceryItem using instance of that particular class.
 *
 * GroceryItem Object -----> Item Object (Base item)
 */

public class GroceryItemAdapter implements Item{

    private GroceryItem item;

    public GroceryItemAdapter(GroceryItem gItem){
        this.item = gItem;
    }

    @Override
    public String getItemName(){
        return item.getName();
    }

    @Override
    public String getPrice(){
        return item.getPrice();
    }

    @Override
    public String getRestaurantName(){
        return item.getStore();
    }
}
