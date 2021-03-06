package com.winism.winism.service.favoritelist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.winism.winism.dao.favoritelist.FavoritelistDAO;
import com.winism.winism.dao.search.SearchDAO;
import com.winism.winism.dao.wine.WineDAO;
import com.winism.winism.model.favoritelist.FavoritelistEntity;
import com.winism.winism.model.wine.wineList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoritelistService {
    @Autowired
    FavoritelistDAO favodao;

    @Autowired
    WineDAO searchservice;

    public void add(FavoritelistEntity fl){
        favodao.save(fl);
    }

    public void remove(FavoritelistEntity fl){
        favodao.delete(fl);
    }

    public List<FavoritelistEntity>  findByUid(String uid){

        List<FavoritelistEntity> list = favodao.findByUid(uid);

        return list;
    }

}
