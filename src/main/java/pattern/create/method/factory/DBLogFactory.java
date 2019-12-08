package pattern.create.method.factory;

public class DBLogFactory implements IFactory {

    public ILog createLogger() {
        return new DBLogger();
    }
}
