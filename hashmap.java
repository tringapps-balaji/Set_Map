import java.util.HashMap;

public class hashmap {
    public static void main (String []args){

        HashMap<Integer, String> hash1 = new HashMap<>();
        //HashMap<Integer, String> map2 = new HashMap<>();

    // Adding elements
        hash1.put(1,"virat");
        hash1.put(2,"rohit");
        hash1.put(3,"hardik");

        System.out.println(" Initial hashpmap map 1 : "+hash1);

        // extra adding  elements
        hash1.put(4,"sachin");

        // remove elements
        hash1.remove(2);

        //changing the elements
        hash1.put(3,"pandya");

        System.out.println(" Updated hashmap map 2 : "+hash1);

    }
}
