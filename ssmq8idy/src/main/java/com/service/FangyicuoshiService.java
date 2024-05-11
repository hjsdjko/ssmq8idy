package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangyicuoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangyicuoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangyicuoshiView;


/**
 * 防疫措施
 *
 * @author 
 * @email 
 * @date 2022-03-29 10:19:49
 */
public interface FangyicuoshiService extends IService<FangyicuoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangyicuoshiVO> selectListVO(Wrapper<FangyicuoshiEntity> wrapper);
   	
   	FangyicuoshiVO selectVO(@Param("ew") Wrapper<FangyicuoshiEntity> wrapper);
   	
   	List<FangyicuoshiView> selectListView(Wrapper<FangyicuoshiEntity> wrapper);
   	
   	FangyicuoshiView selectView(@Param("ew") Wrapper<FangyicuoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangyicuoshiEntity> wrapper);
   	

}

