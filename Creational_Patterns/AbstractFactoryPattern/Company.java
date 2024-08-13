package AbstractFactoryPattern;

public interface Company {
    GPU createGPU();
    Processor createProcessor();
}
