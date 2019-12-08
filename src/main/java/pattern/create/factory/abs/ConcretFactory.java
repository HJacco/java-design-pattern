package pattern.create.factory.abs;

public class ConcretFactory extends AbstractFactory {
    @Override
    protected Ios getIos() {
        return new Ios();
    }

    @Override
    protected Android getAndroid() {
        return new Android();
    }

    @Override
    protected Sybain getSybain() {
        return new Sybain();
    }
}
