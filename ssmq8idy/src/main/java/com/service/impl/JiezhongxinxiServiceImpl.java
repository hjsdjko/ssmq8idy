package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiezhongxinxiDao;
import com.entity.JiezhongxinxiEntity;
import com.service.JiezhongxinxiService;
import com.entity.vo.JiezhongxinxiVO;
import com.entity.view.JiezhongxinxiView;

@Service("jiezhongxinxiService")
public class JiezhongxinxiServiceImpl extends ServiceImpl<JiezhongxinxiDao, JiezhongxinxiEntity> implements JiezhongxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiezhongxinxiEntity> page = this.selectPage(
                new Query<JiezhongxinxiEntity>(params).getPage(),
                new EntityWrapper<JiezhongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiezhongxinxiEntity> wrapper) {
		  Page<JiezhongxinxiView> page =new Query<JiezhongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiezhongxinxiVO> selectListVO(Wrapper<JiezhongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiezhongxinxiVO selectVO(Wrapper<JiezhongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiezhongxinxiView> selectListView(Wrapper<JiezhongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiezhongxinxiView selectView(Wrapper<JiezhongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
