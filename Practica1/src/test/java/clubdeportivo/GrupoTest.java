package clubdeportivo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrupoTest {
    public Grupo grupoTest;
    @BeforeEach
    public void setup() throws ClubException{
        grupoTest = new Grupo("B123","Pilates", 10, 5, 39.0);
    }

    @Test
    public void actualizarPlazas_returnNumPlazas_NumPlazasActualizado() throws ClubException{
        //Arrange: Dado un grupo grupoTest inicializado en setup()

        //Cambiamos el número de plazas
        grupoTest.actualizarPlazas(13);

        //Comprobamos
        assertEquals(grupoTest.getPlazas(),13);
    }
}
