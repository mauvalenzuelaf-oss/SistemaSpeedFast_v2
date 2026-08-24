package model;

/**
 * Representa un pedido de encomienda del sistema SpeedFast.
 * Su tiempo de entrega depende de una base de 20 minutos
 * más 1.5 minutos por cada kilómetro de distancia.
 */
public class PedidoEncomienda extends Pedido {

    // Constantes propias
    private static final int TIEMPO_BASE = 20;
    private static final double MINUTOS_POR_KM = 1.5;

    /**
     * Construye un pedido de encomienda.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega dirección donde se entregará el pedido
     * @param distanciaKm distancia de entrega expresada en kilómetros
     */
    public PedidoEncomienda(int idPedido, String direccionEntrega, int distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcula el tiempo estimado de entrega para una encomienda
     * y ajusta el resultado a un número entero.
     *
     * @return tiempo estimado de entrega en minutos
     */
    @Override
    public int calcularTiempoEntrega() {
        return (int) Math.round(
                TIEMPO_BASE + (MINUTOS_POR_KM * getDistanciaKm())
        );
    }
}