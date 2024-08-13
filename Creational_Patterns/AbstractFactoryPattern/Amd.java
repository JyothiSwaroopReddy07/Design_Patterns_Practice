package AbstractFactoryPattern;

public class Amd implements Company{

    @Override
    public GPU createGPU() {
        return new AmdGPU();
    }

    @Override
    public Processor createProcessor() {
        return new AmdProcessor();
    }
    
}
