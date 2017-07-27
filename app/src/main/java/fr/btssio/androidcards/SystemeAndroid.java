package fr.btssio.androidcards;

public class SystemeAndroid {

    private int image;
    private String nom;
    private String version;

    public SystemeAndroid(int image, String nom, String version) {
        this.image = image;
        this.nom = nom;
        this.version = version;
    }

    public String getNom() {
        return nom;
    }

    public String getVersion() {
        return version;
    }

    public int getImage() {
        return image;
    }
}
