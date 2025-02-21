package cuentas;

/**
 * Clase que representa una cuenta bancaria en la que pueden hacerse operaciones de ingreso y retiro de dinero.
 */
public class CCuenta {

	/** Nombre del titular de la cuenta */
    private String nombre;
    
    /** Número de cuenta bancaria */
    private String cuenta;
    
    /** Saldo existente en la cuenta */
    private double saldo;
    
    /** Tipo de interés que tiene la cuenta */
    private double tipoInterés;

    /**
     * Constructor vacío de la clase CCuenta.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor para generar una cuenta bancaria con parámetros.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta bancaria.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés que tiene la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Obtener el tipo de interés de la cuenta.
     * @return Tipo de interés.
     */
    private double getTipoInterés() {
		return tipoInterés;
	}

    /**
     * Establecer el tipo de interés de la cuenta.
     * @param tipoInterés Nuevo tipo de interés.
     */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Obtener saldo actual de la cuenta.
	 * @return Saldo disponible.
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Establecer nuevo saldo de la cuenta.
	 * @param saldo Nuevo saldo de la cuenta.
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Obtener número de cuenta.
	 * @return Número de cuenta bancaria.
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Establecer nuevo número de cuenta.
	 * @param cuenta Nuevo número de cuenta.
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Obtener nombre del titular de la cuenta.
	 * @return Nombre del titular.
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Establecer nuevo nombre del titular de la cuenta.
	 * @param nombre Nuevo nombre del titular.
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve el saldo actual de la cuenta.
	 * @return Saldo actual de la cuenta.
	 */
	public double estado()
    {
        return getSaldo();
    }

	/**
	 * Método para ingresar dinero en la cuenta.
	 * @param cantidad Cantidad a ingresar (debe ser mayor que 0).
	 * @throws Exception Si la cantidad es negativa.
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero de la cuenta.
     * @param cantidad Cantidad a retirar (debe ser mayor que 0 y menor o igual al saldo disponible).
     * @throws Exception Si la cantidad es negativa o mayor que el saldo disponible.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
