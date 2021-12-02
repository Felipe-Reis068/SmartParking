package model;


public class Estacionamento implements java.io.Serializable{
    

    private Integer codigo_vaga;
    private Integer numero_vaga;
    
    public Estacionamento() {
    }
    
    public Estacionamento(Integer codigo_vaga, Integer numero_vaga) {
        this.codigo_vaga = codigo_vaga;
        this.numero_vaga = numero_vaga;
    }
    
    public Integer getCodigo_vaga() {
        return codigo_vaga;
    }

    public Integer getNumero_vaga() {
        return numero_vaga;
    }

    public void setCodigo_vaga(Integer codigo_vaga) {
        this.codigo_vaga = codigo_vaga;
    }

    public void setNumero_vaga(Integer numero_vaga) {
        this.numero_vaga = numero_vaga;
    }
    
    

}
