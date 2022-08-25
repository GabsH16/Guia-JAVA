package ues.occ.edu.sv.ingenieria.prn335.guia01_2022.control;

import com.sun.tools.javac.util.StringUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import ues.occ.edu.sv.ingenieria.prn335.guia01_2022.entity.Persona;

/**
 *
 * @author jose
 */
public class BolsaTrabajo {

    ArrayList<Persona> persona = new ArrayList<>();

    public BolsaTrabajo() {

        persona.add(new Persona(1, "jose", "osorio", "mi casa", "M", "1999/09/06", true, "chepe", "No", "soltero/a"));
        persona.add(new Persona(2, "jose", "clemente", "su casa", "M", "2000/01/03", true, "armando", "No", "soltero/a"));
        persona.add(new Persona(3, "carlos", "roberto", "candelaria", "M", "2001/09/04", true, "carlitos", "No", "soltero/a"));
        persona.add(new Persona(4, "cristiano", "ronaldo", "soyapango", "M", "1985/02/05", true, "el bicho", "No", "casado/a"));
        persona.add(new Persona(5, "leonel", "messi", "apopa", "M", "1987/05/24", true, "la pulga", "No", "casado/a"));

    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

    public Boolean AgregarPersona(int id_persona, String nombres, String apellidos, String direccion, String genero, String fecha_nacimiento, boolean jubilado, String conocido_por, String CapacidadesEspeciales, String EstadoCivil) {
        String year = String.format("%." + 4 + "s", fecha_nacimiento);
        /**
         * * * Validacion de campos vacios **
         */
        if (nombres.isEmpty() && apellidos.isEmpty() && direccion.isEmpty() && genero.isEmpty() && fecha_nacimiento.isEmpty()) {
            return false;
        } else if (jubilado == true) {
            return false;
        } else if (Integer.parseInt(year) < 2004) {
            return false;
        } else {
            try {
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                formatoFecha.setLenient(false);
                formatoFecha.parse(fecha_nacimiento);
            } catch (ParseException e) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Persona> BuscarPersonas(String nombre) {
        int posicion = persona.indexOf(nombre);
        if (posicion >= 0) {
            System.out.println(nombre + " está en la lista. En la posición " + posicion);
            return persona;
        } else {
            System.out.println(nombre + " no está en la lista");
            return null;
        }
    }
}
