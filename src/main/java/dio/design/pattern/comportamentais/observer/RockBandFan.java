package dio.design.pattern.comportamentais.observer;

public class RockBandFan {
    private String fanName;

    public RockBandFan(String fanName) {
        this.fanName = fanName;
    }

    void avisar() {
      System.out.println(fanName + " foi notificado de que haverá shows da banda de Rock!");
    }
}
