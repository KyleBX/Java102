class LibraryItem {
    private boolean isCheckedOut;

    public LibraryItem(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public void returnItem() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Item returned.");
        } else {
            System.out.println("Item was already returned.");
        }
    }

    public boolean isAvailable() {
        return !isCheckedOut;
    }
}

public class Main {
    public static void returnAll(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }

    public static void main(String[] args) {
        LibraryItem item1 = new LibraryItem(true);
        LibraryItem item2 = new LibraryItem(false);
        LibraryItem item3 = new LibraryItem(true);

        LibraryItem[] items = {item1, item2, item3};

        System.out.println("Returning all items:");
        returnAll(items);
    }
}
