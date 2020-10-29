package com.br.valhalla.cardrange.model.entity;

import com.br.valhalla.cardrange.model.enumeration.Product;
import lombok.Getter;
import lombok.Setter;

public class Bin {
    @Getter
    @Setter
    private int bin;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Issuer issuer;
    @Getter
    @Setter
    private int binLength;
    @Getter
    @Setter
    private Product product;

}
