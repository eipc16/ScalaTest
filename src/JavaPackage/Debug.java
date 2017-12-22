package JavaPackage;

import java.util.Arrays;

/**
 * Created by epicm on 08.12.2017.
 */
class Debug {

    static void fields(Object o){
        Arrays.stream(o.getClass().getDeclaredFields()).map(v -> {
            v.setAccessible(true);
            try {
                return "Pole: " + v.getName()
                        + " => " + v.getType() + ", " + v.get(o).toString();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return "";
        }).forEach(System.out::println);
    }
}
