/**
  Represent a sort and merge
  operation for 2 unsorted lists
 */
import java.util.ArrayList;

public class SubSortThenMerge_Sorter {

    ArrayList<String> mergedList;

    public SubSortThenMerge_Sorter(ArrayList<String> list) {
        mergedList = list;
    }


    public ArrayList<String> sortInHalves(  int start0  // index of first item in list0
    , int start1  // index of first item in list1
                  // = just past end of list0
    , int end1    // index past end of list1
    ) {
        System.out.println(end1);
        if (end1-start0 > 1){
            sortInHalves(start0,(start0+start1)/2,start1);
            sortInHalves(start1,(end1+start1)/2,end1);
            Merger merger = new Merger( mergedList);
            merger.merge( start0, start1, end1);
        }
        return mergedList;
    }

/*

ArrayList<String> firstHalf = new ArrayList<String>();
ArrayList<String> secondHlaf = new ArrayList<String>();
for (int i = start0 ; i < start1 ; i++){
    firstHalf.add(listToSplit[i]);
}
for (int i = start1 ; i < end1 ; i++){
    secondHalf.add(listToSplit[i]);
}
*/


    /**
      @return a string representation of the user's data
     */
    public String toString() {
        return ""+ mergedList;
    }

    public boolean isSorted( int startAt, int endBefore) {
        for( int i = startAt
           ; i < endBefore -1 // stop early, because comparing to next
           ; i++
           )
            if( mergedList.get(i).compareTo( mergedList.get(i+1)) > 0) {
                 System.out.println( "trouble between position " + i
                                  + ", which holds " + mergedList.get(i)
                                  + ", and position " + (i +1)
                                  + ", which holds " + mergedList.get(i +1)
                                  );
               return false;
            }
        return true;
    }
}
