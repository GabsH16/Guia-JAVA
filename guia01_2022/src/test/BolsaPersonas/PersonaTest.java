package BolsaPersonas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ues.occ.edu.sv.ingenieria.prn335.guia01_2022.entity.Persona;

/**
 *
 * @author gabi1
 */
public class PersonaTest {

    private static ArrayList<Persona> personas = new ArrayList<>();
    private static Persona persona;
    private static Persona personaPrueba;

    public PersonaTest() {
    }

    @Before
    public void init() {
        persona = new Persona(1, "jose", "osorio", "mi casa", "M", "1999/09/06", true, "chepe", "No", "soltero/a");
        personaPrueba = new Persona(2, "mario", "guzman", "casa azul", "M", "1998/09/06", true, "marito", "Nos", "soltero/a");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCreatePersona() {
        personas.add(persona);
    }


    @Test
    public void testGetDiferentId() {
        assertNotEquals(persona.getId_persona(), personaPrueba.getId_persona());
    }
    @Test
    public void testGetDifferentDireccion() {
        assertNotEquals(persona.getDireccion(), personaPrueba.getDireccion());
    }
}
