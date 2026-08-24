package app;

import model.Pedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

/**
 * Clase principal del sistema SpeedFast.
 * Permite probar la jerarquía de pedidos y calcular
 * sus respectivos tiempos estimados de entrega.
 */
public class Main {

    public static void main(String[] args) {

        // Creación de objetos mediante referencias polimórficas
        Pedido[] pedidos = {
                new PedidoComida(1, "Av. Italia 456", 4),
                new PedidoEncomienda(2, "Av. Independencia 123", 6),
                new PedidoExpress(3, "Av. Apoquindo 1500", 7)
        };

        for (Pedido pedido : pedidos) {
            pedido.mostrarResumen();

            System.out.println(
                    "Tiempo estimado de entrega: "
                            + pedido.calcularTiempoEntrega()
                            + " minutos"
            );

            System.out.println();
        }
    }
}