package JavaCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangziming on 5/19/16.
 */
public class JavaMemoryCount {

    public static void main(String[] argv){
        System.gc();
        long total = Runtime.getRuntime().totalMemory(); // byte
        long m1 = Runtime.getRuntime().freeMemory();
        System.out.println("before:" + (total - m1));

        Map<Object,Object> map = new HashMap<Object,Object>();
        for(int i=0; i < 100; i++){
            map.put(new Object(), new Object());
        }
        long total1 = Runtime.getRuntime().totalMemory();
        long m2 = Runtime.getRuntime().freeMemory();
        System.out.println("after:" + (total1 - m2));
        System.out.println(map.toString());
        System.out.println();

    }

}
