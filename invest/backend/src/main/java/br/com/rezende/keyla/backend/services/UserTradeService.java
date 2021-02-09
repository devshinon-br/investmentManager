package br.com.rezende.keyla.backend.services;

import br.com.rezende.keyla.backend.model.UserTrade;

import java.util.List;

public interface UserTradeService {
    List<UserTrade> findAll();

    UserTrade findById(Long id);

    UserTrade save(UserTrade userTrade);

    List<UserTrade> findByInstrument(String instrument);
}
