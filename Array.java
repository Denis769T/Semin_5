import java.util.Map;
import java.util.HashMap;


public class Array {
    public static void main(String[] args) {

        Map<Integer, String> passport = new HashMap<>();
        passport.put(123456, "Иванов");
        passport.put(321456, "Васильев");
        passport.put(234561, "Петров");
        passport.put(234432, "Иванов");
        passport.put(654321, "Петров");
        passport.put(345678, "Иванов");
        passport.put(32142356, "Васильев");

        String name="Васильев";
        System.out.println(name);
        for(Map.Entry<Integer,String> item:passport.entrySet()){
            if(item.getValue()==name)
                System.out.println(item.getKey());
        }





    }
}

