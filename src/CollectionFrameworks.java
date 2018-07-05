import java.util.ArrayList;

/**
 * Array
 * ArrayList
 * HashSet
 * HashMap
 */
public class CollectionFrameworks {
    public void explainArray() {
        int[] intArray = new int[5];

        intArray[0]=5;
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);
    }
    public void explainArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList.get(0));
    }
}
