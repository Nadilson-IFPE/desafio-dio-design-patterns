package dio.design.pattern.criacionais.builder;

public class Refeicao {
    private String pratoTipico;
    private String pratoPrincipal;
    private String sobremesa;

    public String getPratoTipico() {
        return pratoTipico;
    }

    public void setPratoTipico(String pratoTipico) {
        this.pratoTipico = pratoTipico;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    @Override
    public String toString() {
        return "REFEICAO SOLICITADA:\n" +
                "Prato típico: '" + pratoTipico + '\'' +
                ";\nPrato principal: '" + pratoPrincipal + '\'' +
                ";\nSobremesa: '" + sobremesa + '\'' +
                '}';
    }
}
