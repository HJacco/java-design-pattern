package pattern.create.method.factory;

public class ProgramLogger implements ILog {
    public void log(String log) {
        System.out.println("program:" + log);
    }
}
