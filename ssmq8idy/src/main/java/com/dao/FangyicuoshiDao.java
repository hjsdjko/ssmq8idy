package com.dao;

import com.entity.FangyicuoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangyicuoshiVO;
import com.entity.view.FangyicuoshiView;


/**
 * 防疫措施
 * 
 * @author 
 * @email 
 * @date 2022-03-29 10:19:49
 */
public interface FangyicuoshiDao extends BaseMapper<FangyicuoshiEntity> {
	
	List<FangyicuoshiVO> selectListVO(@Param("ew") Wrapper<FangyicuoshiEntity> wrapper);
	
	FangyicuoshiVO selectVO(@Param("ew") Wrapper<FangyicuoshiEntity> wrapper);
	
	List<FangyicuoshiView> selectListView(@Param("ew") Wrapper<FangyicuoshiEntity> wrapper);

	List<FangyicuoshiView> selectListView(Pagination page,@Param("ew") Wrapper<FangyicuoshiEntity> wrapper);
	
	FangyicuoshiView selectView(@Param("ew") Wrapper<FangyicuoshiEntity> wrapper);
	

}
