package Autostra;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //getter, stter, requiredargsconstructor, tostring, equalshashcode
@AllArgsConstructor
@NoArgsConstructor

public class InformacjeOPojezdzie {

   private String nrRej;
   private TypPojazdu typPojazdu;
   private LocalDateTime dateTime;

   public InformacjeOPojezdzie(String nrRej, TypPojazdu typPojazdu) {
      this.nrRej = nrRej;
      this.typPojazdu = typPojazdu;
   }
}
