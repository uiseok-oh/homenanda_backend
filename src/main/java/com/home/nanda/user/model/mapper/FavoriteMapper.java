package com.home.nanda.user.model.mapper;

import com.home.nanda.user.model.dto.FavoriteArea;
import com.home.nanda.user.model.dto.FavoriteHouse;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FavoriteMapper {
    List<FavoriteArea> findFavoriteAreas(String userId);

    void registerFavoriteArea(FavoriteArea favoriteArea);

    void deleteFavoriteArea(String areaFavoriteCode);

    List<FavoriteHouse> findFavoriteHouses(String userId);

    void registerFavoriteHouses(FavoriteHouse favoriteHouse);

}
