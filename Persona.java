/**
 * Representa a una persona que visita el museo.
 * Una persona tiene nombre, identificación y puede tener un boleto de museo asignado.
 * * @author Tu Nombre Completo
 * @version 1.0 (25 de septiembre de 2025)
 */
public class Persona {
    /**
     * El nombre de la persona.
     */
    private String nombre;
    
    /**
     * El número de identificación de la persona.
     */
    private String identificacion;
    
    /**
     * El boleto de museo que ha sido asignado a esta persona (relación de asociación).
     */
    private BoletoMuseo miBoleto;

    /**
     * Constructor que inicializa una persona con nombre e identificación.
     * * @param nombre El nombre de la persona.
     * @param ident El número de identificación de la persona.
     */
    public Persona(String nombre, String ident) {
        this(nombre);
        identificacion = ident;
    }
    
    /**
     * Constructor que inicializa una persona solo con su nombre.
     * * @param nombre El nombre de la persona.
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece o actualiza el número de identificación de la persona.
     * * @param pIdentificacion El nuevo número de identificación.
     */
    public void setIdentificacion(String pIdentificacion) {
        identificacion = pIdentificacion;
    }

    /**
     * Asigna un objeto BoletoMuseo a esta persona.
     * * @param pMiBoleto El boleto que se le va a asignar.
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
        miBoleto = pMiBoleto;
    }

    /**
     * Consulta el número del boleto asignado a la persona.
     * * @return El número del boleto. Lanza una excepción si no hay boleto asignado.
     */
    public int consultarMiNumeroDeBoleto() {
        return miBoleto.getNumeroBoleto();
    }

    /**
     * Devuelve una representación en formato de texto del objeto Persona.
     * * @return Una cadena de texto con los detalles de la persona y su boleto.
     */
    public String toString() {
        String msg = "Persona\n";
        msg += " Nombre: " + nombre + "\n";
        msg += " Identificacion: " + identificacion + "\n";
        if (miBoleto != null) {
            msg += " Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
        } else {
            msg += " Boleto asignado: (ninguno)\n";
        }
        return msg;
    }
}