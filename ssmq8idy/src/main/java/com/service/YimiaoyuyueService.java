package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YimiaoyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YimiaoyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaoyuyueView;


/**
 * 疫苗预约
 *
 * @author 
 * @email 
 * @date 2022-03-29 10:19:49
 */
public interface YimiaoyuyueService extends IService<YimiaoyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YimiaoyuyueVO> selectListVO(Wrapper<YimiaoyuyueEntity> wrapper);
   	
   	YimiaoyuyueVO selectVO(@Param("ew") Wrapper<YimiaoyuyueEntity> wrapper);
   	
   	List<YimiaoyuyueView> selectListView(Wrapper<YimiaoyuyueEntity> wrapper);
   	
   	YimiaoyuyueView selectView(@Param("ew") Wrapper<YimiaoyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YimiaoyuyueEntity> wrapper);
   	

}

