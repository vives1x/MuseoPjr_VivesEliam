import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa el registro de todas las ventas de boletos realizadas en un día.
 * Juega el papel del TODO en una relación de agregación con BoletoMuseo.
 * * @author Tu Nombre Completo
 * @version 1.0 (25 de septiembre de 2025)
 */
public class VentaDelDia {
    /**
     * La fecha para la cual se está registrando la venta.
     */
    private String fechaDeLaVenta;
    
    /**
     * Una lista que almacena todos los boletos vendidos durante el día (relación de agregación).
     */
    private List<BoletoMuseo> boletosVendidos;

    /**
     * Constructor para la clase VentaDelDia.
     * Inicializa la lista de boletos y establece la fecha de venta a la fecha actual.
     */
    public VentaDelDia() {
        fechaDeLaVenta = establecerFechaDeLaVenta();
        boletosVendidos = new ArrayList<>();
    }

    /**
     * Agrega un boleto a la lista de boletos vendidos del día.
     * * @param boleto El objeto BoletoMuseo que se va a registrar.
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) {
        boletosVendidos.add(boleto);
    }

    /**
     * Calcula el ingreso total sumando los precios de todos los boletos vendidos.
     * * @return El monto total de la venta del día.
     */
    public double calcularTotalVentaDelDia() {
        double total = 0.0;
        for (BoletoMuseo b : boletosVendidos) {
            total += b.getPrecio();
        }
        return total;
    }

    /**
     * Establece la fecha de la venta con la fecha actual del sistema.
     * * @return La fecha actual formateada como una cadena de texto ("yyyy-MM-dd").
     */
    private String establecerFechaDeLaVenta() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }

    /**
     * Devuelve una representación en formato de texto del objeto VentaDelDia.
     * * @return Un resumen de la venta del día, incluyendo la cantidad de boletos y el total.
     */
    public String toString() {
        String msg = "VentaDelDia\n";
        msg += " Fecha: " + fechaDeLaVenta + "\n";
        msg += " Cantidad de boletos: " + boletosVendidos.size() + "\n";
        msg += " Detalle:\n";
        for (BoletoMuseo b : boletosVendidos) {
            msg += " - Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n";
        }
        msg += " Total: " + calcularTotalVentaDelDia();
        return msg;
    }
}