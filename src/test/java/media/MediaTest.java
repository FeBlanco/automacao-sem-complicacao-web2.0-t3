package media;

import br.com.chronosAcademy.Media;
import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {
    @Test //anotação
    public void validaAprovado() {
        Media media = new Media();
        String resultado = media.calculaMedia(5.0,5.0);
        assertEquals("Aprovado", resultado);
    }
    @Test //anotação
    public void validaReprovado() {
        Media media = new Media();
        String resultado = media.calculaMedia(4.9,5.0);
        assertEquals("Reprovado", resultado);
    }

}