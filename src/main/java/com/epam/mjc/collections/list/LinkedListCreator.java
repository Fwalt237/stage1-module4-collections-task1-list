package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> evenNumbers = new LinkedList<>();
        LinkedList<Integer> oddNumbers = new LinkedList<>();

        for (Integer number : sourceList) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
        LinkedList<Integer> reverseOddNumbers = new LinkedList<>();
        ListIterator<Integer> iterator = oddNumbers.listIterator(oddNumbers.size());
        while (iterator.hasPrevious()) {
            int number = iterator.previous();
            reverseOddNumbers.add(number);
        }
        reverseOddNumbers.addAll(evenNumbers);
        return reverseOddNumbers;

    }
}
