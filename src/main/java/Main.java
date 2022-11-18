import dio.design.pattern.comportamentais.observer.RockBandFan;
import dio.design.pattern.comportamentais.observer.RockShowNotifier;
import dio.design.pattern.criacionais.builder.*;
import dio.design.pattern.estruturais.decorator.Carro;
import dio.design.pattern.estruturais.decorator.CarroDeLuxo;
import dio.design.pattern.estruturais.decorator.CarroEsportivo;
import dio.design.pattern.estruturais.decorator.CarroPopular;

public class Main {

    public static void main(String[] args) {

        // Decorator
        System.out.println("\n\n------------------------\n");
        System.out.println("Design Pattern: Decorator");
        Carro carroEsportivo = new CarroEsportivo(new CarroPopular());
        carroEsportivo.montar();
        System.out.println("\n");

        Carro carroDeLuxo = new CarroEsportivo(new CarroDeLuxo(new CarroPopular()));
        carroDeLuxo.montar();

        System.out.println("\n\n--------------------------------------------\n");

        // Builder
        System.out.println("Design Pattern: Builder");
        RefeicaoBuilder refeicaRecifense = new RefeicaoRecifense();
        ChefeDeRefeicao chefeDeRefeicao = new ChefeDeRefeicao(refeicaRecifense);
        chefeDeRefeicao.criarRefeicao();
        Refeicao refeicao = chefeDeRefeicao.getRefeicao();
        System.out.println(refeicao);

        System.out.println("\n");

        RefeicaoBuilder refeicaMineira = new RefeicaoMineira();
        chefeDeRefeicao = new ChefeDeRefeicao(refeicaMineira);
        chefeDeRefeicao.criarRefeicao();
        refeicao = chefeDeRefeicao.getRefeicao();
        System.out.println(refeicao);

        System.out.println("\n--------------------------------------------\n");

        // Observer
        System.out.println("Design Pattern: Observer");
        RockShowNotifier notifier = new RockShowNotifier();
        notifier.register(new RockBandFan("Maria"));
        System.out.println("Maria é fã de banda de Rock.");
        notifier.register(new RockBandFan("Raquel"));
        System.out.println("Raquel é fã de banda de Rock.");
        notifier.register(new RockBandFan("Helena"));
        System.out.println("Helena é fã de banda de Rock.\n");
        System.out.println("Banda de Rock anuncia datas de shows...\n");
        notifier.bandaAnunciaShow();

        System.out.println("\n--------------------------------------------\n");

    }
}
