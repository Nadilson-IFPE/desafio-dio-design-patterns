package dio.design.pattern.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class RockShowNotifier {
    List<RockBandFan> fans = new ArrayList<RockBandFan>();

    public void register(RockBandFan fan) {
        fans.add(fan);
    }

    public void bandaAnunciaShow() {
        for(RockBandFan fan: fans) {
            fan.avisar();
        }
    }


}
