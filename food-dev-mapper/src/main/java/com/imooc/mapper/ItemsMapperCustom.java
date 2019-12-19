package com.imooc.mapper;

import com.imooc.pojo.vo.ItemCommentVO;

import com.imooc.pojo.vo.SearchItemsVO;
import com.imooc.pojo.vo.ShopcartVO;
import org.apache.ibatis.annotations.Param;

import java.util.Map;
import java.util.List;
public interface ItemsMapperCustom {

     List<ItemCommentVO> queryItemComments(@Param("paramsMap")Map<String,Object> map);

    List<SearchItemsVO> searchItems(@Param("paramsMap")Map<String,Object> map);


    List<SearchItemsVO> searchItemsByThirdCat(@Param("paramsMap")Map<String,Object> map);

    List<ShopcartVO> queryItemsBySpecIds(@Param("paramsList") List specIdsList);

    int decreaseItemSpecStock(@Param("specId")String specId,
                              @Param("pendingCounts") int pendingCounts);
}