package dio.design.pattern.estruturais.decorator;

public class CarroEsportivo extends CarroDecorator {

    public CarroEsportivo(Carro carro) {
        super(carro);
    }

    @Override
    public void montar(){
        super.montar();
        System.out.print(" Acrescentando recursos de carro esportivo ao carro popular...");
    }
}
