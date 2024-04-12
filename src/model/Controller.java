package model;

public class Controller {

    private Edificio[] edificios;

    public Controller() {

        edificios = new Edificio[50];

    }

    /**
     * Descripcion: Permite crear y añadir un Edificio en el sistema
     * 
     * @return boolean True si se logra añadir el Edificio, False en caso
     *         contrario
     */
    public boolean registrarEdificio() {

        return false;
    }

    /**
     * Descripcion: Permite crear y añadir un Apartamento a un Edificio en el
     * sistema
     * 
     * @return boolean True si se logra añadir el Apartamento al Edificio, False en
     *         caso contrario
     */
    public boolean registrarApartamentoEnEdificio() {

        return false;
    }

    /**
     * Descripcion: Retorna el numero de apartamentos disponibles en un Edificio
     * determinado
     * pre: El arreglo Edificios debe estar inicializado
     * 
     * @return int El numero de apartamentos disponibles en el Edificio
     */
    public int consultarApartamentosDisponiblesEnEdificio() {

        return 0;
    }

    /**
     * Descripcion: Calcula el valor en dinero correspondiente al arrendamiento
     * mensual de todos los Edificios
     * pre: El arreglo edificios debe estar inicializado
     * 
     * @return double El valor monetario correspondiente al total de arrendamiento
     *         de todos los Edificios
     */
    public double consultarValorMensualArrendamiento() {

        return 0;

    }

}