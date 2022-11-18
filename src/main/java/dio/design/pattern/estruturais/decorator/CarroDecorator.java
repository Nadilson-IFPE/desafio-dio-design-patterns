package dio.design.pattern.estruturais.decorator;

public class CarroDecorator implements Carro {

    protected Carro carro;

    public CarroDecorator(Carro carro){
        this.carro = carro;
    }

    @Override
    public void montar() {
        this.carro.montar();
    }
}
