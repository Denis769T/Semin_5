import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class HashMap1{
    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> Phone = new HashMap<>();
            Dataph ("Сафонов", 12334567, Phone);
            Dataph ("Кабанов", 123423425, Phone);
            Dataph ("Круглов", 546585, Phone);
            Dataph ("Петров", 8956477, Phone);
            Dataph ("Иванов", 156233, Phone);
            Dataph ("Круглов", 97837897, Phone);
            Dataph ("Петров", 9238407, Phone);
            Dataph ("Круглов", 787843457, Phone);
            Dataph ("Иванов", 787847, Phone);
            Dataph ("Иванов", 346472, Phone);
            Dataph ("Кабанов", 123832532, Phone);
            print(Phone);
    }
    // Добавляем номера в книгу
    public static void Dataph(String key, Integer value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);

            }
        else {
            ArrayList<Integer> list1 = new ArrayList<>();//Сохр.телефоны.
            list1.add(value);
            map.put(key, list1);
            //System.out.println(list1);
         }


    }
    //  Печатаем список контактов
    public static void print(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phon="";
            for (int tel: item.getValue()){
                phon = phon +"\n"+tel;
            }
            System.out.printf("%s: %s \n", item.getKey(), phon);
            System.out.println();
        }
    }

}

