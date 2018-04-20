package com.example.BirdApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "birds")
@Data
public class Bird {
    private int id;
    private String species;
    private String image;
    private String sound;

    private String taxOrder;
    private String family;
    private String allUSCanada;
    private String upperMidwest;
    private String greatPlains;
    private String rockyMountains;
    private String pacificNorthwest;

    Bird() {}

    Bird(int id, String species, String image, String sound) {
        this.id = id;
        this.species = species;
        this.image = image;
        this.sound = sound;
    }

    Bird(Integer id, String species, String image, String sound, String tax_order, String family, String allUSCanada, String upperMidwest, String greatPlains, String rockyMountains, String pacificNorthwest) {
        this.id = id;
        this.species = species;
        this.image = image;
        this.sound = sound;

        this.taxOrder = taxOrder;
        this.family = family;
        this.allUSCanada = allUSCanada;
        this.upperMidwest = upperMidwest;
        this.greatPlains = greatPlains;
        this.rockyMountains = rockyMountains;
        this.pacificNorthwest = pacificNorthwest;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue // in pluralsight, he used @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    @Column(name = "species", nullable = false)
    public String getSpecies() { return this.species; }
    public void setSpecies(String species) { this.species = species; }

    @Column(name = "image", nullable = false)
    public String getImage() { return this.image; }
    public void setImage(String image) { this.image = image; }

    @Column(name = "sound", nullable = false)
    public String getSound() { return this.sound; }
    public void setSound(String sound) { this.sound = sound; }

//    private String webpage;
//    private boolean included;

    @Column(name = "tax_order")
    public String getTaxOrder() { return this.taxOrder; }
    public void setTaxOrder(String taxOrder) { this.taxOrder = taxOrder; }

    @Column(name = "family")
    public String getFamily() { return this.family; }
    public void setFamily(String family) { this.family = family; }

//    @Column(name = "webpage")
//    public String getWebpage() { return this.webpage; }
//    public void setWebpage(String webpage) { this.webpage = webpage; }

//    @Column(name = "included")
//    public Boolean isIncluded() { return this.included; }
//    public void setIncluded() { this.included = included; }

//    @Enumerated(EnumType.STRING)
//    @Column(name="us_can", columnDefinition = "ENUM('win', 'sum', 'mig', 'all')")
    @Column(name="us_can")
    public String getAllUSCanada() { return allUSCanada; }
    public void setAllUSCanada(String allUSCanada) { this.allUSCanada = allUSCanada; }

//    @Enumerated(EnumType.STRING)
//    @Column(name="up_mw", columnDefinition = "ENUM('win', 'sum', 'mig', 'all')")
    @Column(name="up_mw")
    public String getUpperMidwest() { return upperMidwest; }
    public void setUpperMidwest(String upperMidwest) { this.upperMidwest = upperMidwest; }

//    @Enumerated(EnumType.STRING)
//    @Column(name="grt_pl", columnDefinition = "ENUM('win', 'sum', 'mig', 'all')")
    @Column(name="grt_pl")
    public String getGreatPlains() { return greatPlains; }
    public void setGreatPlains(String greatPlains) { this.greatPlains = greatPlains; }

//    @Enumerated(EnumType.STRING)
//    @Column(name="rk_mtn", columnDefinition = "ENUM('win', 'sum', 'mig', 'all')")
    @Column(name="rk_mtn")
    public String getRockyMountains() { return rockyMountains; }
    public void setRockyMountains(String rockyMountains) { this.rockyMountains = rockyMountains; }

//    @Enumerated(EnumType.STRING)
//    @Column(name="pac_nw", columnDefinition = "ENUM('win', 'sum', 'mig', 'all')")
    @Column(name="pac_nw")
    public String getPacificNorthwest() { return pacificNorthwest; }
    public void setPacificNorthwest(String pacificNorthwest) { this.pacificNorthwest = pacificNorthwest; }
}
