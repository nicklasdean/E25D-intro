package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        List<String> linkedNames = new LinkedList<String>();

        getLengthOfList(names);
        getLengthOfList(linkedNames);
    }

    private static int getLengthOfList(List<String> list){
        int size = list.size();
        return size;
    }
}