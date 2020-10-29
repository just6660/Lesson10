
package Sorting;

public class ISSStudent implements Comparable {
    private String name, address;
    private int id;
    
    ISSStudent(String n, String a, int i){
        name = n;
        address = a;
        id = i;
        
    }
    
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Object t) {
        ISSStudent other =(ISSStudent)t;
        return name.compareTo(other.getName());
     
    }
    
}
