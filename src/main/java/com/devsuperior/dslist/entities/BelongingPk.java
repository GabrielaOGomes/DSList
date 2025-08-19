package com.devsuperior.dslist.entities;
import java.util.Objects;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Embeddable;


// Essa classe é usada para mapear a chave primária composta de Belonging
// Ela contém duas chaves estrangeiras: game_id e list_id
@Embeddable
// A anotação @Embeddable indica que esta classe
// pode ser usada como parte de uma chave primária composta
//encapsula dois atributos em uma classe só
public class BelongingPk {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
    //Vai mapear as chaves estrangeiras no bd
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList List;

    public BelongingPk() {
    }

    public BelongingPk(Game game, GameList list) {
        this.game = game;
        this.List = list;
    }   

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return List;
    }

    public void setList(GameList list) {
        List = list;
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, List);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelongingPk other = (BelongingPk) obj;
        return Objects.equals(game, other.game) && Objects.equals(List, other.List);
    }
}


