import java.util.TreeSet;
import java.util.Iterator;

public class treeset {
    public static void main(String[] args) {

        TreeSet<Integer> mySet = new TreeSet<Integer>();

// Adding hashset
        mySet.add(44);
        mySet.add(34);
        mySet.add(56);
        mySet.add(75);
        mySet.add(23);
        System.out.println("Treesets are : "+mySet);

// Hashset size
        System.out.println("Displaying the Treeset size : "+ mySet.size());


// Iteration
        Iterator<Integer> itr = mySet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

// In Descending Order
        System.out.print("In Descending order : ");
        Iterator<Integer> i = mySet.descendingIterator();
        while (i.hasNext()){
            System.out.print(i.next()+" ");
        }

//Remove
        mySet.remove(56);
        mySet.remove(23);
        System.out.println("\nRemoving elements : "+mySet);


// Boolean
        System.out.println("After clear Treeset : " + mySet.isEmpty());

// clear
        mySet.clear();
        System.out.println("After clear Treeset : " + mySet.isEmpty());

    }
}


