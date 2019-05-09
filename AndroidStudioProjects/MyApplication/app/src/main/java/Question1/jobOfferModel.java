package Question1;

public class jobOfferModel {
    private String poste;
    private String description;
    private float salaire;

    public jobOfferModel(String poste, String description, float salaire) {
        this.poste = poste;
        this.description = description;
        this.salaire = salaire;
    }

    public float getSalaire() {
        return salaire;
    }

    public String getDescription() {
        return description;
    }

    public String getPoste() {
        return poste;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }
}
