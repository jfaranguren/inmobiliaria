package model;

public class Edificio {

    private Apartamento[] apartamentos;

    public Edificio(int numeroApartamentos) {
        apartamentos = new Apartamento[numeroApartamentos];
    }

    public Apartamento[] getApartamentos() {
        return apartamentos;
    }

    /**
     * Descripcion: Añade un nuevo apartamento al arreglo apartamentos
     * pre: El arreglo apartamentos debe estar inicializado
     * pos: El arreglo apartamentos queda modificado con el nuevo apartamento
     * agregado
     * 
     * @param nuevoApartamento Apartamento El apartamento que se va a añadir
     * @return boolean True si se logra añadir el apartamento, False en caso
     *         contrario
     */
    public boolean agregarApartamento(Apartamento nuevoApartamento) {

        return false;
    }

    /**
     * Descripcion: Calcula el numero de apartamentos disponibles en el Edificio
     * pre: El arreglo apartamentos debe estar inicializado
     * 
     * @return int El numero de apartamentos disponibles en el Edificio
     */
    public int calcularApartamentosDisponibles() {

        return 0;

    }

    /**
     * Descripcion: Calcula el valor en dinero correspondiente al arrendamiento
     * mensual de todos los apartamentos en el Edificio
     * pre: El arreglo apartamentos debe estar inicializado
     * 
     * @return double El valor monetario correspondiente al total de arrendamiento
     *         de todos los apartamentos del Edificio
     */
    public double calcularValorArrendamientoMensual() {

        return 0;
    }

}
