import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample
{


    public static void main(String[] args)
    {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("Kobe");
        namesLinkedList.add("Ringo");

        String[] names = new String[4];

        ArrayList<String> namesArraylist = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("Kobe");
        namesArrayList.add("Ringo");

    }

}
