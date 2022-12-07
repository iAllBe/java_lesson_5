import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TaskOne taskOne =  new TaskOne();
        // HashMap<Integer,String> phoneBook = taskOne.fillMap(new HashMap<>());
        // Scanner in = new Scanner(System.in);
        // taskOne.getPhoneInfoByName(phoneBook, in.next());
        // in.close();

        TaskTwo taskTwo = new TaskTwo();
        ArrayList<String> list = taskTwo.fillList(new ArrayList<>());
        HashMap<String, Integer> uniqtList = taskTwo.countRepeat(list);
        taskTwo.sortList(uniqtList);
    }

}