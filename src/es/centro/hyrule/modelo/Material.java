package es.centro.hyrule.modelo;

public class Material {
    private String nombre;
    private TipoMaterial tipo;
    private int bonificacionDeDanioAlFusionarlo;
    private int corazonesQueCuraAlCocinarlo;


    public Material(String nombre, TipoMaterial tipo, int bonificacionDeDanioAlFusionarlo, int corazonesQueCuraAlCocinarlo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.bonificacionDeDanioAlFusionarlo = bonificacionDeDanioAlFusionarlo;
        this.corazonesQueCuraAlCocinarlo = corazonesQueCuraAlCocinarlo;
    }
}
