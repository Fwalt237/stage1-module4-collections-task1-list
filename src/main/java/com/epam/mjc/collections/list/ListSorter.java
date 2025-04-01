package com.epam.mjc.collections.list;


import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Comparator<String> comparator = new ListComparator() ;
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        try{
            int first = Integer.parseInt(a);
            int second = Integer.parseInt(b);
            return ((first*5)*(first*5) +3) - ((second*5)*(second*5) +3);
        } catch (NumberFormatException e){
            return 0;
        }
    }
}
