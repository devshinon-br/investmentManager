package br.com.rezende.keyla.backend.services.servicesImp;

import br.com.rezende.keyla.backend.model.UserTrade;
import br.com.rezende.keyla.backend.repository.UserTradeRepository;
import br.com.rezende.keyla.backend.services.UserTradeService;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserTradeImp implements UserTradeService {

    @Autowired
    UserTradeRepository userTradeRepository;

    @Override
    public List<UserTrade> findAll(){
        return userTradeRepository.findAll();
    }

    @Override
    public UserTrade findById(Long id){
        return userTradeRepository.findById(id).get();
    }

    @Override
    public UserTrade save(UserTrade userTrade){
        return userTradeRepository.save(userTrade);
    }

    @Override
    public List<UserTrade> findByInstrument(String instrument){
        return userTradeRepository.findByInstrument(instrument);
    }

    @Override
    public Long findQuantidadeByInstrumentAndData(String instrument, LocalDate dataInicial, LocalDate dataFinal){
        return userTradeRepository.findQuantidadeByInstrumentAndData(instrument, dataInicial, dataFinal);
    }
}
