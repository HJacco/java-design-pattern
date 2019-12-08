package pattern.create.singleton;

public class DelayLoadSingleton {
    private static volatile DelayLoadSingleton instance = null;

    private DelayLoadSingleton(){};

    public static DelayLoadSingleton getInstance() {
        if(null == instance) {
            synchronized (DelayLoadSingleton.class) {
                if (null == instance) {
                    instance = new DelayLoadSingleton();
                }
            }
        }
        return instance;
    }
}
