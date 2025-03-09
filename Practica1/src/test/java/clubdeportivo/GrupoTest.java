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
    @Test
    public void actualizarPlazas_returnNumPlazas_MenorqueCero() throws ClubException{
        grupoTest.actualizarPlazas(-3);
        // no se que poner para que salte el error
    }
    @Test
    public void actualizarPlazas_returnNumPlazas_IgualqueCero() throws ClubException{
        grupoTest.actualizarPlazas(0);
        // no se que poner para que salte el error
    }
    @Test
    public void actualizarPlazas_returnNumPlazas_NumMatriculadosMayorN() throws ClubException{
        grupoTest.actualizarPlazas(4);
        // no se que poner para que salte el error
    }



    @Test
    public void matricular_returnNumPlazas_MayorqueCero_MenorPlazasLibres() throws ClubException{
        //Hacemos que se matriculen siendo menos que las plazas libres
        grupoTest.matricular(4);

        //Comprobamos
        assertEquals(grupoTest.plazasLibres(),1);
    }

    @Test
    public void matricular_returnNumPlazas_MayorPlazasLibres() throws ClubException{
        //Hacemos que se matriculen siendo menos que las plazas libres
        grupoTest.matricular(7);
        // no se que poner para que salte el error
    }

    @Test
    public void matricular_returnNumPlazas_MenorqueCero() throws ClubException{
        //Hacemos que se matriculen siendo menos que las plazas libres
        grupoTest.matricular(-3);

        // no se que poner para que salte el error
    }

    @Test
    public void matricular_returnNumPlazas_IgualqueCero() throws ClubException{
        //Hacemos que se matriculen siendo menos que las plazas libres
        grupoTest.matricular(0);
        // no se que poner para que salte el error
    }
}
