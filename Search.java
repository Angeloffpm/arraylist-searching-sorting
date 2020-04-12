import java.util.ArrayList;

public class Search {

    public static void main(String[] args) {
        
        ArrayList<String> haystack = new ArrayList<String>();
        haystack.add("apple");
        haystack.add("banana");
        haystack.add("banana");
        haystack.add("cherry");
        haystack.add("lemon");
        haystack.add("lime");
        haystack.add("mango");
        haystack.add("orange");
        haystack.add("pear");
        haystack.add("strawberry");
        haystack.add("watermelon");

        System.out.println(search(haystack, "blueberry"));
        System.out.println(search(haystack, "strawberry"));
        
        System.out.println("Blueberry: " + binarySearch(haystack, "blueberry"));
        System.out.println("Strawberry: " + binarySearch(haystack, "strawberry"));
        System.out.println("Apple: " + binarySearch(haystack, "apple"));
        System.out.println("Watermelon: " + binarySearch(haystack, "watermelon"));

    }



    public static int search(ArrayList<String> haystack, String needle) {

        for (int i = 0; i < haystack.size(); i++) {
            if (haystack.get(i).equals(needle)) {
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(ArrayList<String> haystack, String needle) {

        System.out.println("\n");

        int index = -1;
        int upper = haystack.size() - 1;
        int lower = 0;

        while (lower < upper && index == -1) {

            int check = (lower + upper) / 2;
            System.out.println(check);
            System.out.println(haystack.get(check));

            if (haystack.get(check).equals(needle)) {
                index = check;
            } else if (needle.compareTo(haystack.get(check)) > 0) { // Move to Upper Half
                lower = check;
            } else { // Move to Lower Half
                upper = check;
            }

            System.out.println("(" + lower + ", " + upper + ")");

            if (upper - lower <= 1) {
                if (upper == haystack.size() - 1) { // If we're at the higher end, check the last item.
                    if (haystack.get(haystack.size()-1).equals(needle)) {
                        index = haystack.size() - 1;
                    }
                } else { // If we're at the lower end, check the first item.
                    if (haystack.get(0).equals(needle)) {
                        index = 0;
                    }
                }
                upper = lower;
            }

        }

        return index;

    }

}