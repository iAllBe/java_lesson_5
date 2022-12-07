import java.util.HashMap;

public class TaskTwo {
    // 2. Пусть дан список сотрудников:Иван Иванов Написать программу, которая
    // найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать
    // по убыванию популярности.

    public HashMap<Integer, String> fillMap(HashMap<Integer, String> list) {
        list.put(1, "Иванов");
        list.put(2, "Васильев");
        list.put(3, "Петрова");
        list.put(4, "Иванов");
        list.put(5, "Петрова");
        list.put(6, "Иванов");
        return list;
    }

    public void countRepeat(HashMap<Integer, String> list) {
        HashMap<String, Integer> countMap = new HashMap<>();

        for (HashMap.Entry<Integer, String> listEntry : list.entrySet()) {
            countMap.put(listEntry.getValue(), 0);
        }

        System.out.println(countMap);

        for (HashMap.Entry<Integer, String> listEntry : list.entrySet()) {
            for (HashMap.Entry<String, Integer> countEntry : countMap.entrySet()) {
                if (listEntry.getValue().equals(countEntry.getKey())) {
                    Integer tempInt = countEntry.getValue();
                    String tempStr = countEntry.getKey();
                    countMap.put(tempStr, tempInt+1);
                }
            }
        }

        System.out.println(countMap);
    }
}
