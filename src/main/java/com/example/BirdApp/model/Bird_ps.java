package com.example.BirdApp.model;

import javax.persistence.*;


/**
 * Created by araam on 9/14/17.
 */
@Entity
@Table(name = "birds")
public class Bird_ps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String species;
    private String image;
    private String sound;

    private String tax_order;
    private String family;
    private String us_can;
    private String up_mw;
    private String grt_pl;
    private String rk_mtn;
    private String pac_nw;

    public Bird_ps() { }

    public Bird_ps(Integer id, String species, String image, String sound) {
        this.id = id;
        this.species = species;
        this.image = image;
        this.sound = sound;
    }

    public Bird_ps(Integer id, String species, String image, String sound, String tax_order, String family, String us_can, String up_mw, String grt_pl, String rk_mtn, String pac_nw) {
        this.id = id;
        this.species = species;
        this.image = image;
        this.sound = sound;

        this.tax_order = tax_order;
        this.family = family;
        this.us_can = us_can;
        this.up_mw = up_mw;
        this.grt_pl = grt_pl;
        this.rk_mtn = rk_mtn;
        this.pac_nw = pac_nw;
    }
    
    public Integer getIdbirds() {
        return id;
    }

    public void setIdbirds(Integer id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getTaxOrder() { return tax_order; }
    public void setTaxOrder(String tax_order) { this.tax_order = tax_order; }

    public String getFamily() { return family; }
    public void setFamily(String family) { this.family = family; }

    public String getAllUSCanada() { return us_can; }
    public void setAllUSCanada(String us_can) { this.us_can = us_can; }

    public String getUpperMidwest() { return up_mw; }
    public void setUpperMidwest(String up_mw) { this.up_mw = up_mw; }

    public String getGreatPlains() { return grt_pl; }
    public void setGreatPlains(String grt_pl) { this.grt_pl = grt_pl; }

    public String getRockyMountains() { return rk_mtn; }
    public void setRockyMountains(String rk_mtn) { this.rk_mtn = rk_mtn; }

    public String getPacificNorthwest() { return pac_nw; }
    public void setPacificNorthwest(String pac_nw) { this.pac_nw = pac_nw; }

}

