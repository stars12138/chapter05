package test4;

import java.lang.reflect.Field;

public class reflection2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class c=Class.forName("test4.User");
        Field idF=c.getDeclaredField("id");
        Object o=c.newInstance();
        idF.setAccessible(true);
        idF.set(o,"110");
        System.out.println(idF.get(o));
    }
}
