package dio.design.pattern.estruturais.decorator;

public class CarroPopular implements Carro {
    @Override
    public void montar() {
        System.out.print("Carro popular.");
    }
}
