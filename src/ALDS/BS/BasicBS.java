package ALDS.BS;

/**
 * Created by wangziming on 5/19/16.
 */

public class BasicBS {
    public static void main(String[] argvv){
        System.out.print("Helo");
    }
}


class TreeNode<T>{

    T val;
    TreeNode right;
    TreeNode left;

    public TreeNode(T val){
        this.val = (T) val;
    }


}