/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ues.occ.edu.sv.ingenieria.prn335.guia01_2022.control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ues.occ.edu.sv.ingenieria.prn335.guia01_2022.entity.Persona;

/**
 *
 * @author gabi1
 */
public class BolsaTrabajoTest {

    BolsaTrabajo bolsa;
    Persona persona;
    private String fecha_nac;

    public BolsaTrabajoTest() {
    }

    @BeforeEach
    public void init() {
        persona = new Persona(1, "jose", "osorio", "mi casa", "M", "1999/09/06", true, "chepe", "No", "soltero/a");
        //persona = new Persona(1, "jose", "osorio", "mi casa", "M", "19/09/0685", true, "chepe", "No", "soltero/a");
        bolsa = new BolsaTrabajo();
        fecha_nac = new String();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetPersona() {
        /*We have 2 different bolsas de trabajo, por lo que estas deberian ser diferentes*/
        BolsaTrabajo b = new BolsaTrabajo();
        assertNotEquals(bolsa.getPersona(), b.getPersona());
    }

    @Test
    public void testFechaNac() throws ParseException {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        //But we are not using assert to Unit Test
        fecha_nac = persona.getFecha_nacimiento();
        formatoFecha.setLenient(false);
        formatoFecha.parse(fecha_nac);

    }

    @Test
    public void testAgregarPersona() {
        assertNotNull(
                bolsa.AgregarPersona(8, "Carlos", "Guzman", "Calle 1 y 2",
                        "Masculino", "2000/10/05", true, "Carlitos", "No", "Soltero")
        );
    }
}
