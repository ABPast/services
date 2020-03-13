package com.example.service;

public class Constantes {
    /**
     * Transición Home -> Detalle
     */
    public static final int CODIGO_DETALLE = 100;
    /**
     * Transición Detalle -> Actualización
     */
    public static final int CODIGO_ACTUALIZACION = 101;
    /**
     * Puerto que utilizas para la conexión.
     * Dejalo en blanco si no has configurado esta carácteristica.
     */
    private static final String PUERTO_HOST = "63343";
    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "http://192.168.1.72:";
    /**
     * URLs del Web Service
     */
    public static final String GET = IP + PUERTO_HOST +
            "/I%20Wish/obtener_metas.php";
    public static final String GET_BY_ID = IP + PUERTO_HOST +
            "/I%20Wish/obtener_meta_por_id.php";
    public static final String UPDATE = IP + PUERTO_HOST +
            "/I%20Wish/actualizar_meta.php";
    public static final String DELETE = IP + PUERTO_HOST +
            "/I%20Wish/borrar_meta.php";
    public static final String INSERT = IP + PUERTO_HOST +
            "/I%20Wish/insertar_meta.php";
    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
    public static final String EXTRA_ID = "IDEXTRA";
}
