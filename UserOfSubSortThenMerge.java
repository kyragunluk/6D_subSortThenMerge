/**

 */
import java.util.ArrayList;
import java.util.Arrays;

public class UserOfSubSortThenMerge {

    public static void main(String[] commandLine) {
        ArrayList< String> listOfNumbers = new ArrayList< String>(
          /* Java's Arrays.asList provides a perspicuous
             way to build a Collection from literals,
             suitable for constructing an ArrayList */
          Arrays.asList(
              /*

              //base case test:
              "5"

              //simplest recursive case test:
              "5","3"

              */

              //complex recursive case :
              //#s 0-9
              "4","2","9","7","5","8","6","0","3","1",
              //duplicates
              "3","8","0"
              
            ));

        int start0 = 0;
        int start1 = listOfNumbers.size() / 2;
        int end1 = listOfNumbers.size();
        oneTest( "list of numbers"
               , listOfNumbers, start0, start1, end1 );
    }


    /**
     Run one test
     */
    private static void oneTest(
        String description
      , ArrayList<String> sortMe
        // indexes of sub-list boundaries; see README
      , int start0  // index of first item in list0
      , int start1  // index of first item in list1
                    // = just past end of list0
      , int nItems  // number of items in the merged list
                    // = just past end of list1

                               ) {

        SubSortThenMerge_Sorter sorter =
        new SubSortThenMerge_Sorter( sortMe);

        System.out.println(
            System.lineSeparator()
          + description + System.lineSeparator()
          + "before: " + sorter
          );
        sorter.sortInHalves( start0, start1, nItems);
        System.out.println( "after:  " + sorter);
        System.out.println(
            "sorted: "
          + sorter.isSorted( start0, nItems));
     }


}
