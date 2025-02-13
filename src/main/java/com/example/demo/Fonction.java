package com.example.demo;

public enum Fonction {
    CHEF_PROJET("blue"),
    DEV_OPS("green"),
    DEV_WEB("purple"),
    DEV_AI("yellow"),
    SOFTWARE_ARCHITECT("orange");
    private final String codeCouleur;


    private Fonction(String codeCouleur) {
        this.codeCouleur = codeCouleur;
    }

    public String getCodeCouleur() {
        return this.codeCouleur;
    }

}
