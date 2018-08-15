package com.gallerycrm.entities; 



import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Picture")

public class Picture implements Serializable, DBObjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title", length = 255, nullable = false, updatable = true)
    private String title;
    @Column(name = "value", scale = 2, precision = 10)
    private double valueBalance;
    @Column(name = "apostel", length = 255, nullable = false, updatable = true)
    private String apostel;
    boolean editable;

    public Picture(){}


    public void setId(Long id){this.id = id;}
    public void setTitle(String title){this.title = title;}
    public void setValueBalance(double valueBalance){this.valueBalance = valueBalance;}
    public void setApostel(String apostel){this.apostel = apostel;}
    public void setEditable(boolean editable){this.editable = editable;}

    public Long getId(){return id;}
    public String getTitle(){return title;}
    public double getValueBalance(){return valueBalance;}
    public String getApostel(){return apostel;}
    public boolean getEditable(){return editable;}
}
