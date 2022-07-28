/*1. Using a Set
We know that set stores only distinct entries. The idea is to get distinct elements in the list by inserting all elements in the set & then call static method frequency(Collection<?> c, Object o) provided by the Collections class for each distinct element. frequency() returns the total number of occurrences of the specified element in the list.*/

import java.util.*;
 
// Program to count the frequency of the elements in a list
class CountF
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("B", "A", "A", "C", "B", "A");
 
        Set<String> distinct = new HashSet<>(list);
        for (String s: distinct) {
            System.out.println(s + ": " + Collections.frequency(list, s));
        }
    }
}