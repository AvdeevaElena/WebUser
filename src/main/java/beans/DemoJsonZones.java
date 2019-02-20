package beans;

import javax.ejb.Stateful;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static JsonLogic.pushJson.JsonZone;

@Stateful
public class DemoJsonZones {



    public List<JsonDTO> demoListOfJsonZones() {
        List<JsonDTO> respuesta = new ArrayList<JsonDTO>(); // !! ноль не нужен был
        JsonDTO json = null;
        try {
              json = new JsonDTO();
              json.zones = JsonZone();

            System.out.println( json.zones );

        } catch (IOException e) { e.printStackTrace(); }
        respuesta.add(json);

        return  respuesta;
    }
}