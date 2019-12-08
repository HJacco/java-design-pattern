package pattern.create.method.factory;

public class DBLogger implements ILog {
    public void log(String log) {
        System.out.println("db:" + log);
    }
}
