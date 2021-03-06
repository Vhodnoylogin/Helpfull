package helpful.tree.nodes;

import helpful.exceptioned.functions.FunctionWithException;
import helpful.exceptioned.functions.FunctionWithException3Params;
import helpful.simplification.CompareFunction;

public interface TreeNodeInterface<T> {
    void setLeft(T data);

    void setRight(T data);

    TreeNodeInterface<T> getParent();

    TreeNodeInterface<T> getLeft();

    TreeNodeInterface<T> getRight();

    void setParent(TreeNodeInterface<T> parent);

    T getData();

    void setData(T data);

    void addData(T data, CompareFunction<T> compare) throws Exception;

    void remove();

    boolean isRemoved();

    boolean isEmpty();

    <R> R drill(
            FunctionWithException<TreeNodeInterface<T>, R> function
            , FunctionWithException<TreeNodeInterface<T>, Boolean> stop
            , FunctionWithException3Params<R, R, R, R> summator
    ) throws Exception;
}