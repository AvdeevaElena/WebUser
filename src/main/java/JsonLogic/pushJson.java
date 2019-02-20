package JsonLogic;

import org.json.JSONObject;

import java.io.IOException;

public  class pushJson {
    public static String JsonZone() throws IOException {


        JSONObject jsonOut = new JSONObject();
        JSONObject jsonIn = getJSON.readJsonFromUrl("http://94.140.216.17:8888/");

        jsonOut.put("Zone1", jsonIn.get("Zone1").toString());
        jsonOut.put("Zone2", jsonIn.get("Zone2").toString());
        jsonOut.put("Zone3", jsonIn.get("Zone3").toString());


        String jsonInfo = jsonOut.toString();

        return jsonInfo;
    }

    public static void main(String[] args) throws IOException {

        System.out.println( JsonZone());
    }

}
