import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Representa un boleto de entrada para el museo.
 * Cada boleto tiene un precio, un número de serie único y una fecha de emisión.
 * * @author Tu Nombre Completo
 * @version 1.0 (25 de septiembre de 2025)
 */
public class BoletoMuseo {
    /**
     * El precio del boleto.
     */
    private double precio;
    /**
     * El número de identificación único para cada boleto.
     */
    private int numeroBoleto;
    /**
     * La fecha en que el boleto fue emitido, en formato yyyy-MM-dd.
     */
    private String fechaEmision;
    /**
     * Un contador estático para generar números de boleto únicos.
     */
    private static int contador = 0;
    /**
     * Constructor para crear un nuevo objeto BoletoMuseo.
     * Incrementa el contador global y asigna un número de boleto único.
     * * @param precio El precio de venta del boleto.
     */
    public BoletoMuseo(double precio) {
        this.precio = precio;
        contador++;
        this.numeroBoleto = contador;
        this.fechaEmision = establecerFechaEmisionBoleto();
    }
    /**
     * Establece la fecha de emisión del boleto con la fecha actual del sistema.
     * * @return La fecha actual formateada como una cadena de texto ("yyyy-MM-dd").
     */
    private String establecerFechaEmisionBoleto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    /**
     * Obtiene el valor actual del contador de boletos.
     * * @return El número total de boletos que han sido creados.
     */
    public static int getContador() {
        return contador;
    }
    /**
     * Obtiene el número de este boleto específico.
     * * @return El número de boleto.
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }
    /**
     * Obtiene el precio de este boleto.
     * * @return El precio del boleto.
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Devuelve una representación en formato de texto del objeto BoletoMuseo.
     * * @return Una cadena de texto con los detalles del boleto.
     */
    @Override
    public String toString() {
        String msg = "BoletoMuseo\n";
        msg += " Numero: " + numeroBoleto + "\n";
        msg += " Precio: " + precio + "\n";
        msg += " Fecha Emision: " + fechaEmision;
        return msg;
    }
}
