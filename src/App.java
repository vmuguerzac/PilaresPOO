import com.vmuguerza.modelos.CuentaAhorros;
import com.vmuguerza.modelos.DepositoPlazoFijo;

public class App {
    public static void main(String[] args) throws Exception {
        CuentaAhorros cuentaAhorros = new CuentaAhorros();
        cuentaAhorros.setNumeroProducto("CH-001");
        cuentaAhorros.setMontoBase(2000);
        cuentaAhorros.mostrarResumen();

        DepositoPlazoFijo depositoPlazoFijo = new DepositoPlazoFijo();
        depositoPlazoFijo.setNumeroProducto("DPF-001");
        depositoPlazoFijo.setPlazoDias(400);
        depositoPlazoFijo.setMontoBase(5000);
        depositoPlazoFijo.mostrarResumen();
        
    }
}
