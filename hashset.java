import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {

        HashSet<String> mySet = new HashSet<String>();

// Adding hashset
        mySet.add("Kohli");
        mySet.add("Virat");
        mySet.add("Rohit");
        mySet.add("Sharma");
        mySet.add("Rahul");
       System.out.println("Hashset : "+mySet);

// Hashset size
        System.out.println("Displaying the hashset size : "+ mySet.size());


// Iteration
        Iterator<String> itr = mySet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Iteration elements :  "+mySet);



//Remove
        mySet.remove("Virat");
        mySet.remove("Rohit");
        System.out.println("Updated elements : "+mySet);


// Boolean
        System.out.println("After clear hashset : " + mySet.isEmpty());

// clear
        mySet.clear();
        System.out.println("After clear hashset : " + mySet.isEmpty());

    }
}

