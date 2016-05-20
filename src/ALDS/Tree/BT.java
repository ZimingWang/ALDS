package ALDS.Tree;

import JavaCode.ObjectSizeCalculator;

/**
 * Created by wangziming on 5/19/16.
 */

interface BTS<T>{

    public T getVal();
    public BTS getRight();
    public BTS getLeft();
}

class LeafNode<T> implements BTS{

    public T val;

    public LeafNode(T val){
        this.val = val;
    }

    @Override
    public Object getVal() {
        return val;
    }

    @Override
    public BTS getRight() {
        return null;
    }

    @Override
    public BTS getLeft() {
        return null;
    }
}



public class BT<T> {
    public   T val;
    public  BT right;
    public  BT left;

    public BT(T val) {
        this.val = val;
    }
}


class GeneratedTree{

    public static void main(String[] argv) throws IllegalAccessException {
        BT root = new BT(3);
        BT left = new BT("ss");
        BT right = new BT("sddaf");

        root.left = left;
        root.right = right;

        pre_traverse(root);
        System.out.println(ObjectSizeCalculator.sizeOf(new BT("sdsds")));
        System.out.println(ObjectSizeCalculator.sizeOf(new LeafNode("sdsdsd")));
    }


    public static void pre_traverse(BT root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        pre_traverse(root.left);
        pre_traverse(root.right);
    }


}
