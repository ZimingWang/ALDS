package JavaCode;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import com.sun.tools.internal.ws.util.ClassNameInfo;

/**
 * Created by wangziming on 5/19/16.
 */

//null值不是任何对象的实例，所以下面这个例子返回了false，无论这个变量声明的是什么类型

public class GenericMethodClass {

    public <T> T getT(T t){

        return t;
    }

    public <T> void printT(T t){

        System.out.println(t);
    }

    public <T extends Comparable<T>> T compareT(T t1, T t2){
        T max = t1;
        if(t1.compareTo(t2) < 0){
            max = t2;
        }
        return max;
    }


    public static void main(String[] argv){
        GenericMethodClass test = new GenericMethodClass();

        //
        System.out.println(test.getT(1));
        System.out.println(test.getT("string"));
        System.out.println(test.getT(1.0));

        //
        test.printT(1);
        test.printT("string");
        test.printT(1.0);

        //
        System.out.println(test.compareT(1,2));
        System.out.println(test.compareT("a","b"));
        System.out.println(test.compareT(2.0f,1.0f));
        System.out.println(test.compareT(2.0,1.0));

        GenricT test2Int = new GenricT(2);
        System.out.println(test2Int.getT());

        GenricT test2String = new GenricT("String");
        System.out.println(test2String.getT());

        Sample cases = new Sample();
        GenricT test2Other = new GenricT(cases);
        System.out.println(test2Other.getT() instanceof Sample);

    }
    //null值不是任何对象的实例，所以下面这个例子返回了false，无论这个变量声明的是什么类型
    //instanceof也可以正确的报告一个对象是否是数组和特定的接口类型
}


class GenricT<T>{

    private T t;

    public GenricT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}


class Sample{

}