import java.util.ArrayList;

public class Sort {

    public static void main(String[] args) {
        
        ArrayList<String> haystack = new ArrayList<String>();

        // Fruits randomly picked from randomlists.com/random-fruits
        haystack.add("kumquat");
        haystack.add("dragonfruit");
        haystack.add("jujube");
        haystack.add("pear");
        haystack.add("coconut");
        haystack.add("strawberry");

        System.out.println(haystack);
        //selectionSort(haystack);
        //insertionSort(haystack);
        bubbleSort(haystack);
        System.out.println(haystack);


    }



    public static void selectionSort(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {

            String smallest = "z";
            int index = i;

            for (int j = i; j < list.size(); j++) {

                if (list.get(j).compareTo(smallest) < 0) {
                    smallest = list.get(j);
                    index = j;
                }
                
            }

            list.set(index, list.get(i));
            list.set(i, smallest);
            System.out.println(list);

        }

    }

    public static void insertionSort(ArrayList<String> list) {

        for (int i = 1; i < list.size(); i++) {

            int index = i;
            while (list.get(index).compareTo(list.get(index-1)) < 0) {
                swap(list, index, index-1);
                if (index > 1) {
                    index--;
                }
            }

        }

    }

    public static void bubbleSort(ArrayList<String> list) {

        boolean swapsNeeded = true;

        while (swapsNeeded) {
            swapsNeeded = false;
            for (int i = 1; i < list.size(); i++) {

                if (list.get(i).compareTo(list.get(i-1)) < 0) {
                    swap(list, i, i-1);
                    swapsNeeded = true;
                }

            }
        }

    }

    private static void swap(ArrayList<String> list, int a, int b) {

        String temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);

    }

}