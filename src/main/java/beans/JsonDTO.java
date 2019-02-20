package beans;

import java.io.IOException;

import static JsonLogic.pushJson.JsonZone;

public class JsonDTO {
    public JsonDTO() throws IOException { }
    public String getZones() { return zones;}
    public void setZones(String zones) { this.zones = zones; }

    public String zones = JsonZone();



}

