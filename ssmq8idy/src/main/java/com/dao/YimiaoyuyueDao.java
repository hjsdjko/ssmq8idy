package com.dao;

import com.entity.YimiaoyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimiaoyuyueVO;
import com.entity.view.YimiaoyuyueView;


/**
 * 疫苗预约
 * 
 * @author 
 * @email 
 * @date 2022-03-29 10:19:49
 */
public interface YimiaoyuyueDao extends BaseMapper<YimiaoyuyueEntity> {
	
	List<YimiaoyuyueVO> selectListVO(@Param("ew") Wrapper<YimiaoyuyueEntity> wrapper);
	
	YimiaoyuyueVO selectVO(@Param("ew") Wrapper<YimiaoyuyueEntity> wrapper);
	
	List<YimiaoyuyueView> selectListView(@Param("ew") Wrapper<YimiaoyuyueEntity> wrapper);

	List<YimiaoyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<YimiaoyuyueEntity> wrapper);
	
	YimiaoyuyueView selectView(@Param("ew") Wrapper<YimiaoyuyueEntity> wrapper);
	

}
