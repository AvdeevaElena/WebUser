package beans;


import javax.servlet.http.HttpSession;
import java.util.List;

public class DataTransferObject {
    public static DataTransferObject get(HttpSession session) {
        DataTransferObject bean = (DataTransferObject) session.getAttribute("dto");
        if (bean == null) {
            bean = new DataTransferObject();
            session.setAttribute("dto", bean);
        }
        return bean;
    }


    private List<JsonDTO> listOfJsonZones= null;
    public List<JsonDTO> getListOfJsonZones() { return listOfJsonZones; }
    public void setListOfJsonZones(List<JsonDTO> listOfJsonZones) { this.listOfJsonZones = listOfJsonZones; }
}