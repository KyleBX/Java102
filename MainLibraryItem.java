public class Main {
    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availableList = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                availableList.add(item);
            }
        }
        return availableList;
    }

    public static void main(String[] args) {
        LibraryItem item1 = new LibraryItem(true);
        LibraryItem item2 = new LibraryItem(false);
        LibraryItem item3 = new LibraryItem(false);

        LibraryItem[] items = {item1, item2, item3};

        System.out.println("Available items:");
        ArrayList<LibraryItem> available = availableItems(items);
        System.out.println("Count: " + available.size());
    }
}
