package model;

/**
 * Representa un pedido genérico del sistema SpeedFast.
 * Contiene los datos comunes de todos los tipos de pedidos
 * y define la estructura para calcular su tiempo de entrega.
 */
public abstract class Pedido {

    // Atributos
    private int idPedido;
    private String direccionEntrega;
    private int distanciaKm;

    /**
     * Construye un pedido con sus datos principales.
     *
     * @param idPedido identificador del pedido
     * @param direccionEntrega dirección donde se entregará el pedido
     * @param distanciaKm distancia de entrega expresada en kilómetros
     */
    public Pedido(int idPedido, String direccionEntrega, int distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    /**
     * Muestra un resumen con los datos básicos del pedido.
     */
    public void mostrarResumen() {
        System.out.println(getClass().getSimpleName()
                + " #" + String.format("%03d", idPedido));
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
    }

    /**
     * Calcula el tiempo estimado de entrega del pedido.
     * Cada subclase debe implementar su propia lógica.
     *
     * @return tiempo estimado de entrega en minutos
     */
    public abstract int calcularTiempoEntrega();

    // Getters y Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public int getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }
}
