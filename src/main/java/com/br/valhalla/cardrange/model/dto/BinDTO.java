package com.br.valhalla.cardrange.model.dto;

import com.br.valhalla.cardrange.model.entity.Issuer;
import com.br.valhalla.cardrange.model.enumeration.Product;
import lombok.Getter;
import lombok.Setter;

public class BinDTO {

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
