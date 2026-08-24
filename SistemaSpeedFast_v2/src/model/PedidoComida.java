package model;

/**
 * Representa un pedido de comida del sistema SpeedFast.
 * Su tiempo de entrega depende de una base de 15 minutos
 * más 2 minutos por cada kilómetro de distancia.
 */
public class PedidoComida extends Pedido {

    // Constantes propias
    private static final int TIEMPO_BASE = 15;
    private static final int MINUTOS_POR_KM = 2;

    /**
     * Construye un pedido de comida.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega dirección donde se entregará el pedido
     * @param distanciaKm distancia de entrega expresada en kilómetros
     */
    public PedidoComida(int idPedido, String direccionEntrega, int distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcula el tiempo estimado de entrega para un pedido de comida.
     *
     * @return tiempo estimado de entrega en minutos
     */
    @Override
    public int calcularTiempoEntrega() {
        return TIEMPO_BASE + (MINUTOS_POR_KM * getDistanciaKm());
    }
}
