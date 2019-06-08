package Autostra;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Autostrada {
//Mapa w ktorej przechowujemy pojazdy
    //dla szybkiego wyszukiwania kluczem w mapiejest jego nr rejstracyjny
    private Map<String, InformacjeOPojezdzie> mapaPojazdow = new HashMap<>();

    void wjazdPojazduNaAutostrade(String numerRejstracyjny, TypPojazdu typPojazdu){
        InformacjeOPojezdzie informajceOPojezdize = new InformacjeOPojezdzie((numerRejstracyjny, typPojazdu, LocalDateTime.now()));
        mapaPojazdow.put(numerRejstracyjny, informajceOPojezdize);
        System.out.println("Pojazd " + informajceOPojezdize + "Wjechal na autostrade");
    }

    public InformacjeOPojezdzie znajdzPojazd(String numerRejstacyjny){
        if(mapaPojazdow.containsKey(numerRejstacyjny)){
            return mapaPojazdow.get(numerRejstacyjny);
        }
        throw new NieMoznaZnalezcPojazduException();
    }

    public Double wyjazdPojazdu(String numerRejstracyjny){
        if(!mapaPojazdow.containsKey(numerRejstracyjny)){
            throw new NieMoznaZnalezcPojazduException();
        }

        InformacjeOPojezdzie informacjeOPojezdzie = mapaPojazdow.get(numerRejstracyjny);

        Duration dlugoscPrzejazdu = Duration.between(informacjeOPojezdzie)
    }

}
