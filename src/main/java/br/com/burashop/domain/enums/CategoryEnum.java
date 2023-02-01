package br.com.burashop.domain.enums;


public enum CategoryEnum {
    ELECTRONIC("Electronic"),
    TECHNOLOGY("Technology"),
    HEALTH("Health"),
    FASHION("Fashion");


    private String description;

    private CategoryEnum(String category){
        this.description = description;
    }

    private String description(){
        return this.description;
    }
}
