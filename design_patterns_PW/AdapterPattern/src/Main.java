public class Main {
    public static void main(String[] args) {

        SwiggyStore swiggyStore = new SwiggyStore();
        swiggyStore.addItems(new FoodItem());
        swiggyStore.addItems(new FoodItem());

        // Adapter grocery which was incompatible with food.
        // ???
        swiggyStore.addItems(new GroceryItemAdapter(new GroceryProduct()));

        // Print Items in the store


        // This is a item and restaurant is KFC
        System.out.println(swiggyStore.items.get(0).getRestaurantName());

        // This is a GroceryItem and the Store name is swiggy Instamart
        System.out.println(swiggyStore.items.get(2).getRestaurantName());

    }
}