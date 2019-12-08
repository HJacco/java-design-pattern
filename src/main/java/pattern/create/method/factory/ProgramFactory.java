package pattern.create.method.factory;

public class ProgramFactory implements IFactory {

    public ILog createLogger() {
        return new ProgramLogger();
    }
}
