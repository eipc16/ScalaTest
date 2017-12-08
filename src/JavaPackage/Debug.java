package JavaPackage;

import java.lang.reflect.Field;

/**
 * Created by epicm on 08.12.2017.
 */
class Debug {

    static void fields(Object o){
        for(Field v : o.getClass().getDeclaredFields()){
            v.setAccessible(true);
            try {
                System.out.println("Pole: " + v.getName()
                + " => " + v.getType() + ", " + v.get(o));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
