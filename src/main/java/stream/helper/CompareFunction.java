package stream.helper;

import exceptioned.functions.FunctionWithException2Params;

public interface CompareFunction<T> extends FunctionWithException2Params<T, T, CompareFunction.Compare> {
    enum Compare {
        LARGER,
        EQUAL,
        LESS
    }
}