import java.util.ArrayList;
import java.util.HashMap;

public class TaskTwo {
    // 2. Пусть дан список сотрудников:Иван Иванов Написать программу, которая
    // найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать
    // по убыванию популярности.

    public ArrayList<String> fillList(ArrayList<String> list) {
        list.add("Иван Иванов");
        list.add("Иван Иванов");
        list.add("Иван Иванов");
        list.add("Петр Петров");
        list.add("Олег Олегов");
        list.add("Василий Васильев");
        list.add("Петр Петров");
        list.add("Иван Иванов");
        list.add("Олег Олегов");
        list.add("Федор Федоров");
        list.add("Олег Олегов");
        return list;
    }

    public HashMap<String, Integer> countRepeat(ArrayList<String> list) {
        HashMap<String, Integer> countMap = new HashMap<>();
        HashMap<String, Integer> uniqMap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            countMap.put(list.get(i), 0);
        }

        for (int i = 0; i < list.size(); i++) {
            for (HashMap.Entry<String, Integer> countEntry : countMap.entrySet()) {
                if (list.get(i).equals(countEntry.getKey())) {
                    countMap.put(list.get(i), countEntry.getValue() + 1);
                }
            }
        }

        for (HashMap.Entry<String, Integer> countEntry : countMap.entrySet()) {
            if (countEntry.getValue() != 1) {
                uniqMap.put(countEntry.getKey(), countEntry.getValue());
            }
        }

        return uniqMap;
    }

    public void sortList(HashMap<String, Integer> list) {
        ArrayList<String> sortedList = new ArrayList<>();
        Integer max = 2;

        System.out.println("Первоначальный список: " + list);

        for (HashMap.Entry<String, Integer> countEntry : list.entrySet()) {
            if (countEntry.getValue() > max) {
                max = countEntry.getValue();
            }
        }

        do {
            for (HashMap.Entry<String, Integer> countEntry : list.entrySet()) {
                if (countEntry.getValue() == max) {
                    sortedList.add(countEntry.getKey() + " встречается " + countEntry.getValue() + " раз(а)");
                }
            }

            max--;
        } while (max > 1);


        System.out.print("Отсортированный по убыванию популярности список: " + sortedList);
    }
}
