package br.ufmg.coltec.e03;

public class ProgrammingLocal {

    private String name;        // nome do local
    private Integer photoId;    // id da foto do local
    private Double distance;    // distância (em km)
    private String descricao;
    private Double rate;

    public ProgrammingLocal(String name, Integer photoId, Double distance, String descricao, Double rate){
        this.name = name;
        this.photoId = photoId;
        this.distance = distance;
        this.descricao = descricao;
        this.rate = rate;
    }


    /**
     * Construtor padrão
     */
    public ProgrammingLocal() {
        this(null, null, null, null, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoName(Integer photoId) {
        this.photoId = photoId;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}


