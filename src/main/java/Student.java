import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //getter, stter, requiredargsconstructor, tostring, equalshashcode
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    private long numerIndeksu;
    private String imie, nazwisko;

}
