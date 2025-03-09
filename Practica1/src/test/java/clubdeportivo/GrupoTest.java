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
    public void actualizarPlazas_returnNumPlazas_MayorqueCero() throws ClubException{
        //Arrange: Dado un grupo grupoTest inicializado en setup()

        //Cambiamos el número de plazas
        grupoTest.actualizarPlazas(13);

        //Comprobamos
        assertEquals(grupoTest.getPlazas(),13);
    }

    public void actualizarPlazas_returnNumPlazas_MenorqueCero() throws ClubException{
        grupoTest.actualizarPlazas(-3);
        // no se que poner para que salte el error
    }

    public void actualizarPlazas_returnNumPlazas_IgualqueCero() throws ClubException{
        grupoTest.actualizarPlazas(0);
        // no se que poner para que salte el error
    }

    public void actualizarPlazas_returnNumPlazas_NumMatriculadosMayorN() throws ClubException{
        grupoTest.actualizarPlazas(5);
        // no se que poner para que salte el error
    }
}
