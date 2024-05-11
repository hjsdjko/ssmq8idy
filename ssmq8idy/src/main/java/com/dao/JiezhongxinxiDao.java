package com.dao;

import com.entity.JiezhongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiezhongxinxiVO;
import com.entity.view.JiezhongxinxiView;


/**
 * 接种信息
 * 
 * @author 
 * @email 
 * @date 2022-03-29 10:19:49
 */
public interface JiezhongxinxiDao extends BaseMapper<JiezhongxinxiEntity> {
	
	List<JiezhongxinxiVO> selectListVO(@Param("ew") Wrapper<JiezhongxinxiEntity> wrapper);
	
	JiezhongxinxiVO selectVO(@Param("ew") Wrapper<JiezhongxinxiEntity> wrapper);
	
	List<JiezhongxinxiView> selectListView(@Param("ew") Wrapper<JiezhongxinxiEntity> wrapper);

	List<JiezhongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiezhongxinxiEntity> wrapper);
	
	JiezhongxinxiView selectView(@Param("ew") Wrapper<JiezhongxinxiEntity> wrapper);
	

}
