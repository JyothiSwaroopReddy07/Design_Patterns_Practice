package AbstractFactoryPattern;

public class Intel implements Company {

    @Override
    public GPU createGPU() {
        return new IntelGPU();
    }

    @Override
    public Processor createProcessor() {
        return new IntelProcessor();
    }
}
