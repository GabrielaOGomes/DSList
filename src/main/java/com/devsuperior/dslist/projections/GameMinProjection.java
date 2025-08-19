package com.devsuperior.dslist.projections;

public interface  GameMinProjection {
    
    //métodos que vão retornar os dados do jogo
    //Esses métodos devem ter o mesmo nome dos atributos da classe GameMinDTO
    Long getId();
    
    String getTitle();
    
    Integer getYear();
    
    String getImgUrl();
    
    String getShortDescription();
    
    Integer getPosition();
}
