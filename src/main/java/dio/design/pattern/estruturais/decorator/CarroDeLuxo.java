package dio.design.pattern.estruturais.decorator;

public class CarroDeLuxo extends CarroDecorator{
    public CarroDeLuxo(Carro carro) {
        super(carro);
    }

    @Override
    public void montar(){
        super.montar();
        System.out.print(" Acrescentando recursos de carro de luxo ao carro popular...");
    }
}
