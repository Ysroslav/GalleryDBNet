package com.gallerycrm.entities;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "Sale")

public class Sale implements Serializable, DBObjects {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "picture_id", nullable = false, updatable = true)
    private Long pictureId;
    @Column(name = "prize", nullable = false, updatable = true)
    private double prize;
    boolean editable;

    public Sale(){}

    public void setId(Long id){this.id = id;}
    public void setPictureId(Long pictureId){this.pictureId = pictureId;}
    public void setPrize(double prize){this.prize = prize;}
    public void setEditable(boolean editable){this.editable = editable;}
 

    public Long getId(){return id;}
    public Long getPictureId(){return pictureId;}
    public double getPrize() {
        return prize;
    }
    public boolean getEditable(){return editable;}
}
