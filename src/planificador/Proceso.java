package planificador;

public class Proceso {
    //Declaro las variables necesarias
    private final String nombre;
    private final int llegada;
    private final int rafaga;
    private int tiempoRestante;
    private EstadoProceso estado;
    private int instanteFin;
    private int instantePrimeraEjecucion;

    //Declaro el constructor principal
    public Proceso(String nombre, int llegada, int rafaga) {
        this.nombre = nombre;
        this.llegada = llegada;
        this.rafaga = rafaga;
        this.tiempoRestante = rafaga;
        this.estado = EstadoProceso.NUEVO;
        this.instanteFin = -1;
        this.instantePrimeraEjecucion = -1;
    }

    //Constructor que permite clonar un proceso con sus valores iniciales.
    //Así, al ejecutar varios algoritmos seguidos (opción 'todos'), cada uno
    //trabaja sobre una copia limpia sin alterar los datos originales.
    public Proceso(Proceso otroProceso) {
        this.nombre = otroProceso.nombre;
        this.llegada = otroProceso.llegada;
        this.rafaga = otroProceso.rafaga;
        this.tiempoRestante = otroProceso.rafaga;
        this.estado = EstadoProceso.NUEVO;//setter
        this.instanteFin = -1;
        this.instantePrimeraEjecucion = -1;
    }

    //Declaro los getters

    public String getNombre() {
        return nombre;
    }

    public int getLlegada() {
        return llegada;
    }

    public int getRafaga() {
        return rafaga;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public EstadoProceso getEstado() {
        return estado;
    }

    // Setter para establecer el estado
    public void setEstado(EstadoProceso estado) {
        this.estado = estado;
    }

    public int getInstanteFin() {
        return instanteFin;
    }

    public int getInstantePrimeraEjecucion() {
        return instantePrimeraEjecucion;
    }

    // Getter para obtener el tiempo de respuesta
    public int getTiempoRespuesta() {
        return instantePrimeraEjecucion - llegada;
    }

    // Getter para obtener el tiempo de retorno
    public int getTiempoRetorno() {
        return instanteFin - llegada;
    }

    // Getter para obtener el tiempo de espera, llamando al getter getTiempoRetorno() y restándole la rafaga
    public int getTiempoEspera() {
        return getTiempoRetorno() - rafaga;
    }


}



