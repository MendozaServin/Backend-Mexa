package a.lo.mexa.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "comida_caliente")
public class HotFood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;

    String nombre;
    String mix;
    String descripcion;

    public HotFood() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getMix() {
        return mix;
    }

    public void setMix(String mix) {
        this.mix = mix;
    }

    public String getDescription() {
        return descripcion;
    }

    public void setDescription(String descripcion) {
        this.descripcion = descripcion;
    }
}
