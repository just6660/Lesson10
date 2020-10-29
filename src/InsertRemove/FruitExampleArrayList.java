
package InsertRemove;

import java.util.ArrayList;

public class FruitExampleArrayList {
    
    static ArrayList<String> fruit = new ArrayList<String>();
    
    public static void main(String[] args) {
        fruit.add("Apple");
        fruit.add("Cherry");
        fruit.add("Mango");
        fruit.add("Pear");
        
        System.out.println("I have " + fruit.size() + " fruits:");
        
        for(String f:fruit){
            System.out.println(f);
        }
        
        System.out.println("Th first fruit is " + fruit.get(0));
        System.out.println("Changing apple to avocado");
        fruit.set(0,"Avocado");
        
        System.out.println("Adding Banana to location 1:");
        int loc = findInsertPoint(fruit, "Banana");
        fruit.add(loc,"Banana");
        
        fruit.add(1, "Banana");
        
        System.out.println("Taking out Mango");
        loc = fruit.indexOf("Mango");
        fruit.remove(loc);
        
        System.out.println("----------------------");
        
        for(String f:fruit){
            System.out.println(f);
        }
        
       
    }
    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;
        int result = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;
            result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

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
