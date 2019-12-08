package pattern.create.singleton;

public class DelayLoadSingletonWithInnerClass {
    private DelayLoadSingletonWithInnerClass(){}

    public static DelayLoadSingletonWithInnerClass getInstance() {
        return Holder.instance;
    }

    private static class Holder {
        private static final DelayLoadSingletonWithInnerClass instance = new DelayLoadSingletonWithInnerClass();
    }
}
