package InsertRemove;

public class FruitExample1 {

    static int logicalSize = 4;
    static String fruits[] = new String[10];
    
    public static void main(String[] args) {
        
        fruits[0] = "Apple";
        fruits[1] = "Cherries";
        fruits[2] = "Lemon";
        fruits[3] = "Orange";
        showList();
        System.out.println("-----------------------");
        System.out.println("Adding Kiwi to list");
        int loc = findInsertPoint(fruits, "Kiwi");
        insert(fruits,"Kiwi",loc);
        showList();
        
        System.out.println("-----------------------");
        System.out.println("Adding Strawberry to list");
        loc = findInsertPoint(fruits, "Strawberry");
        insert(fruits,"Strawberry",loc);
        showList();
        
        System.out.println("-----------------------");
        System.out.println("Adding Banana to list");
        loc = findInsertPoint(fruits, "Banana");
        insert(fruits,"Banana",loc);
        showList();
        
        System.out.println("---------------------------");
        System.out.println("Removing Cherries and Orange from the list");
        
        loc = search(fruits, "Cherries");
        delete(fruits,loc);
        
        loc = search(fruits, "Orange");
        delete(fruits,loc);
        
        showList();
        
    }
    public static void showList(){
        for (int i = 0; i < logicalSize; i++) {
            System.out.println(fruits[i]);
            
        }
        
    }

    public static int search(Object[] a, Object searchValue) {
        int left = 0;
        int right = logicalSize - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a[midpoint]).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

    }

//////////////////////////////////////////////////////////////////////////////////
    public static boolean insert(Object array[], Object newItem, int targetIndex) {
        // Check for a full array and return false if full
        if (logicalSize == array.length) {
            return false;
        }
        // Check for valid target index or return false 
        if (targetIndex < 0 || targetIndex > logicalSize) {
            return false;
        }
        // Shift items down by one position
        for (int i = logicalSize; i > targetIndex; i--) {
            array[i] = array[i - 1];
        }
        // Add new item, increment logical size,return true                       
        array[targetIndex] = newItem;
        logicalSize++;
        return true;
    }

//////////////////////////////////////////////////////////////////////////////////
    public static boolean delete(Object array[], int targetIndex) {
        if (targetIndex < 0 || targetIndex >= logicalSize) {
            return false;
        }

        // Shift items up by one position
        for (int i = targetIndex; i < logicalSize - 1; i++) {
            array[i] = array[i + 1];
        }

        // Decrement logical size and return true 
        logicalSize--;
        return true;
    }

/////////////////////////////////////////////////////////////////////////////////
    public static int findInsertPoint(Object a[], Object searchValue) {
        int left = 0;
        int right = logicalSize - 1;
        int midpoint = 0;
        int result = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;
            result = ((Comparable) a[midpoint]).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (result < 0) {
            midpoint++;
        }
        return midpoint;
    }

}
