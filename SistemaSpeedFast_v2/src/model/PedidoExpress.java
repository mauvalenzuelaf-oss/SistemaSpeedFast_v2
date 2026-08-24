package model;

/**
 * Representa un pedido express del sistema SpeedFast.
 * Tiene un tiempo base de 10 minutos y agrega tiempo extra
 * cuando la distancia supera los 5 kilómetros.
 */
public class PedidoExpress extends Pedido {

    // Constantes propias
    private static final int TIEMPO_BASE = 10;
    private static final int LIMITE_DISTANCIA = 5;
    private static final int TIEMPO_EXTRA = 5;

    /**
     * Construye un pedido express.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega dirección donde se entregará el pedido
     * @param distanciaKm distancia de entrega expresada en kilómetros
     */
    public PedidoExpress(int idPedido, String direccionEntrega, int distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcula el tiempo estimado de entrega para un pedido express.
     * Si la distancia supera los 5 kilómetros, agrega 5 minutos
     * al tiempo base.
     *
     * @return tiempo estimado de entrega en minutos
     */
    @Override
    public int calcularTiempoEntrega() {
        if (getDistanciaKm() > LIMITE_DISTANCIA) {
            return TIEMPO_BASE + TIEMPO_EXTRA;
        }

        return TIEMPO_BASE;
    }
}
