package fr.baziz.lightecom.entities;

import javax.persistence.ManyToOne;

public class Product {
    private Long id;
    private String name;
    private double currentprice;
    private boolean promotion;
    private boolean selected ;
    private String photoname;

    @ManyToOne
    private Category category;
    
}
