import java.util.HashMap;
import java.util.Map;

public class Holydaizer {
    private Map<String,String> holydays= this.createHolydays();
    private Map<String,String> createHolydays(){
            Map<String,String> holydaysList = new HashMap<String,String>();
            holydaysList.put("01/01/2023","Confraternização mundial");
            holydaysList.put("21/02/2023","Carnaval");
            holydaysList.put("17/04/2023","Páscoa");
            holydaysList.put("21/04/2023","Tiradentes");
            holydaysList.put("01/05/2023","Dia do trabalho");
            holydaysList.put("08/06/2023","Corpus Christi");
            holydaysList.put("07/09/2023","Independência do Brasil");
            holydaysList.put("12/10/2023","Nossa Senhora Aparecida");
            holydaysList.put("02/11/2023","Finados");
            holydaysList.put("15/11/2023","Proclamação da República");
            holydaysList.put("25/12/2023","Natal");
            return holydaysList;
    }

    public Map<String, String> getAllHolydays() {
        return holydays;
    }
    public String getHolyday(String date) {
        return holydays.getOrDefault(date, "Uma data comum, não há feriado nesse data!");

    }
}


