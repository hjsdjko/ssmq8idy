package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YimiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YimiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaoxinxiView;


/**
 * 疫苗信息
 *
 * @author 
 * @email 
 * @date 2022-03-29 10:19:49
 */
public interface YimiaoxinxiService extends IService<YimiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YimiaoxinxiVO> selectListVO(Wrapper<YimiaoxinxiEntity> wrapper);
   	
   	YimiaoxinxiVO selectVO(@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);
   	
   	List<YimiaoxinxiView> selectListView(Wrapper<YimiaoxinxiEntity> wrapper);
   	
   	YimiaoxinxiView selectView(@Param("ew") Wrapper<YimiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YimiaoxinxiEntity> wrapper);
   	

}

