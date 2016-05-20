package ALDS.Tree;

/**
 * Created by wangziming on 5/19/16.
 */
public class BT<T> {
    public   T val;
    public  BT right;
    public  BT left;

    public BT(T val) {
        this.val = val;
    }
}


class GeneratedTree{

    public static void main(String[] argv){
        BT root = new BT(3);
        BT left = new BT("ss");
        BT right = new BT("sddaf");

        root.left = left;
        root.right = right;

    }


    public static void traverse(BT root){
        if(root == null){

        }
    }


}
